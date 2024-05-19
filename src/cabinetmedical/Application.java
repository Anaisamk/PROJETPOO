/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author anis
 */
public class Application {
    private static GestionPatients gestionPatients = new GestionPatients();
    private static GestionRdv gestionRdv = new GestionRdv();
    private static GestionDossiersMedicaux gestionDossiersMedicaux = new GestionDossiersMedicaux();
    private static GestionConsultations gestionConsultations =new GestionConsultations();
    private static Gestionfactures gestionFactures = new Gestionfactures();


    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patients patient1 = new Patients("Hamzaoui", "Yousra", "21", "B+", "F", "0123456789", "12345", "98765");
        Patients patient2 = new Patients("Amokrane", "Anais", "20", "O+", "F", "9876543210", "12346", "87654");
        gestionPatients.ajouter_patient(patient1);
        gestionPatients.ajouter_patient(patient2);

        gestionRdv.planifierRdv(LocalDate.of(2024,5,19), LocalTime.of(10, 0), patient1);
        gestionRdv.planifierRdv(LocalDate.of(2024,5,20), LocalTime.of(11, 0), patient2);

        DossierMedical dossier1 = new DossierMedical(12345, patient1, "Traitement XYZ", "Diagnostic ABC", new Prescription("Médicament1", "Posologie1", "Examen1", "Instructions1"));
        DossierMedical dossier2 = new DossierMedical(12346, patient2, "Traitement UVW", "Diagnostic DEF", new Prescription("Médicament2", "Posologie2", "Examen2", "Instructions2"));
        gestionDossiersMedicaux.ajouter_dossier_medical(dossier1);
        gestionDossiersMedicaux.ajouter_dossier_medical(dossier2);

        int choix;
        int choix1;
        
