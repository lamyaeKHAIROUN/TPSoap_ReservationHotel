package com.example.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.model.Chambre;
import com.example.model.Client;
import com.example.model.Offre;
import com.example.model.Reservation;

@WebService
public interface webSeviceReservation {

	@WebMethod
	public String ajouterReservation(int idAgence, String motDePasse, Reservation r, Client client, int idOffre,
			int idChambre);

	@WebMethod
	public String supprimerReservation(Reservation r);

}
