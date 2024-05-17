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


public class RendezVous {
    private LocalDate date;
    private LocalTime heure;
    private Patients patient;
   
    public RendezVous() {
    // Initialise la date et l'heure avec des valeurs par défaut
    this.date = LocalDate.now();
    this.heure = LocalTime.now();
    this.patient = null; // Initialise le patient à null
}

    public RendezVous(LocalDate date, LocalTime heure, Patients patient) {
        this.date = date;
        this.heure = heure;
        this.patient = patient;
        
    } 
    public LocalDate getDate() {
        return this.date;
    }
    public LocalTime getHeure() {
        return this.heure;
    }
    public Patients getPatient() {
        return this.patient;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }
    public void setPatient(Patients patient) {
        this.patient = patient;
    }

}
