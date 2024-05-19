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
public class Consultation {
    // Attributs
    private Patients patient;
    private LocalDate date;
    private LocalTime heure;
    private String symptomes;
    private String diagnostic;
    private String resultatsExamens;
    private Prescription prescription;

    // Constructeur
    public Consultation(Patients patient, LocalDate date, LocalTime heure, String symptomes, String diagnostic, String resultatsExamens, Prescription prescription) {
        this.patient = patient;
        this.date = date;
        this.heure = heure;
        this.symptomes = symptomes;
        this.diagnostic = diagnostic;
        this.resultatsExamens = resultatsExamens;
        this.prescription = prescription;
    }

    // Méthodes getters
    public Patients get_patient() {
        return patient;
    }

    public LocalDate get_date() {
        return date;
    }

    public LocalTime get_heure() {
        return heure;
    }

    public String get_symptomes() {
        return symptomes;
    }

    public String get_diagnostic() {
        return diagnostic;
    }

    public Prescription get_prescription() {
        return prescription;
    }

    public String get_resultats_examens() {
        return resultatsExamens;
    }

    // Méthodes setters
    public void set_patient(Patients patient) {
        this.patient = patient;
    }

    public void set_date(LocalDate date) {
        this.date = date;
    }

    public void set_heure(LocalTime heure) {
        this.heure = heure;
    }

    public void set_symptomes(String symptomes) {
        this.symptomes = symptomes;
    }

    public void set_diagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void set_prescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public void set_resultats_examens(String resultatsExamens) {
        this.resultatsExamens = resultatsExamens;
    }
}