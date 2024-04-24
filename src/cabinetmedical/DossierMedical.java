/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anais
 */
public class DossierMedical{
    private int num_dossier;
    private Patients patient;
     //besoin de la classe
    private String diagnostic;
    private Prescription prescription; //besoin de la classe prescription


    //constructeur
    public DossierMedical(int num_dossier,Patients patient,String diagnostic,Prescription prescription){
        this.num_dossier = num_dossier;
        this.patient = patient;
        // besoin de la classe historique_traitements
        this.diagnostic = diagnostic;
        this.prescription = prescription; // besoin de la classe prescription
    }

    //geters
    public int get_num_dossier(){
        return num_dossier;
    }
    public Patients get_patient(){
        return patient;
    }

    public String get_diagnostic(){
        return diagnostic;
    }
    public Prescription get_Prescription() {
        return prescription;
    }

    //seters
    public void set_num_dossier(int num_dossier) {
        this.num_dossier = num_dossier;
    }
    public void set_patient(Patients patient) {
        this.patient = patient;
    }

    public void set_diagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void set_prescription(Prescription prescription) {
        this.prescription = prescription;  
    }

    //ajouter un traitement


    //affichage du dossier medical
    public void afficher_dossier_medical(){
        patient.affichage_patient();
       //on a besoin de la classe
        System.out.println("diagnostic:"+diagnostic);
         //besoin de la classe
    }




}
