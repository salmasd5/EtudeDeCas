package com.daigham.EtudeDeCas.entity;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Reservations")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReservationsWrapper {

    @XmlElement(name = "Reservation")
    private List<Reservation> reservations;

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
