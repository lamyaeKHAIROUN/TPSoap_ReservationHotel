package com.example.model;

import java.util.ArrayList;
import java.util.Date;

public class Chambre {

	private int idHotel;
	private int idChambre;
	private int nbrlits;
	private Double prix;
	private Date dateDisponabilite;
	private int nbrPers;
	private boolean estDispo = true;
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	public void setEstDispo(boolean estDispo) {
		this.estDispo = estDispo;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	public int getNbrPers() {
		return nbrPers;
	}

	public void setNbrPers(int nbrPers) {
		this.nbrPers = nbrPers;
	}

	public boolean getEstDispo() {
		return estDispo;
	}

	public Chambre(int idChambre, int nbrlits) {
		super();
		this.idChambre = idChambre;
		this.nbrlits = nbrlits;
	}

	public Chambre() {
	}

	public Chambre(int idHotel, int idChambre, int nbrlits, Double prix, Date dateDisponabilite, int nbrPers) {
		super();
		this.idChambre = idChambre;
		this.nbrlits = nbrlits;
		this.prix = prix;
		this.dateDisponabilite = dateDisponabilite;
		this.nbrPers = nbrPers;
		this.idHotel = idHotel;

	}

	public int getIdChambre() {
		return this.idChambre;
	}

	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}

	public int getNbrlits() {
		return this.nbrlits;
	}

	public void setNbrlits(int nbrlits) {
		this.nbrlits = nbrlits;
	}

	public Double getPrix() {
		return this.prix;
	}

	public void setPriDouble(Double prix) {
		this.prix = prix;

	}

	public Date getDateDisponabilite() {
		return this.dateDisponabilite;
	}

	public void setDateDisponabilite(Date dateDisponabilite) {
		this.dateDisponabilite = dateDisponabilite;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public boolean isEstDispo() {
		return estDispo;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Chambre getChambreById(ArrayList<Chambre> listChambre, int id) {
		for (Chambre c1 : listChambre) {
			if (c1.getIdChambre() == id) {
				return c1;
			}
		}

		return null;
	}

	public int calculerDuree(Date dateDebut, Date dateFin) {
		return dateDebut.getDate() - dateFin.getDate();
	}

	public Double prixTotale(int duree, Double prix) {
		return duree * prix;
	}

}