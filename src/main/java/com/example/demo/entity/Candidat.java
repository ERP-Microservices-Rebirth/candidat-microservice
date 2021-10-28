package com.example.demo.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidat")
public class Candidat  {
	
	@Id
	private String id;
	private String nom;
	private String prenom;
	private int NombreTelephone;
	private String experience;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getNombreTelephone() {
		return NombreTelephone;
	}
	public void setNombreTelephone(int nombreTelephone) {
		NombreTelephone = nombreTelephone;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Candidat(String id, String nom, String prenom, int nombreTelephone, String experience) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		NombreTelephone = nombreTelephone;
		this.experience = experience;
	}
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Candidat [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", NombreTelephone=" + NombreTelephone
				+ ", experience=" + experience + "]";
	}
	
}

