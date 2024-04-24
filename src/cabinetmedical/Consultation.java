/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anais
 */
public class Consultation {
    // Attributs
    private String date;
    private String heure;
    private String symptomes;
    private String diagnostic;
    private String ordonnance;
    private String resultatsExamens;

    // Constructeur
    public Consultation(String date, String heure, String symptomes, String diagnostic, String ordonnance, String resultatsExamens) {
        this.date = date;
        this.heure = heure;
        this.symptomes = symptomes;
        this.diagnostic = diagnostic;
        this.ordonnance = ordonnance;
        this.resultatsExamens = resultatsExamens;
    }

    // Méthodes getters
    public String get_date() {
        return date;
    }

    public String get_heure() {
        return heure;
    }

    public String get_symptomes() {
        return symptomes;
    }

    public String get_diagnostic() {
        return diagnostic;
    }

    public String get_ordonnance() {
        return ordonnance;
    }

    public String get_resultats_examens() {
        return resultatsExamens;
    }

    // Méthodes setters
    public void set_date(String date) {
        this.date = date;
    }

    public void set_heure(String heure) {
        this.heure = heure;
    }

    public void set_symptomes(String symptomes) {
        this.symptomes = symptomes;
    }

    public void set_diagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void set_ordonnance(String ordonnance) {
        this.ordonnance = ordonnance;
    }

    public void set_resultats_examens(String resultatsExamens) {
        this.resultatsExamens = resultatsExamens;
    }
}
