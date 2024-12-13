package com.daigham.EtudeDeCas.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class ReservationDTO {
	private Long clientId;
    private Long chambreId;
	@Temporal(TemporalType.DATE)
    private Date dateDebut;
	@Temporal(TemporalType.DATE)
    private Date dateFin;
    private String preferences;
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public Long getChambreId() {
		return chambreId;
	}
	public void setChambreId(Long chambreId) {
		this.chambreId = chambreId;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getPreferences() {
		return preferences;
	}
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
}
