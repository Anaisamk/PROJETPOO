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
    private String etat;
    
    public RendezVous(LocalDate date, LocalTime heure, Patients patient, String etat) {
        this.date = date;
        this.heure = heure;
        this.patient = patient;
        this.etat = etat;
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
    public String getEtat() {
        return this.etat;
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
    public void setEtat(String etat) {
        this.etat = etat;
    }
}
