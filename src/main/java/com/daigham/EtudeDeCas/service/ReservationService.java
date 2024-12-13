package com.daigham.EtudeDeCas.service;

import java.util.List;
import java.util.Optional;

import com.daigham.EtudeDeCas.dto.ReservationDTO;
import com.daigham.EtudeDeCas.entity.Reservation;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Optional<Reservation> getReservationById(Long id);
    Reservation saveReservation(ReservationDTO reservationDTO);
    Reservation updateReservation(Long id, ReservationDTO reservationDTO);
    void deleteReservation(Long id);
}
