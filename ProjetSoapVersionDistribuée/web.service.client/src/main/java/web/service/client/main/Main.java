package web.service.client.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import web.service.client.importer.*;
import web.service.client.importer.Offre;
import web.service.client.reservation.Reservation;
import web.service.client.reservation.*;
import web.service.client.reservation.Client;

public class Main {

	public static void main(String[] args) throws Exception_Exception {
		try {

			// recherche
			URL url = new URL("http://localhost:8080/servicewebSOAPHotel?wsdl");
			WebserviceImplServiceService serviceImpl = new WebserviceImplServiceService(url);
			WebServiceDisponabilite proxy = serviceImpl.getWebserviceImplServicePort();

			// reservation
			URL urlReservation = new URL("http://localhost:8080/webserviceReservation?wsdl");
			WebSeviceReservationImplService serviceReservation = new WebSeviceReservationImplService(urlReservation);
			WebSeviceReservation proxyReservation = serviceReservation.getWebSeviceReservationImplPort();

			XMLGregorianCalendar xmldateDebut = null;
			XMLGregorianCalendar xmldateFin = null;
			GregorianCalendar cDebut = new GregorianCalendar();
			GregorianCalendar cFin = new GregorianCalendar();
			Date dateDebut = new Date(26 - 12 - 2021);
			Date dateFin = new Date(29 - 12 - 2021);
			cDebut.setTime(dateDebut);
			cFin.setTime(dateFin);

			try {
				

				xmldateDebut = DatatypeFactory.newInstance().newXMLGregorianCalendar(cDebut);
				xmldateFin = DatatypeFactory.newInstance().newXMLGregorianCalendar(cFin);


				String resQ = proxy.afficherOffres2(1, "motdepasse1", xmldateDebut, xmldateFin, 2, 2, 40.00, 76.00,
						"montpellier");
				System.out.println("------Resultat du web service de Disponibilité-------: \n" + resQ);

				Offre offreDispo = new Offre();
				offreDispo = proxy.getOffre();

				int idOffre = offreDispo.getIdOffre();
				int idChambre = offreDispo.getChambreTrv().getIdChambre();
				int nbrlits = offreDispo.getChambreTrv().getNbrlits();
				Double prix = offreDispo.getChambreTrv().getPrix();
				int nbrPers = offreDispo.getChambreTrv().getNbrPers();

				Client client = new Client();
				client.setNom("meryam");
				client.setPrenom("lamyae");
				client.setCarteBancaire("MLKJHGFD");

				Reservation r = new Reservation();
				r.setIdReservation(1);
				r.setDateDebutSejour(xmldateDebut);
				r.setDateFinSejour(xmldateFin);
				r.setClient(client);
				r.setInLits(nbrlits);
				r.setInPers(nbrPers);
				r.setPrixNuit(prix);

				String response1 = proxyReservation.ajouterReservation(1, "motdepasse1", r, client, idOffre, idChambre);
				System.out.println("\n\n-------Resultat du service web de la Reservation--------- :\n" + response1);

			} catch (DatatypeConfigurationException e) {
				e.printStackTrace();

			}
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

	}

}
