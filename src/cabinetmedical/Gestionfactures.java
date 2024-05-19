/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anis
 */

import java.util.ArrayList;
public class Gestionfactures {
    
    // Attributs :
    private ArrayList<Facture> factures;

    // Constructeur :
    public Gestionfactures() {
        this.factures = new ArrayList<>();
    }

    // Méthodes :

    // Ajouter une nouvelle facture
    public void ajouterFacture(Facture facture) {
        this.factures.add(facture);
    }

    // Rechercher une facture par patient
    public void rechercherFacturesParPatient(String nom, String prenom) {
    boolean factureTrouvee = false;

    for (Facture facture : this.factures) {
        if (facture.getPatient().get_nom().equals(nom) && facture.getPatient().get_prenom().equals(prenom)) {
            facture.affichage_facture();
            factureTrouvee = true;
        }
    }

    if (!factureTrouvee) {
        System.out.println("Aucune facture trouvée");
    }
}


    

    // Afficher les factures
    public void afficherFactures() {
        for (Facture facture : this.factures) {
            facture.affichage_facture();
            System.out.println("------------");
        }
    }
    
    

}

