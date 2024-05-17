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
    public boolean supprimerRendezVous(LocalDate date, LocalTime heure) {
        for (RendezVous rdv : ListeRdv) {
            if (rdv.getDate().equals(date) && rdv.getHeure().equals(heure)) {
                ListeRdv.remove(rdv);
                System.out.println("Rendez-vous supprimé avec succès pour " + date + " à " + heure);
                return true;
            }
        }
        System.out.println("Aucun rendez-vous trouvé pour le " + date + " à " + heure);
        return false;
    }
    public void rechercherRdvParNom(String nomPatient) {
        System.out.println("Rendez-vous pour le patient " + nomPatient + " :");
        for (RendezVous rdv : ListeRdv) {
            if (rdv.getPatient().get_nom().equalsIgnoreCase(nomPatient)) {
                System.out.println("Date : " + rdv.getDate() + " - Heure : " + rdv.getHeure());
            }
        }
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
    

