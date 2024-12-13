package com.daigham.EtudeDeCas.service;

import com.daigham.EtudeDeCas.dao.ChambreRepository;
import com.daigham.EtudeDeCas.dao.ClientRepository;
import com.daigham.EtudeDeCas.dao.ReservationRepository;
import com.daigham.EtudeDeCas.entity.Chambre;
import com.daigham.EtudeDeCas.entity.Client;
import com.daigham.EtudeDeCas.stub.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@GrpcService
public class ReservationServiceGrpcImpl extends ReservationServiceGrpc.ReservationServiceImplBase {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;


    @Override
    public void createReservation(Reservation request, StreamObserver<Reservation> responseObserver) {
        Client client = clientRepository.findById(request.getClient().getId()).orElseThrow(() -> new RuntimeException("Client non trouvé : " + request.getClient().getId()));
        Chambre chambre = chambreRepository.findById(request.getChambre().getId()).orElseThrow(() -> new RuntimeException("Chambre not found with ID: " + request.getChambre().getId()));
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateDebut = dateFormat.parse(request.getDateDebut());
            Date dateFin = dateFormat.parse(request.getDateFin());
            com.daigham.EtudeDeCas.entity.Reservation reservation = new com.daigham.EtudeDeCas.entity.Reservation();
            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(dateDebut);
            reservation.setDateFin(dateFin);
            reservation.setPreferences(request.getPreferences());
            com.daigham.EtudeDeCas.entity.Reservation savedReservation = reservationRepository.save(reservation);
            Reservation grpcReservation = Reservation.newBuilder()
                    .setId(savedReservation.getId())
                    .setClient(
                            com.daigham.EtudeDeCas.stub.Client.newBuilder()
                                    .setId(client.getId())
                                    .setNom(client.getNom())
                                    .setPrenom(client.getPrenom())
                                    .setEmail(client.getEmail())
                                    .setTelephone(client.getTelephone())
                                    .build()
                    )
                    .setChambre(
                            com.daigham.EtudeDeCas.stub.Chambre.newBuilder()
                                    .setId(chambre.getId())
                                    .setType(chambre.getType())
                                    .setPrix(chambre.getPrix())
                                    .setDisponible(chambre.getDisponible())
                                    .build()
                    )
                    .setDateDebut(request.getDateDebut())
                    .setDateFin(request.getDateFin())
                    .setPreferences(savedReservation.getPreferences())
                    .build();
            responseObserver.onNext(grpcReservation);
            responseObserver.onCompleted();
        } catch (ParseException e) {
            responseObserver.onError(
                    Status.INVALID_ARGUMENT.withDescription("Invalid date format: " + e.getMessage())
                            .asRuntimeException()
            );
        } catch (Exception e) {
            responseObserver.onError(
                    Status.INTERNAL.withDescription("Error creating reservation: " + e.getMessage())
                            .asRuntimeException()
            );
        }
    }

    @Override
    public void listReservations(Empty request, StreamObserver<ReservationList> responseObserver) {
        List<com.daigham.EtudeDeCas.entity.Reservation> reservations = reservationRepository.findAll();
        ReservationList.Builder responseBuilder = ReservationList.newBuilder();
        for (com.daigham.EtudeDeCas.entity.Reservation reservation : reservations) {
            Reservation grpcReservation = Reservation.newBuilder()
                    .setId(reservation.getId())
                    .setClient(
                            com.daigham.EtudeDeCas.stub.Client.newBuilder()
                                    .setId(reservation.getClient().getId())
                                    .setNom(reservation.getClient().getNom())
                                    .setPrenom(reservation.getClient().getPrenom())
                                    .setEmail(reservation.getClient().getEmail())
                                    .setTelephone(reservation.getClient().getTelephone())
                                    .build()
                    )
                    .setChambre(
                            com.daigham.EtudeDeCas.stub.Chambre.newBuilder()
                                    .setId(reservation.getChambre().getId())
                                    .setType(reservation.getChambre().getType())
                                    .setPrix(reservation.getChambre().getPrix())
                                    .setDisponible(reservation.getChambre().getDisponible())
                                    .build()
                    )
                    .setDateDebut(reservation.getDateDebut().toString())
                    .setDateFin(reservation.getDateFin().toString())
                    .setPreferences(reservation.getPreferences())
                    .build();

            responseBuilder.addReservations(grpcReservation);

        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();


    }

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        try {
            reservationRepository.deleteById(request.getId());
            DeleteReservationResponse response = DeleteReservationResponse.newBuilder()
                    .setMessage("Reservation with ID " + request.getId() + " was successfully deleted.")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Error deleting reservation with ID: " + request.getId())
                            .augmentDescription(e.getMessage())
                            .asRuntimeException()
            );
        }
    }

    @Override
    public void getReservationById(GetReservationRequest request, StreamObserver<Reservation> responseObserver) {
        try {

            com.daigham.EtudeDeCas.entity.Reservation reservationEntity =
                    reservationRepository.findById(request.getId())
                            .orElseThrow(() -> new RuntimeException("Reservation not found with ID: " + request.getId()));

            Reservation grpcReservation = Reservation.newBuilder()
                    .setId(reservationEntity.getId())
                    .setClient(
                            com.daigham.EtudeDeCas.stub.Client.newBuilder()
                                    .setId(reservationEntity.getClient().getId())
                                    .setNom(reservationEntity.getClient().getNom())
                                    .setPrenom(reservationEntity.getClient().getPrenom())
                                    .setEmail(reservationEntity.getClient().getEmail())
                                    .setTelephone(reservationEntity.getClient().getTelephone())
                                    .build()
                    )
                    .setChambre(
                            com.daigham.EtudeDeCas.stub.Chambre.newBuilder()
                                    .setId(reservationEntity.getChambre().getId())
                                    .setType(reservationEntity.getChambre().getType())
                                    .setPrix(reservationEntity.getChambre().getPrix())
                                    .setDisponible(reservationEntity.getChambre().getDisponible())
                                    .build()
                    )
                    .setDateDebut(reservationEntity.getDateDebut().toString())
                    .setDateFin(reservationEntity.getDateFin().toString())
                    .setPreferences(reservationEntity.getPreferences())
                    .build();

            responseObserver.onNext(grpcReservation);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("Reservation not found with ID: " + request.getId())
                            .augmentDescription(e.getMessage())
                            .augmentDescription(e.getMessage())
                            .asRuntimeException()
            );
        }
    }

    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<Reservation> responseObserver) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateDebut = dateFormat.parse(request.getReservation().getDateDebut());
            Date dateFin = dateFormat.parse(request.getReservation().getDateFin());
            com.daigham.EtudeDeCas.entity.Reservation reservationEntity =
                    reservationRepository.findById(request.getId())
                            .orElseThrow(() -> new RuntimeException("Reservation not found with ID: " + request.getId()));

            reservationEntity.setDateDebut(dateDebut);
            reservationEntity.setDateFin(dateFin);
            reservationEntity.setPreferences(request.getReservation().getPreferences());

            if (request.getReservation().getClient().getId() != reservationEntity.getClient().getId()) {
                Client client = clientRepository.findById(request.getReservation().getClient().getId())
                        .orElseThrow(() -> new RuntimeException("Client not found with ID: " + request.getReservation().getClient().getId()));
                reservationEntity.setClient(client);
            }

            if (request.getReservation().getChambre().getId() != reservationEntity.getChambre().getId()) {
                Chambre chambre = chambreRepository.findById(request.getReservation().getChambre().getId())
                        .orElseThrow(() -> new RuntimeException("Chambre not found with ID: " + request.getReservation().getChambre().getId()));
                reservationEntity.setChambre(chambre);
            }

            com.daigham.EtudeDeCas.entity.Reservation updatedReservation = reservationRepository.save(reservationEntity);

            Reservation grpcReservation = Reservation.newBuilder()
                    .setId(updatedReservation.getId())
                    .setClient(
                            com.daigham.EtudeDeCas.stub.Client.newBuilder()
                                    .setId(updatedReservation.getClient().getId())
                                    .setNom(updatedReservation.getClient().getNom())
                                    .setPrenom(updatedReservation.getClient().getPrenom())
                                    .setEmail(updatedReservation.getClient().getEmail())
                                    .setTelephone(updatedReservation.getClient().getTelephone())
                                    .build()
                    )
                    .setChambre(
                            com.daigham.EtudeDeCas.stub.Chambre.newBuilder()
                                    .setId(updatedReservation.getChambre().getId())
                                    .setType(updatedReservation.getChambre().getType())
                                    .setPrix(updatedReservation.getChambre().getPrix())
                                    .setDisponible(updatedReservation.getChambre().getDisponible())
                                    .build()
                    )
                    .setDateDebut(updatedReservation.getDateDebut().toString())
                    .setDateFin(updatedReservation.getDateFin().toString())
                    .setPreferences(updatedReservation.getPreferences())
                    .build();

            responseObserver.onNext(grpcReservation);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Error updating reservation with ID: " + request.getId())
                            .augmentDescription(e.getMessage())
                            .asRuntimeException()
            );
        }
    }
}
