/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anis
 */


import java.time.LocalDate;
public class Facture{
	
// Attributs :
	private Patients patient;
	private float montant; // HT, TVA, ...
	private LocalDate date_emission;
	
// Méthodes :
        
        public Facture(){}
	public Facture(Patients patient,float montant,LocalDate date_emission){
		this.patient=patient;
		this.montant=montant;
		this.date_emission=date_emission;

	}
	
	public float calculer_montant(){
		
		return this.montant;
	}
	public Facture émettre_facture(){
		
		return this;
	}
	
	// Setters and getters
	
	public void setPatient(Patients patient){
		this.patient = patient;
		
	}
	
	public float setMontant(float montant){
		this.montant = montant;
		return montant;
	}
	public void setDateEmission(LocalDate date_emission){
		this.date_emission = date_emission;
		
	}
	
	public Patients getPatient(){ return this.patient;}
	public float getMontant(){ return this.montant;}
	public LocalDate getDateEmission(){ return this.date_emission;}
	

	//affichage 
	public void affichage_facture(){
		patient.affichage_patient();
		System.out.println("Montant a payer:"+montant);
		System.out.println("Date d'emission:"+date_emission);

	}
	
	
}

