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
    public void ajouter_une_prescription(Consultation consultation ,Prescription prescription){
        consultation.set_prescription(prescription);
    }
    // Méthode pour ajouter des résultats d'examens à une consultation
    public void ajouter_résultats_examens(Consultation consultation, String résultats_examens) {
        consultation.set_resultats_examens(résultats_examens);
    }
    public void ajouter_consultation(Consultation nouvelle_consultation) {
        consultations_en_cours.add(nouvelle_consultation);
    }
    
    
    // Méthode pour rechercher une consultation par le nom, le prénom et la date
    public Consultation rechercher_consultation(String nom, String prenom, String date) {
        for (Consultation consultation : consultations_en_cours) {
            Patients patient = consultation.get_patient();
            if (patient.get_nom().equalsIgnoreCase(nom) && patient.get_prenom().equalsIgnoreCase(prenom) && consultation.get_date().equals(date)) {
                return consultation;
            }
        }
        return null; // Aucun résultat trouvé
    }
}
