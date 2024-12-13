package com.daigham.EtudeDeCas.controller;

import com.daigham.EtudeDeCas.dao.ChambreRepository;
import com.daigham.EtudeDeCas.dao.ClientRepository;
import com.daigham.EtudeDeCas.dao.ReservationRepository;
import com.daigham.EtudeDeCas.dto.ReservationGraphQLDTO;
import com.daigham.EtudeDeCas.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ReservationGraphQLController {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    @QueryMapping
    public List<Reservation> reservationList() {
        return reservationRepository.findAll();
    }

    @QueryMapping
    public Reservation reservationById(@Argument Long id) {
        return reservationRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("Reservation %s n'est pas trouvé", id)));
    }
    @MutationMapping
    public Reservation saveReservation(@Argument ReservationGraphQLDTO reservationDTO) {
        try {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDebut = formatter.parse(reservationDTO.getDateDebut());
        Date dateFin = formatter.parse(reservationDTO.getDateFin());
        Reservation reservation = new Reservation();
        reservation.setId(reservationDTO.getId());
        reservation.setChambre(chambreRepository.findById(reservationDTO.getChambreId()).orElseThrow(() -> new RuntimeException(String.format("Chambre %s n'est pas trouvé", reservationDTO.getChambreId()))));
        reservation.setClient(clientRepository.findById(reservationDTO.getClientId()).orElseThrow(() -> new RuntimeException(String.format("Client %s n'est pas trouvé", reservationDTO.getClientId()))));
        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
        reservation.setPreferences(reservationDTO.getPreferences());
        return reservationRepository.save(reservation);
        }catch (ParseException e){
            throw new RuntimeException(" date format n'est pas valide: Utilise 'yyyy-MM-dd'", e);
        }

    }
    @MutationMapping
    public Reservation updateReservation(@Argument Long id,@Argument ReservationGraphQLDTO reservationDTO) {
        Reservation ex_reservation=reservationRepository.findById(id).orElseThrow(()->new RuntimeException("Utilisateur n'est pas trouvé"));
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date dateDebut = formatter.parse(reservationDTO.getDateDebut());
            Date dateFin = formatter.parse(reservationDTO.getDateFin());
            ex_reservation.setChambre(chambreRepository.findById(reservationDTO.getChambreId()).orElseThrow(() -> new RuntimeException(String.format("Chambre %s n'est pas trouvé", reservationDTO.getChambreId()))));
            ex_reservation.setClient(clientRepository.findById(reservationDTO.getClientId()).orElseThrow(() -> new RuntimeException(String.format("Client %s n'est pas trouvé", reservationDTO.getClientId()))));
            ex_reservation.setDateDebut(dateDebut);
            ex_reservation.setDateFin(dateFin);
            ex_reservation.setPreferences(reservationDTO.getPreferences());
            return reservationRepository.save(ex_reservation);
        }catch (ParseException e){
            throw new RuntimeException(" date format n'est pas valide: Utilise 'yyyy-MM-dd'", e);
        }

    }
    @MutationMapping
    public String deleteReservation(@Argument int id) {
        try {
            if (!reservationRepository.existsById((long) id)) {
                throw new RuntimeException("Reservation " + id + " n'est pas trouvé");
            }

            reservationRepository.deleteById((long) id);
            return "Reservation " + id + " est supprimé";
        } catch (Exception e) {
            throw new RuntimeException("Erreur: " + e.getMessage(), e);
        }
    }

}