            System.out.println("bienvenue dans le cabinet medical");
            System.out.println("appuyer sur 0 si vous etes la secretaire ou sur 1 si vous etes le medecin");
            choix = scanner.nextInt();
            switch (choix) {
                case 0:
                    do {
            System.out.println("Menu :");
            System.out.println("1. Ajouter un patient");
            System.out.println("2. Modifier un patient");
            System.out.println("3. Supprimer un patient");
            System.out.println("4. Afficher la liste des patients");
            System.out.println("5. Planifier un rendez-vous");
            System.out.println("6. Supprimer un rendez-vous");
            System.out.println("7. Afficher les rendez-vous planifiés");
            System.out.println("8. Ajouter une facture");
            System.out.println("9. Afficher la liste des factures");
            System.out.println("10. Rechercher une facture par nom et prénom du patient");
            System.out.println("0. Quitter");

            System.out.print("Votre choix : ");
            choix1 = scanner.nextInt();

            switch (choix1) {
                case 1:
                    ajouterPatient(scanner);
                    break;
                case 2:
                    modifierPatient(scanner);
                    break;
                case 3:
                    supprimerPatient(scanner);
                    break;
                case 4:
                    afficherListePatients();
                    break;
                case 5:
                    planifierRendezVous(scanner);
                    break;
                case 6:
                    supprimerRendezVous(scanner);
                    break;
                case 7:
                    afficherRendezVous();
                    break;
                case 8:
                    ajouterFacture(scanner);
                    break;
                case 9:
                    afficherListeFactures();
                    break;
                case 10:
                    rechercherFactureParNomPrenom(scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix1 != 0);
        case 1 :
            do {
            System.out.println("Menu :");
  //rechercher patient , rdv de la journee, consultation,ajouter ou modifier un dossier medical
            System.out.println("1. Rechercher un patient");
            System.out.println("2. Ajouter une consultation");
            System.out.println("3. Rechercher une consultation");
            System.out.println("4. Afficher les rendez-vous de la journnée");
            System.out.println("5. Ajouter un dossier médical");
            System.out.println("6. Modifier un dossier médical");
            System.out.println("7. Afficher la liste des dossiers médicaux");
            System.out.println("0. Quitter");

            System.out.print("Votre choix : ");
            choix1 = scanner.nextInt();

            switch (choix1) {
                case 1:
                    afficherInfosPatients(scanner);
                    break;
                case 2:
                    ajouterConsultation(scanner);
                    break;
                case 3:
                    rechercherConsultation(scanner);
                    break;
                case 4:
                    gestionRdv.afficherRendezVousDateActuelle();
                    break;
                case 5:
                    ajouterDossierMedical(scanner);
                case 6:
                    modifierDossierMedical(scanner);
                    break;
                case 7:
                    gestionDossiersMedicaux.affichage_dossiers_medicaux();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix1 != 0);
//rechercher patient , rdv de la journee, consultation,ajouter ou modifier un dossier medical
    }
    

    }
    private static void ajouterPatient(Scanner scanner) {
        scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
        System.out.println("=== Ajout d'un nouveau patient ===");
        System.out.print("Entrez le nom du patient : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom du patient : ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez l'âge du patient : ");
        String age = scanner.nextLine();
        System.out.print("Entrez le groupe sanguin du patient : ");
        String groupeSanguin = scanner.nextLine();
        
        String sexe;
        while (true) {
            System.out.print("Entrez le sexe du patient (F/H) : ");
            sexe = scanner.nextLine();
            if (sexe.equals("F") || sexe.equals("H")) {
                break;
            } else {
                System.out.println("Le sexe doit être 'F' ou 'H'. Veuillez réessayer.");
            }
        }

        String numTel;
        while (true) {
            System.out.print("Entrez le numéro de téléphone du patient (10 chiffres) : ");
            numTel = scanner.nextLine();
            if (numTel.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("Le numéro de téléphone doit contenir exactement 10 chiffres. Veuillez réessayer.");
            }
        }

        System.out.print("Entrez le numéro de dossier du patient : ");
        String numDossier = scanner.nextLine();
        System.out.print("Entrez le numéro d'assurance du patient : ");
        String numAssurance = scanner.nextLine();
        
        // Création d'un nouvel objet Patient
        Patients patient = new Patients(nom, prenom, age, groupeSanguin, sexe, numTel, numDossier, numAssurance);
        
        // Ajout du patient à la gestion des patients
        gestionPatients.ajouter_patient(patient);
        
        System.out.println("Patient ajouté avec succès.");
    }



    private static void modifierPatient(Scanner scanner) {
        scanner.nextLine(); // consomme la nouvelle ligne restante après le prochain int
        System.out.println("Entrez le numéro de dossier du patient à modifier : ");
        String numDossier = scanner.nextLine();
        Patients patient = gestionPatients.get_patient_par_num_dossier(numDossier);
        if (patient != null) {
            System.out.println("Entrez le nouveau nom du patient : ");
            String nom = scanner.nextLine();
            System.out.println("Entrez le nouveau prénom du patient : ");
            String prenom = scanner.nextLine();
            // Vous pouvez ajouter d'autres informations si nécessaire pour le patient
            patient.set_nom(nom);
            patient.set_prenom(prenom);
            gestionPatients.modifier_patient(numDossier, patient);
            System.out.println("Patient modifié avec succès.");
        } else {
            System.out.println("Aucun patient trouvé avec le numéro de dossier spécifié.");
        }
    }

    private static void supprimerPatient(Scanner scanner) {
        scanner.nextLine(); // consomme la nouvelle ligne restante après le prochain int
        System.out.println("Entrez le numéro de dossier du patient à supprimer : ");
        String numDossier = scanner.nextLine();
        gestionPatients.supprimer_patient(numDossier);
        System.out.println("Patient supprimé avec succès.");
    }

    private static void afficherInfosPatients(Scanner scanner) {
    scanner.nextLine(); // consomme la nouvelle ligne restante après le prochain int
    System.out.println("Entrez le nom du patient : ");
    String nom = scanner.nextLine();
    System.out.println("Entrez le prénom du patient : ");
    String prenom = scanner.nextLine();
    
    // Afficher les informations du patient s'il existe
    gestionPatients.afficher_patient_par_nom_prenom(nom, prenom);
}


    private static void afficherListePatients() {
        System.out.println("Liste des patients :");
        gestionPatients.afficher_liste();
    }

    private static void planifierRendezVous(Scanner scanner) {
        scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
        System.out.println("Entrez le nom du patient pour le rendez-vous : ");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prénom du patient pour le rendez-vous : ");
        String prenom = scanner.nextLine();
        
        Patients patient = gestionPatients.get_patient_par_nom_prenom(nom, prenom);
        if (patient != null) {
            System.out.println("Entrez la date du rendez-vous (format AAAA-MM-JJ) : ");
            String dateStr = scanner.nextLine();
            LocalDate date;
            try {
                date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("Format de date invalide. Veuillez réessayer.");
                return;
            }
            
            System.out.println("Entrez l'heure du rendez-vous (format HH:MM) : ");
            String heureStr = scanner.nextLine();
            LocalTime heure;
            try {
                heure = LocalTime.parse(heureStr, DateTimeFormatter.ISO_LOCAL_TIME);
            } catch (DateTimeParseException e) {
                System.out.println("Format d'heure invalide. Veuillez réessayer.");
                return;
            }
            
            // Planifier le rendez-vous
            gestionRdv.planifierRdv(date, heure, patient);
            System.out.println("Rendez-vous planifié avec succès.");
        } else {
            System.out.println("Aucun patient trouvé avec le nom spécifié.");
        }
    }


    private static void supprimerRendezVous(Scanner scanner) {
        scanner.nextLine(); // consomme la nouvelle ligne restante après le prochain int
        System.out.println("Entrez le nom du patient pour supprimer le rendez-vous : ");
        String nomPatient = scanner.nextLine();
        boolean success = gestionRdv.supprimerRendezVousParNom(nomPatient);
        if (!success) {
            System.out.println("Aucun rendez-vous trouvé pour le patient spécifié.");
        }
    }

    private static void afficherRendezVous() {
        System.out.println("Liste des rendez-vous :");
        gestionRdv.afficherRdvChronologique();
    }

    private static void ajouterDossierMedical(Scanner scanner) {
    scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int

    System.out.println("=== Ajout d'un nouveau dossier médical ===");
    System.out.print("Entrez le numéro de dossier : ");
    int numDossier = scanner.nextInt();
    scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int

    // Vérifier si un dossier avec ce numéro existe déjà
    DossierMedical existingDossier = gestionDossiersMedicaux.rechercherDossierParNumero(numDossier);
    if (existingDossier != null) {
        System.out.println("Un dossier médical avec ce numéro existe déjà.");
        return;
    }

    System.out.println("Entrez le nom du patient associé au dossier : ");
    String nomPatient = scanner.nextLine();
    System.out.println("Entrez le prénom du patient associé au dossier : ");
    String prenomPatient = scanner.nextLine();
    Patients patient = gestionPatients.get_patient_par_nom_prenom(nomPatient, prenomPatient);

    if (patient != null) {
        System.out.println("Entrez le traitement : ");
        String traitement = scanner.nextLine();
        System.out.println("Entrez le diagnostic : ");
        String diagnostic = scanner.nextLine();

        // Création de la prescription
        System.out.println("Entrez les détails de la prescription : ");
        System.out.print("Nom du médicament : ");
        String medicament = scanner.nextLine();
        System.out.print("Posologie : ");
        String posologie = scanner.nextLine();
        System.out.print("Type d'examen : ");
        String typeExamen = scanner.nextLine();
        System.out.print("Instructions : ");
        String instructions = scanner.nextLine();

        Prescription prescription = new Prescription(medicament, posologie, typeExamen, instructions);

        // Création du dossier médical
        DossierMedical newDossier = new DossierMedical(numDossier, patient, traitement, diagnostic, prescription);

        // Ajout du dossier médical
        gestionDossiersMedicaux.ajouter_dossier_medical(newDossier);

        System.out.println("Dossier médical ajouté avec succès.");
    } else {
        System.out.println("Aucun patient trouvé avec le nom et le prénom spécifiés.");
    }
}


    private static void modifierDossierMedical(Scanner scanner) {
    scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
    System.out.println("Entrez le numéro de dossier du dossier médical à modifier : ");
    int numDossier = scanner.nextInt();
    scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
    
    // Recherche du dossier médical par numéro
    DossierMedical dossier = gestionDossiersMedicaux.rechercherDossierParNumero(numDossier);
    
    if (dossier != null) {
        // Affichage des informations actuelles du dossier médical
        System.out.println("Informations actuelles du dossier médical : ");
        gestionDossiersMedicaux.affichage_dossier_specifique(dossier);
        
        // Saisie des nouvelles informations
        System.out.println("Entrez le nouveau traitement : ");
        String traitement = scanner.nextLine();
        System.out.println("Entrez le nouveau diagnostic : ");
        String diagnostic = scanner.nextLine();
        
        // Création du nouveau dossier médical avec les nouvelles informations
        DossierMedical nouveauDossier = new DossierMedical(numDossier, dossier.get_patient(), traitement, diagnostic, dossier.get_Prescription());
        
        // Modification du dossier médical
        gestionDossiersMedicaux.modifier_dossier_medical(numDossier, nouveauDossier);
        
        System.out.println("Dossier médical modifié avec succès.");
    } else {
        System.out.println("Aucun dossier médical trouvé avec le numéro spécifié.");
    }
}


    
    private static void ajouterConsultation(Scanner scanner) {
        scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
    
        System.out.println("Entrez le nom du patient pour la consultation : ");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prénom du patient pour la consultation : ");
        String prenom = scanner.nextLine();
        Patients patient = gestionPatients.get_patient_par_nom_prenom(nom, prenom);
    
        if (patient != null) {
            System.out.println("Entrez la date de la consultation (format AAAA-MM-JJ) : ");
            String dateStr = scanner.nextLine();
            LocalDate date;
    
            try {
                date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("Format de date invalide. Veuillez réessayer.");
                return;
            }
    
            System.out.println("Entrez l'heure de la consultation (format HH:MM) : ");
            String heureStr = scanner.nextLine();
            LocalTime heure;
    
            try {
                heure = LocalTime.parse(heureStr, DateTimeFormatter.ISO_LOCAL_TIME);
            } catch (DateTimeParseException e) {
                System.out.println("Format d'heure invalide. Veuillez réessayer.");
                return;
            }
    
            System.out.println("Entrez les symptômes de la consultation : ");
            String symptomes = scanner.nextLine();
    
            System.out.println("Entrez le diagnostic de la consultation : ");
            String diagnostic = scanner.nextLine();
    
            System.out.println("Entrez les résultats des examens de la consultation : ");
            String resultatsExamens = scanner.nextLine();
    
            // Création de la prescription
            System.out.println("Entrez les détails de la prescription (si disponible) : ");
            System.out.println("Entrez le nom du médicament : ");
            String medicament = scanner.nextLine();
            System.out.println("Entrez la posologie : ");
            String posologie = scanner.nextLine();
            System.out.println("Entrez le type d'examen : ");
            String typeExamen = scanner.nextLine();
            System.out.println("Entrez les instructions : ");
            String instructions = scanner.nextLine();
            
            // Création de la prescription
            Prescription prescription = new Prescription(medicament, posologie, typeExamen, instructions);
            
    
            // Ajout de la consultation
            Consultation consultation = new Consultation(patient, date, heure, symptomes, diagnostic, resultatsExamens, prescription);
            gestionConsultations.ajouter_consultation(consultation);
    
            System.out.println("Consultation ajoutée avec succès.");
        } else {
            System.out.println("Aucun patient trouvé avec le nom spécifié.");
        }
    }
    private static void rechercherConsultation(Scanner scanner) {
    scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
    System.out.println("Entrez le nom du patient : ");
    String nom = scanner.nextLine();
    System.out.println("Entrez le prénom du patient : ");
    String prenom = scanner.nextLine();
    System.out.println("Entrez la date de la consultation (format AAAA-MM-JJ) : ");
    String dateStr = scanner.nextLine();
    
    // Rechercher la consultation correspondante
    Consultation consultationTrouvee = gestionConsultations.rechercher_consultation(nom, prenom, dateStr);
    
    // Vérifier si la consultation a été trouvée
    if (consultationTrouvee != null) {
        // Afficher les détails de la consultation
        System.out.println("Consultation trouvée :");
        System.out.println("Nom du patient : " + consultationTrouvee.get_patient().get_nom());
        System.out.println("Prénom du patient : " + consultationTrouvee.get_patient().get_prenom());
        System.out.println("Date de la consultation : " + consultationTrouvee.get_date());
        System.out.println("Heure de la consultation : " + consultationTrouvee.get_heure());
        System.out.println("Symptômes : " + consultationTrouvee.get_symptomes());
        System.out.println("Diagnostic : " + consultationTrouvee.get_diagnostic());
        System.out.println("Résultats des examens : " + consultationTrouvee.get_resultats_examens());
    } else {
        System.out.println("Aucune consultation trouvée pour le patient spécifié à la date indiquée.");
    }
}
private static void ajouterFacture(Scanner scanner) {
        scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
        System.out.println("=== Ajout d'une nouvelle facture ===");
        System.out.print("Entrez le nom du patient : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom du patient : ");
        String prenom = scanner.nextLine();

        Patients patient = gestionPatients.get_patient_par_nom_prenom(nom, prenom);

        if (patient != null) {
            System.out.print("Entrez le montant de la facture : ");
            float montant = scanner.nextFloat();
            scanner.nextLine(); // Consomme la nouvelle ligne après nextFloat()
            LocalDate dateEmission = LocalDate.now();

            Facture nouvelleFacture = new Facture(patient, montant, dateEmission);
            gestionFactures.ajouterFacture(nouvelleFacture);

            System.out.println("Facture ajoutée avec succès !");
        } else {
            System.out.println("Patient non trouvé.");
        }
    }

    private static void afficherListeFactures() {
        System.out.println("=== Liste des factures ===");
        gestionFactures.afficherFactures();
    }

    private static void rechercherFactureParNomPrenom(Scanner scanner) {
        scanner.nextLine(); // Consomme la nouvelle ligne restante après le prochain int
        System.out.println("=== Recherche de facture par nom et prénom ===");
        System.out.print("Entrez le nom du patient : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom du patient : ");
        String prenom = scanner.nextLine();

        gestionFactures.rechercherFacturesParPatient(nom, prenom);

        
    }
    
}

