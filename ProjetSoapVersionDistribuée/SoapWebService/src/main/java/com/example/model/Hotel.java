package com.example.model;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

public class Hotel {
	private int idHotel;
	private String nomHotel;
	ArrayList<Chambre> listChambres;
	Chambre chambreRes;

	public Chambre getChambreRes() {
		return chambreRes;
	}

	public void setChambreRes(Chambre chambreRes) {
		this.chambreRes = chambreRes;
	}

	public Hotel(int numero, String nomHotel, ArrayList<Chambre> c, String pays, String ville, String rue,
			int positionGps, int nbEtoile) {
		super();
		this.idHotel = numero;
		this.nomHotel = nomHotel;
		this.listChambres = c;
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.positionGps = positionGps;
		this.nbEtoile = nbEtoile;
	}

	private String pays;
	private String ville;
	private String rue;
	private int positionGps;
	private int nbEtoile;

	public void setChambres(ArrayList<Chambre> chambres) {
		this.listChambres = chambres;
	}

	public Hotel() {
	}

	public Hotel(int numero, String nomHotel, String pays, String ville, String rue, int positionGps, int nbEtoile) {
		super();
		this.idHotel = numero;
		this.nomHotel = nomHotel;
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.positionGps = positionGps;
		this.nbEtoile = nbEtoile;
	}

	public int getNumero() {
		return idHotel;
	}

	public void setNumero(int numero) {
		this.idHotel = numero;
	}

	public ArrayList<Chambre> getListeChambre() {
		return listChambres;
	}

	public void setListeChambre(ArrayList<Chambre> listeChambre) {
		this.listChambres = listeChambre;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getPositionGps() {
		return positionGps;
	}

	public void setPositionGps(int positionGps) {
		this.positionGps = positionGps;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;

	}

	public ArrayList<Chambre> recherche(Date dateDebut, int nbLits, Double prixMin, Double prixMax) throws Exception {
		ArrayList<Chambre> cc = new ArrayList<Chambre>();
		ArrayList<Chambre> c1 = new ArrayList<Chambre>();
		c1 = this.getListeChambre();

		for (Chambre c : c1) {
			if (/* c.getDateDisponabilite().equals(dateDebut) && */c.getPrix() >= prixMin && c.getPrix() <= prixMax
					&& c.getNbrlits() == nbLits) {
				System.out.println("chambre trouver ");
				cc.add(c);
			}

			else {
				System.out.println("condition non trouver");
			}

		}

		return cc;

	}
}
