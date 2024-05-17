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
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class GestionRdv {

    private static final LocalTime Ouverture = LocalTime.of(9, 0); // Heure d'ouverture du cabinet
    private static final LocalTime Fermeture = LocalTime.of(16, 0); // Heure de fermeture du cabinet
    private static final int Duree = 30; // rdv dure 30mins
    public List<RendezVous> ListeRdv;
    public GestionRdv() {
        ListeRdv = new ArrayList<>();
    }
    private boolean HeureValide(LocalTime heure) {
        if (heure.isBefore(Ouverture)) {
            return false;
        } else {
            if (heure.plusMinutes(Duree).isAfter(Fermeture)) {
                return false;
            } else {
                return true;
            }
        }
    }  
    private boolean CreneauDisponible(LocalDate date, LocalTime heure) {
        // Vérifier si le créneau horaire demandé est disponible
        for (RendezVous rdv : ListeRdv) {
            if (rdv.getDate().equals(date) && rdv.getHeure().equals(heure)) {
                return false;
            }
        }
        return true;
    }
    public boolean planifierRdv(LocalDate date, LocalTime heure, Patients patient) {
        // Vérifier si le créneau horaire est valide 
        if (!HeureValide(heure)) {
            System.out.println("Le cabinet est fermé à cette heure ci.");
            return false;
        }
        // Vérifier si le créneau est disponible
        if (!CreneauDisponible(date, heure)) {
            System.out.println("Le créneau horaire demandé n'est pas disponible.");
            return false;
        }
        // Ajouter le rendez-vous
        ListeRdv.add(new RendezVous(date, heure, patient));
        System.out.println("Rendez-vous planifié avec succès pour " + date + " à " + heure);
        return true;
    }
    public boolean supprimerRendezVousParNom(String nomPatient) {
    // Parcourez la liste des rendez-vous
    for (RendezVous rdv : ListeRdv){
       
        // Vérifiez si le nom du patient du rendez-vous correspond au nom fourni
        if (rdv.getPatient().get_nom().equalsIgnoreCase(nomPatient)) {
            // Si une correspondance est trouvée, supprimez ce rendez-vous de la liste
            ListeRdv.remove(rdv);
            System.out.println("Rendez-vous supprimé avec succès pour le patient " + nomPatient);
            return true;
        }
    }
    // Si aucun rendez-vous avec le nom fourni n'est trouvé, retournez false
    System.out.println("Aucun rendez-vous trouvé pour le patient " + nomPatient);
    return false;
}

public String rechercherRdvParNom(String nomPatient) {
    StringBuilder rdvInfo = new StringBuilder();
    for (RendezVous rdv : ListeRdv) {
        if (rdv.getPatient().get_nom().equalsIgnoreCase(nomPatient)) {
            rdvInfo.append("Date : ").append(rdv.getDate()).append(" - Heure : ").append(rdv.getHeure()).append("\n");
        }
    }
    return rdvInfo.toString();
}

    public void afficherRdvChronologique() {
        // Tri des rendez-vous par date et heure
        Collections.sort(ListeRdv, Comparator.comparing(RendezVous::getDate).thenComparing(RendezVous::getHeure));

        // Affichez les rendez-vous
        System.out.println("Rendez-vous planifiés par ordre chronologique :");
        for (RendezVous rdv : ListeRdv) {
            System.out.println("Date : " + rdv.getDate() + " - Heure : " + rdv.getHeure() + " - Patient : " + rdv.getPatient().get_nom());
        }
    }
    public void afficherRendezVousDateActuelle() {
        LocalDate Today = LocalDate.now();
        // Affichage des rendez-vous d'aujourd'hui
        System.out.println("Rendez-vous planifiés pour aujourd'hui (" + Today + "):");
        for (RendezVous rdv : ListeRdv) {
            if (rdv.getDate().equals(Today)) {
                System.out.println("Date : " + rdv.getDate() + " - Heure : " + rdv.getHeure() + " - Patient : " + rdv.getPatient().get_nom());
            }
        }
    }}
    

