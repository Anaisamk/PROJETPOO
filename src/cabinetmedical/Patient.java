/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmedical;
import javax.swing.JOptionPane;

/**
 *
 * @author anais
 */
public class Patient extends javax.swing.JFrame {

    private final LISTEPATIENTS listePatients;

    public Patient(LISTEPATIENTS listePatients) {
        initComponents();
        this.listePatients = listePatients;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NOM = new javax.swing.JTextField();
        PRENOM = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        SEXE = new javax.swing.JTextField();
        GROUPE_SANGUIN = new javax.swing.JTextField();
        NUM_DOSSIER = new javax.swing.JTextField();
        NUM_ASSURANCE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        NUM_TEL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PATIENTS");

        jButton1.setText("LISTE PATIENTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RECHERCHER PATIENT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        PRENOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRENOMActionPerformed(evt);
            }
        });

        AGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGEActionPerformed(evt);
            }
        });

        SEXE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEXEActionPerformed(evt);
            }
        });

        GROUPE_SANGUIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GROUPE_SANGUINActionPerformed(evt);
            }
        });

        NUM_DOSSIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUM_DOSSIERActionPerformed(evt);
            }
        });

        jLabel2.setText("NOM");

        jLabel3.setText("PRENOM");

        jLabel4.setText("AGE");

        jLabel5.setText("SEXE");

        jLabel6.setText("GROUPE SANGUIN");

        jLabel7.setText("NUM DOSSIER");

        jLabel8.setText("NUM ASSURANCE");

        jButton3.setText("VALIDER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        NUM_TEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUM_TELActionPerformed(evt);
            }
        });

        jLabel9.setText("NUM_TEL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NUM_TEL, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(NUM_DOSSIER)
                    .addComponent(GROUPE_SANGUIN)
                    .addComponent(SEXE)
                    .addComponent(AGE)
                    .addComponent(PRENOM)
                    .addComponent(NOM)
                    .addComponent(NUM_ASSURANCE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(260, 260, 260))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GROUPE_SANGUIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUM_TEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUM_DOSSIER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUM_ASSURANCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:                                       
    
    // Rendre la fenêtre actuelle invisible
    setVisible(false);
    
    // Rendre la fenêtre de la liste des patients visible
    listePatients.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void PRENOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRENOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRENOMActionPerformed

    private void AGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGEActionPerformed

    private void SEXEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEXEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEXEActionPerformed

    private void GROUPE_SANGUINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GROUPE_SANGUINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GROUPE_SANGUINActionPerformed

    private void NUM_DOSSIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUM_DOSSIERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUM_DOSSIERActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
 
Patients patient = new Patients();
                patient.set_nom(NOM.getText());
            patient.set_prenom(PRENOM.getText());
            patient.set_age(AGE.getText());
            patient.set_sexe(SEXE.getText());
            patient.set_groupe_sanguin(GROUPE_SANGUIN.getText());
            patient.set_num_tel(NUM_TEL.getText());
            patient.set_num_dossier(NUM_DOSSIER.getText());
            patient.set_num_assurance(NUM_ASSURANCE.getText());

    // Ajouter le patient à la liste de patients de LISTEPATIENTS
    listePatients.addPatient(patient);

    // Effacer les champs de saisie après l'ajout du patient
    NOM.setText("");
    PRENOM.setText("");
    AGE.setText("");
    SEXE.setText("");
    GROUPE_SANGUIN.setText("");
    NUM_TEL.setText("");
    NUM_DOSSIER.setText("");
    NUM_ASSURANCE.setText("");

              
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NUM_TELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUM_TELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUM_TELActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                              
    // Demander le nom du patient à rechercher
    String nomRecherche = JOptionPane.showInputDialog(this, "Entrez le nom du patient à rechercher :", "Rechercher un patient", JOptionPane.QUESTION_MESSAGE);

    // Vérifier si un nom a été saisi
    if (nomRecherche != null && !nomRecherche.isEmpty()) {
        // Parcourir la liste des patients pour trouver celui correspondant au nom saisi
        boolean patientTrouve = false;
        for (int i = 0; i < listePatients.allPatients.size(); i++) {
            Patients patient = listePatients.allPatients.get(i);
            if (patient.get_nom().equalsIgnoreCase(nomRecherche)) {
                // Afficher les informations du patient
                JOptionPane.showMessageDialog(this, "Nom: " + patient.get_nom() + "\nPrénom: " + patient.get_prenom() + "\nAge: " + patient.get_age() + "\nSexe: " + patient.get_sexe() + "\nGroupe Sanguin: " + patient.get_groupe_sanguin() + "\nNuméro de Téléphone: " + patient.get_num_tel() + "\nNuméro de Dossier: " + patient.get_num_dossier() + "\nNuméro d'Assurance: " + patient.get_num_assurance(), "Informations du patient", JOptionPane.INFORMATION_MESSAGE);
                patientTrouve = true;
                break;
            }
        }

        // Si aucun patient correspondant n'a été trouvé, afficher un message
        if (!patientTrouve) {
            JOptionPane.showMessageDialog(this, "Aucun patient trouvé avec le nom " + nomRecherche, "Patient non trouvé", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        // Si aucun nom n'a été saisi, afficher un message
        JOptionPane.showMessageDialog(this, "Veuillez saisir un nom de patient à rechercher", "Nom manquant", JOptionPane.WARNING_MESSAGE);
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
 public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            LISTEPATIENTS listePatients = new LISTEPATIENTS();
            new Patient(listePatients).setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JTextField GROUPE_SANGUIN;
    private javax.swing.JTextField NOM;
    private javax.swing.JTextField NUM_ASSURANCE;
    private javax.swing.JTextField NUM_DOSSIER;
    private javax.swing.JTextField NUM_TEL;
    private javax.swing.JTextField PRENOM;
    private javax.swing.JTextField SEXE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
