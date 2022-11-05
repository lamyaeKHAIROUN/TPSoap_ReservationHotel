package com.example.model;

import java.util.ArrayList;
import java.util.Date;


public class Recherche {
	private ArrayList<Hotel> hotels;

	public ArrayList<Hotel> getHotels() {

		return hotels;
	}

	public void setHotels(ArrayList<Hotel> hotels) {
		this.hotels = hotels;
	}

	public ArrayList<Hotel> chercherHotels(String ville, Date dateDebut, int nbLits, Double prixMin, Double prixMax)
			throws Exception {

		System.out.println("-----------La recherche des hotels correspondantes aux critière donnée  est en cours...");
		ArrayList<Hotel> hotelsTrv = new ArrayList<Hotel>();
		ArrayList<Chambre> resultatChambre;
		ArrayList<Hotel> h2 = new ArrayList<Hotel>();
		for (Hotel h : hotels) {
			if (h.getVille().equals(ville)) {
				resultatChambre = h.recherche(dateDebut, nbLits, prixMin, prixMax);
				int id = h.getNumero();

				if (resultatChambre != null) {

					for (Chambre c1 : resultatChambre) {
						System.out.println(
								" On a trouvé un hotel qui correspond à vos criteres entrer dans le main, dans la ville "
										+ ville + "que vous avez choisi" + "\n-Le nom de l'hotel trouvé est  : "
										+ h.getNomHotel());
						System.out.println(
								"-Les informations sur la chambre trouvé selon les critière entrer : \n numero de chambre trouvee : "
										+ c1.getIdChambre() + ", nombre de lits : " + c1.getNbrlits() + " , prix : "
										+ c1.getPrix() + ", date de disponibilité : " + c1.getDateDisponabilite());

						if (c1.getIdHotel() == id) {
							hotelsTrv.add(h);
							h.setChambreRes(c1);
						}

					}
				} else
					System.out.println("Aucune chambre trouvé avec vos critières");
			}

		}

		return hotelsTrv;
	}

	public Recherche(ArrayList<Hotel> hotels) {
		super();
		this.hotels = hotels;
	}

	public Recherche() {
		super();
	}

}