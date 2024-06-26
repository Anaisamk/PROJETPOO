/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmedical;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author anais
 */
public class Rdv extends javax.swing.JFrame {
private GestionRdv gestionRdv;
private LISTERDVS listeRdv; // Ajout d'une référence à la classe LISTERDVS


public Rdv(GestionRdv gestionRdv, LISTERDVS listeRdv) {
    initComponents();
    this.gestionRdv = gestionRdv;
    this.listeRdv = listeRdv; // Initialisation de la référence à la classe LISTERDVS
}
   public Rdv() {
        initComponents(); // Appel du constructeur par défaut généré par NetBeans
        gestionRdv = new GestionRdv(); // Initialisation de la gestion des rendez-vous
        listeRdv = new LISTERDVS(gestionRdv); // Initialisation de la liste des rendez-vous
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Listerdvs = new javax.swing.JButton();
        recherche = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ajouterrdv = new javax.swing.JButton();
        PATIENT = new javax.swing.JTextField();
        DATE = new javax.swing.JTextField();
        HEURE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RendezVous");

        Listerdvs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Listerdvs.setForeground(new java.awt.Color(0, 153, 255));
        Listerdvs.setText("Liste des rdv");
        Listerdvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListerdvsActionPerformed(evt);
            }
        });

        recherche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        recherche.setForeground(new java.awt.Color(0, 153, 255));
        recherche.setText("rechercher");
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("SUPPRIMER RDV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Listerdvs)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recherche)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Listerdvs)
                    .addComponent(recherche)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ajouterrdv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ajouterrdv.setForeground(new java.awt.Color(0, 153, 255));
        ajouterrdv.setText("ajouter");
        ajouterrdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterrdvActionPerformed(evt);
            }
        });

        PATIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PATIENTActionPerformed(evt);
            }
        });

        DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATEActionPerformed(evt);
            }
        });

        HEURE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HEUREActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("PATIENT");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("DATE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("HEURE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DATE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(PATIENT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HEURE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ajouterrdv)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PATIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(HEURE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(ajouterrdv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListerdvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListerdvsActionPerformed
                                         
  
    // Charger les données depuis le fichier
    listeRdv.readAllData();
    // Rendre la fenêtre visible
    listeRdv.setVisible(true);




    }//GEN-LAST:event_ListerdvsActionPerformed

    private void PATIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PATIENTActionPerformed
  
    }//GEN-LAST:event_PATIENTActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
     // TODO add your handling code here:                                       
                                         
    // Demandez à l'utilisateur de saisir le nom du patient à rechercher
    String nomPatient = JOptionPane.showInputDialog("Entrez le nom du patient :");

    // Vérifiez si le nom du patient est saisi
    if (nomPatient != null && !nomPatient.isEmpty()) {
        // Effectuez la recherche en utilisant le nom du patient saisi
        String rdvInfo = gestionRdv.rechercherRdvParNom(nomPatient);
        if (!rdvInfo.isEmpty()) {
            JOptionPane.showMessageDialog(this, rdvInfo, "Rendez-vous pour " + nomPatient, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Aucun rendez-vous trouvé pour le patient " + nomPatient + ".", "Rendez-vous pour " + nomPatient, JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // Affichez un message d'erreur si aucun nom n'est saisi
        JOptionPane.showMessageDialog(this, "Veuillez entrer un nom de patient.");
    }




    }//GEN-LAST:event_rechercheActionPerformed

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_DATEActionPerformed

    private void HEUREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HEUREActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_HEUREActionPerformed

    private void ajouterrdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterrdvActionPerformed

                                          
    String patientText = PATIENT.getText();

    // Vérifier si le champ patient n'est pas vide
    if (!patientText.isEmpty()) {
        // Diviser le texte saisi en nom et prénom
        String[] parts = patientText.split(" ");
        
        // Vérifier si la séparation a bien eu lieu
        if (parts.length == 2) {
            // Extraire le nom et le prénom
            String nom = parts[0];
            String prenom = parts[1];
            
            // Créer un objet Patients avec le nom et le prénom
            Patients patient = new Patients(nom, prenom);

            // Récupérer les autres informationsss
            String dateText = DATE.getText();
            String heureText = HEURE.getText();

            // Vérifier si les champs date et heure ne sont pas vides
            if (!dateText.isEmpty() && !heureText.isEmpty()) {
                try {
                    // Convertir la date et l'heure en LocalDate et LocalTime
                    LocalDate date = LocalDate.parse(dateText);
                    LocalTime heure = LocalTime.parse(heureText);
                    
                    // Appeler la méthode planifierRdv avec les valeurs récupérées
                    boolean success = gestionRdv.planifierRdv(date, heure, patient);

                    // Si le rendez-vous est ajouté avec succès, rafraîchir l'affichage
                    if (success) {
                        JOptionPane.showMessageDialog(this, "Rendez-vous ajouté avec succès.");
                        
                        // Rafraîchir l'affichage de la liste des rendez-vous dans Rdv
                        refreshRdvList();

                        // Rafraîchir l'affichage de la liste des rendez-vous dans LISTERDVS
                        listeRdv.WriteAllData();
                        listeRdv.SaveAllData();
                    } else {
                        JOptionPane.showMessageDialog(this, "Impossible de planifier le rendez-vous.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Format de date ou d'heure invalide.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez saisir le nom et le prénom du patient séparés par un espace.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Veuillez saisir le nom et le prénom du patient.");
    }


// Méthode pour rafraîchir l'affichage de la liste des rendez-vous dans Rdv






    }//GEN-LAST:event_ajouterrdvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    // Demandez à l'utilisateur de saisir le nom du patient à supprimer
    String nomPatient = JOptionPane.showInputDialog("Entrez le nom du patient :");

    // Vérifiez si le nom du patient est saisi
    if (nomPatient != null && !nomPatient.isEmpty()) {
        // Appelez la méthode supprimerRendezVousParNom de GestionRdv pour supprimer le rendez-vous par nom de patient
        boolean success = gestionRdv.supprimerRendezVousParNom(nomPatient);

        // Si le rendez-vous est supprimé avec succès, rafraîchissez l'affichage
        if (success) {
            JOptionPane.showMessageDialog(this, "Rendez-vous supprimé avec succès pour le patient " + nomPatient);
            listeRdv.WriteAllData();
            listeRdv.SaveAllData();// Rafraîchissez l'affichage de la liste des rendez-vous
        } else {
            JOptionPane.showMessageDialog(this, "Aucun rendez-vous trouvé pour le patient " + nomPatient);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Veuillez entrer un nom de patient.");
    }


    }//GEN-LAST:event_jButton1ActionPerformed
private void refreshRdvList() {
    // Rafraîchir l'affichage de la liste des rendez-vous dans Rdv
    gestionRdv.afficherRdvChronologique();
    
  
}






    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    GestionRdv gestionRdv = new GestionRdv();
    LISTERDVS listeRdv = new LISTERDVS(gestionRdv); // Création d'une instance de LISTERDVS

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Création d'une instance de Rdv en passant les références nécessaires
            Rdv rdv = new Rdv(gestionRdv, listeRdv); 
            // Affichage de la fenêtre Rdv
            rdv.setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DATE;
    private javax.swing.JTextField HEURE;
    private javax.swing.JButton Listerdvs;
    private javax.swing.JTextField PATIENT;
    private javax.swing.JButton ajouterrdv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton recherche;
    // End of variables declaration//GEN-END:variables
}
