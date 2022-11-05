package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.example.model.*;

@WebService(endpointInterface = "com.example.service.WebServiceDisponabilite")
@XmlType(name = "webservicereservation")

public class WebserviceImplService implements WebServiceDisponabilite {
	public Offre offre = new Offre();

	ArrayList<Agence> agences = new ArrayList<Agence>();
	ArrayList<Hotel> hotels = new ArrayList<Hotel>();

	/* CONSTRUCTOR */

	public WebserviceImplService(int i) {
	}

	public WebserviceImplService() throws ParseException {
		/* REMPLSSAGE DE LA LISTES DES AGENCES */
		ArrayList<Hotel> hotelsAgence1 = new ArrayList<Hotel>();
		ArrayList<Hotel> hotelsAgence2 = new ArrayList<Hotel>();
		Agence a1 = new Agence("Agence1", 1, "motdepasse1");
		Agence a2 = new Agence("Agence2", 2, "motdepasse2");

		agences.add(a1);
		agences.add(a2);

		/* REMPLISSAGE HOTELS */
		ArrayList<Chambre> chambres1;
		ArrayList<Chambre> chambres2;
		ArrayList<Chambre> chambres3;
		ArrayList<Chambre> chambres4;
		ArrayList<Chambre> chambres5;

		Hotel hotel1 = new Hotel(1, "ibis", "france", "z", "impasse de l'epi", 43, 3);
		Hotel hotel2 = new Hotel(2, "novotel", "france", "m", "avenue de lodeve", 67, 4);
		Hotel hotel3 = new Hotel(3, "squad", "france", "montpellier", "rue joseph", 43, 2);
		Hotel hotel4 = new Hotel(4, "adagio", "france", "montpellier", "avenue de fes", 43, 3);
		Hotel hotel5 = new Hotel(5, "ac", "france", "montpellier", "square andre de chenier", 43, 5);

		SimpleDateFormat formater = null;
		formater = new SimpleDateFormat("dd-mm-yyyy");
		chambres1 = new ArrayList<Chambre>();
		chambres1.addAll(Arrays.asList(

				new Chambre(1, 1, 2, 45.00, formater.parse("29-11-2021"), 1),
				new Chambre(1, 2, 3, 67.00, formater.parse("30-11-2021"), 1)));
		hotel1.setChambres(chambres1);

		chambres2 = new ArrayList<Chambre>();
		chambres2.addAll(Arrays.asList(new Chambre(2, 3, 2, 55.00, formater.parse("29-12-2021"), 2),
				new Chambre(2, 4, 1, 25.00, formater.parse("12-12-2021"), 3)));
		hotel2.setChambres(chambres2);

		chambres3 = new ArrayList<Chambre>();
		chambres3.addAll(Arrays.asList(new Chambre(3, 9, 2, 56.00, formater.parse("26-12-2021"), 2),
				new Chambre(3, 10, 4, 78.00, formater.parse("20-12-2021"), 1)));
		hotel3.setChambres(chambres3);

		chambres4 = new ArrayList<Chambre>();
		chambres4.addAll(Arrays.asList(new Chambre(4, 5, 2, 69.00, formater.parse("09-12-2021"), 2),
				new Chambre(4, 6, 2, 120.00, formater.parse("07-11-2021"), 4)));
		hotel4.setChambres(chambres4);

		chambres5 = new ArrayList<Chambre>();
		chambres5.addAll(Arrays.asList(new Chambre(5, 7, 2, 45.00, formater.parse("02-11-2021"), 2),
				new Chambre(5, 8, 3, 43.00, formater.parse("11-11-2021"), 1)));
		hotel5.setChambres(chambres5);

		/*-----REMPLISSAGE DE LA LISTES DES HOTELS POUR CHAQUE AGENCE---*/
		hotelsAgence1.add(hotel2);
		hotelsAgence1.add(hotel2);
		hotelsAgence1.add(hotel3);
		hotelsAgence2.add(hotel4);
		hotelsAgence2.add(hotel5);

		a1.setListHotels(hotelsAgence1);
		a2.setListHotels(hotelsAgence2);

		/*-------Remplissage de toute la listes des hotels-------*/

		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);

	}

	public Agence rechercherAgence(int idAgence, String motDePasse) {
		for (Agence a : agences) {
			if (a.getIdAgence() == idAgence && a.getMotDePasseDeAgence().equals(motDePasse)) {
				return a;
			}
		}
		return null;
	}

	public String afficherOffres2(int idAgence, String motDePasse, Date dateDebut, Date dateFin, int nbPers, int nbLits,
			Double prixMin, Double prixMax, String ville) throws Exception {

		String resFonction = new String();
		Agence a1 = rechercherAgence(idAgence, motDePasse);

		if (a1 == null) {
			System.out.println("id ou mot de passe incorrecte");
		} else {
			int idOffre = 0;
			System.out.println("----agence touvee :.." + a1.getNomAgence());
			System.out
					.println("-----------La recherche des hotels correspondantes aux critière donnée  est en cours...");
			ArrayList<Hotel> hotelsTrv = new ArrayList<Hotel>();
			ArrayList<Chambre> resultatChambre = new ArrayList<Chambre>();
			ArrayList<Hotel> hotelsAgence = new ArrayList<Hotel>();
			hotelsAgence = a1.getListHotels();
			System.out.println("size de hotels resultants : " + hotelsAgence.size());
			for (Hotel h : hotelsAgence) {
				System.out.println("l'hotel  trouvée est : " + h.getNomHotel());

				if (h.getVille().equals(ville)) {
					System.out.println("l'hotel  trouvée à la ville  " + ville + " est : " + h.getNomHotel());
					resultatChambre = h.recherche(dateDebut, nbLits, prixMin, prixMax);
					int id = h.getNumero();
					System.out.println("size de chambres resultants : " + resultatChambre.size());
					if (resultatChambre == null)
						System.out.println("Aucune chambre trouvee!!");

					else if (resultatChambre != null) {

						for (Chambre c1 : resultatChambre) {
							System.out.println(
									" On a trouvé un hotel qui correspond à vos criteres entrer dans le main, dans la ville "
											+ ville + "que vous avez choisi" + "\n-Le nom de l'hotel trouvé est  : "
											+ h.getNomHotel());
							System.out.println(
									"-Les informations sur la chambre trouvé selon les critière entrer : \n numero de chambre trouvee : "
											+ c1.getIdChambre() + ", nombre de lits : " + c1.getNbrlits() + " , prix : "
											+ c1.getPrix() + ", date de disponibilité : " + c1.getDateDisponabilite());
							String s1 = " -On a trouvé des offres correspondantes à vos criteres dans la ville " + ville
									+ "que vous avez choisi " + "\nNom de l'hotel : " + h.getNomHotel();
							String s2 = "\n-Les informations sur la chambre trouvé selon vos critères : \n\t numero de chambre trouvee : "
									+ c1.getIdChambre() + ", nombre de lits : " + c1.getNbrlits() + " , prix : "
									+ c1.getPrix() + ", date de disponibilité : " + c1.getDateDisponabilite();

							resFonction = s1 + " " + s2;

							if (c1.getIdHotel() == id) {
								h.setChambreRes(c1);
								hotelsTrv.add(h);
								offre.setIdOffre(idOffre);
								offre.setChambreTrv(c1);
								offre.setHotelTrv(h);
								idOffre++;

							}

						}
					} else
						System.out.println("Aucune chambre trouvé avec vos critières");
				}

			}

		}
		if (resFonction == null)
			throw new Exception("Reteur null de la fonction distribuée");

		return resFonction;
	}

	public Offre getOffre() {
		return offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}

}