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
    public Patients patient;
    private String traitements; 
    private String diagnostic;
    public Prescription prescription; 


    //constructeur
    
    public DossierMedical(){
        num_dossier = 0;
        patient = null;
        traitements ="";
        diagnostic = "";
        prescription = null;
    }
    public DossierMedical(int num_dossier,Patients patient,String traitements,String diagnostic,Prescription prescription){
        this.num_dossier = num_dossier;
        this.patient = patient;
        this.traitements = traitements;
        this.diagnostic = diagnostic;
        this.prescription = prescription;
    }
    //geters
    public int get_num_dossier(){
        return num_dossier;
    }
    public Patients get_patient(){
        return patient;
    }
    public String get_traitements(){
        return traitements;
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
    public void set_traitements(String traitements) {
        this.traitements = traitements;
    }
    public void set_diagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void set_prescription(Prescription prescription) {
        this.prescription = prescription;  
    }

  
    

    //affichage du dossier medical
    public void afficher_dossier_medical(){
        System.out.println("numero du dossier:"+num_dossier);
        patient.affichage_patient();
        System.out.println("historique des traitements:"+traitements);
        System.out.println("diagnostic:"+diagnostic);
        prescription.affichge_prescription(); 
    }

    public int getPatientNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
