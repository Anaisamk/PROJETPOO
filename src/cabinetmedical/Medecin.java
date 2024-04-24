/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anais
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Medecin{
    private String nom;
    private String prenom;
    private GestionRdv agenda;   

    //constructeur
    public Medecin(String nom,String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.agenda = new GestionRdv(); 
    }



   //geters
   public String getnom(){
    return nom;
   }

   public String getprenom(){
    return prenom;
   }

public GestionRdv getagenda(){
    return agenda;
}

//setters

public void setnom(String nom) {
    this.nom = nom;
}

public void setprenom(String prenom) {
    this.prenom = prenom;
}

public void setagenda(GestionRdv agenda) {
    this.agenda = agenda;
}

//methode qui ajoute un rendez vous a l'agenda
public void ajoutRDV(LocalDate date,LocalTime heure,Patients patient){
    agenda.planifierRdv(date,heure,patient);    
}

//methode qui suprime un rendez vous de l'agenda
public void supressionRDV(LocalDate date,LocalTime heure){
    agenda.supprimerRendezVous(date,heure);    
}

//affichage
public void affichagemedecin(){
    System.out.println(nom);
    System.out.println(prenom);
    agenda.afficherRdvChronologique();   

}
}
