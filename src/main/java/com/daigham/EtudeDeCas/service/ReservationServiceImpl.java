package com.daigham.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daigham.EtudeDeCas.dao.ChambreRepository;
import com.daigham.EtudeDeCas.dao.ClientRepository;
import com.daigham.EtudeDeCas.dao.ReservationRepository;
import com.daigham.EtudeDeCas.dto.ReservationDTO;
import com.daigham.EtudeDeCas.entity.Chambre;
import com.daigham.EtudeDeCas.entity.Client;
import com.daigham.EtudeDeCas.entity.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation saveReservation(ReservationDTO reservationDTO) {
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

    @Override
    public Reservation updateReservation(Long id, ReservationDTO reservationDTO) {
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

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }


}
