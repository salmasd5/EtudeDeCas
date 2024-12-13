package com.daigham.EtudeDeCas.service;

import com.daigham.EtudeDeCas.dao.ChambreRepository;
import com.daigham.EtudeDeCas.dao.ClientRepository;
import com.daigham.EtudeDeCas.dao.ReservationRepository;
import com.daigham.EtudeDeCas.dto.ReservationDTO;
import com.daigham.EtudeDeCas.entity.Chambre;
import com.daigham.EtudeDeCas.entity.Client;
import com.daigham.EtudeDeCas.entity.Reservation;
import com.daigham.EtudeDeCas.entity.ReservationsWrapper;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "ReservationWS")
public class ReservationSOAPService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @WebMethod
    public ReservationsWrapper getAllReservations() {
        ReservationsWrapper wrapper = new ReservationsWrapper();
        wrapper.setReservations(reservationRepository.findAll());
        return wrapper;
    }

    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id")Long id) {
        return reservationRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Reservation %s n'est pas trouvé ",id)));
    }

    @WebMethod
    public Reservation saveReservation(@WebParam(name = "reservation")ReservationDTO reservationDTO) {
        Client client = clientRepository.findById(reservationDTO.getClientId())
                .orElseThrow(() -> new RuntimeException("Client not found with id " + reservationDTO.getClientId()));

        Chambre chambre = chambreRepository.findById(reservationDTO.getChambreId())
                .orElseThrow(() -> new RuntimeException("Chambre not found with id " + reservationDTO.getChambreId()));

        if (!chambre.getDisponible()) {
            throw new RuntimeException("Chambre is not available");
        }
        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(reservationDTO.getDateDebut());
        reservation.setDateFin(reservationDTO.getDateFin());
        reservation.setPreferences(reservationDTO.getPreferences());

        return reservationRepository.save(reservation);
    }
    @WebMethod
    public Reservation updateReservation(@WebParam(name = "id")Long id,@WebParam(name = "reservation") ReservationDTO reservationDTO) {
        return reservationRepository.findById(id).map(reservation -> {
            Client client = clientRepository.findById(reservationDTO.getClientId())
                    .orElseThrow(() -> new RuntimeException("Client not found with id " + reservationDTO.getClientId()));

            Chambre chambre = chambreRepository.findById(reservationDTO.getChambreId())
                    .orElseThrow(() -> new RuntimeException("Chambre not found with id " + reservationDTO.getChambreId()));

            if (!chambre.getDisponible()) {
                throw new RuntimeException("Chambre is not available");
            }

            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(reservationDTO.getDateDebut());
            reservation.setDateFin(reservationDTO.getDateFin());
            reservation.setPreferences(reservationDTO.getPreferences());

            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new RuntimeException("Reservation not found with id " + id));
    }
    @WebMethod
    public String deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return "Reservation with ID " + id + " was successfully deleted.";
        } else {
            return "Reservation with ID " + id + " does not exist.";
        }
    }

}
