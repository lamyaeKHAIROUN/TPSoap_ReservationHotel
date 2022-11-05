package com.example.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.example.model.*;

@WebService
public interface WebServiceDisponabilite {
	@WebMethod
	String afficherOffres2(int idAgence, String motDePasse, Date dateDebut, Date dateFin, int nbPers,int nbLits,Double prixMin,Double prixMax, String ville) throws Exception ;
	@WebMethod
	public Offre getOffre();
	@WebMethod
	public void setOffre(Offre offre);
}
