package com.example.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;

public class Reservation {
	private int idReservation;
	private Date dateDebutSejour;
	private Date dateFinSejour;
	private int inLits;
	private int inPers;
	private Double prixTotal;
	private Client client;

	public Reservation() {
	}

	public Double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getPrixNuit() {
		return prixTotal;
	}

	public void setPrixNuit(Double prixNuit) {
		this.prixTotal = prixNuit;
	}

	public int getInPers() {
		return inPers;
	}

	public void setInPers(int inPers) {
		this.inPers = inPers;
	}

	public int getInLits() {
		return inLits;
	}

	public void setInLits(int inLits) {
		this.inLits = inLits;
	}

	public Reservation(int idReservation, Date dateDebutSejour, Date dateFinSejour, Client client, Double prixTotal) {
		super();
		this.idReservation = idReservation;
		this.dateDebutSejour = dateDebutSejour;
		this.dateFinSejour = dateFinSejour;
		this.client = client;
		this.prixTotal = prixTotal;

	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateDebutSejour() {
		return dateDebutSejour;
	}

	public void setDateDebutSejour(Date dateDebutSejour) {
		this.dateDebutSejour = dateDebutSejour;
	}

	public Date getDateFinSejour() {
		return dateFinSejour;
	}

	public void setDateFinSejour(Date dateFinSejour) {
		this.dateFinSejour = dateFinSejour;
	}

}