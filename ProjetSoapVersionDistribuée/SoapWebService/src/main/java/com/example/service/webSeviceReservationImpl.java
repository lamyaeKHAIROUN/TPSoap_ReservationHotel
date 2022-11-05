package com.example.service;

import java.util.ArrayList;
import javax.jws.WebService;
import com.example.model.Chambre;
import com.example.model.Client;
import com.example.model.Reservation;

@WebService(endpointInterface = "com.example.service.webSeviceReservation")
public class webSeviceReservationImpl implements webSeviceReservation {

	public Chambre chambre;

	public String supprimerReservation(Reservation r) {
		ArrayList<Reservation> reservations = chambre.getReservations();
		if (reservations == null)
			return "Il y a auccune reservation en cours pour cette chambre\n";
		else {
			reservations.remove(r);
			return "La suppression de la reservation en cours est bien effectuée\n";
		}
	}

	public String ajouterReservation(int idAgence, String motDePasse, Reservation r, Client client, int idOffre,
			int idChambre) {
		r.setClient(client);
		chambre.setIdChambre(idChambre);
		chambre.setPrix(r.getPrixNuit());
		chambre.setNbrlits(r.getInLits());
		chambre.setNbrPers(r.getInPers());

		ArrayList<Reservation> reservations = chambre.getReservations();
		if (chambre.getEstDispo() == true) {
			reservations.add(r);
			chambre.setReservations(reservations);
			chambre.setEstDispo(false);
			return "Reservation de la chambre " + chambre.getIdChambre() + " est bien effectuée pour le client "
					+ client.getPrenom() + " " + client.getNom() + "\n-nombre de lits : " + chambre.getNbrlits()
					+ "\n Nombre d epersonnes : " + chambre.getNbrPers() + "\nPrix par nuit: " + chambre.getPrix();
		} else {
			return "Chambre non disponible \n ";
		}
	}

	public webSeviceReservationImpl(Chambre chambre) {
		this.chambre = chambre;
	}

	public webSeviceReservationImpl() {
		chambre = new Chambre();
	}

}
