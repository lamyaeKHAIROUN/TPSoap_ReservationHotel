package com.example.model;

import java.util.ArrayList;


public class Agence {

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	private String nomAgence;
	private int idAgence;
	private String motDePasseDeAgence;

	public ArrayList<Hotel> getListHotels() {
		return listHotels;
	}

	public void setListHotels(ArrayList<Hotel> listHotels) {
		this.listHotels = listHotels;
	}

	ArrayList<Hotel> listHotels = new ArrayList<Hotel>();

	public Agence() {
	}

	public Agence(String nomAgence, int idAgence, String motDePasseDeAgence) {
		super();
		this.nomAgence = nomAgence;
		this.idAgence = idAgence;
		this.motDePasseDeAgence = motDePasseDeAgence;

	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public String getMotDePasseDeAgence() {
		return motDePasseDeAgence;
	}

	public void setMotDePasseDeAgence(String motDePasseDeAgence) {
		this.motDePasseDeAgence = motDePasseDeAgence;
	}

}