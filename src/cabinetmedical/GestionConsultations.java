/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anais
 */
import java.util.ArrayList;

public class GestionConsultations {
    // Attribut
    private ArrayList<Consultation> consultations_en_cours;

    // Constructeur
    public GestionConsultations() {
        this.consultations_en_cours = new ArrayList<>();
    }

    // Méthode pour ajouter des symptômes à une consultation
    public void ajouter_symptômes(Consultation consultation, String symptômes) {
        consultation.set_symptomes(symptômes);
    }

    // Méthode pour établir un diagnostic pour une consultation
    public void établir_diagnostic(Consultation consultation, String diagnostic) {
        consultation.set_diagnostic(diagnostic);
    }

    // Méthode pour émettre une ordonnance pour une consultation
    public void émettre_ordonnance(Consultation consultation, String ordonnance) {
        consultation.set_ordonnance(ordonnance);
    }

    // Méthode pour ajouter des résultats d'examens à une consultation
    public void ajouter_résultats_examens(Consultation consultation, String résultats_examens) {
        consultation.set_resultats_examens(résultats_examens);
    }
}
