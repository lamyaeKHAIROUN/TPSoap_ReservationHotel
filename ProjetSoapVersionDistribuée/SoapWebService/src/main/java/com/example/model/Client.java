package com.example.model;

public class Client {

	private String nom;
	private String prenom;
	private String carteBancaire;

	public Client() {
		super();
	}

	public Client(String nom, String prenom, String carteBancaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.carteBancaire = carteBancaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(String carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

}
