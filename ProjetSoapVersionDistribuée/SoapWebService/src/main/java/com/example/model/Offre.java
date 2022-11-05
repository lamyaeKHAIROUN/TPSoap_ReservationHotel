package com.example.model;


public class Offre {
	/* ATTRIBUT */
	
	
	private int idOffre;
	private Chambre chambreTrv;
	public Offre(int idOffre, Chambre chambreTrv, Hotel hotelTrv) {
		super();
		this.idOffre = idOffre;
		this.chambreTrv = chambreTrv;
		this.hotelTrv = hotelTrv;
	}

	public Chambre getChambreTrv() {
		return chambreTrv;
	}

	public void setChambreTrv(Chambre chambreTrv) {
		this.chambreTrv = chambreTrv;
	}

	public Hotel getHotelTrv() {
		return hotelTrv;
	}

	public void setHotelTrv(Hotel hotelTrv) {
		this.hotelTrv = hotelTrv;
	}

	private Hotel hotelTrv;
	
   /* CONSTRUCTOR*/
   public Offre() {}
   
   /*GETERS AND SETERS */
  
	public int getIdOffre() {
		return idOffre;
	}
   
 
	public void setIdOffre(int idOffres) {
		this.idOffre = idOffres;
	}




	
	

}
