/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmedical;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author anais
 */
public class LISTERDVS extends javax.swing.JFrame {
 private GestionRdv gestionRdv;

    public LISTERDVS(GestionRdv gestionRdv) {
        initComponents();
        this.gestionRdv = gestionRdv;
    }
 

    public LISTERDVS() {
        initComponents();
        readAllData();
        WriteAllData();}
           
    
void SaveAllData() {
    try {
        FileWriter fileWriter = new FileWriter("datardvs.txt", true); // true pour permettre l'ajout à la fin du fichier
        for (int i = 0; i < gestionRdv.ListeRdv.size(); i++) {
            RendezVous rdv = gestionRdv.ListeRdv.get(i);
            // Récupérer le nom complet du patient
            String nomPrenom = rdv.getPatient().get_nom() + " " + rdv.getPatient().get_prenom();
            // Écrire les données dans le fichier sous forme de "date;heure;nomPrenom"
            fileWriter.write(rdv.getDate() + ";" + rdv.getHeure() + ";" + nomPrenom + "\n");
        }
        fileWriter.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}



void WriteAllData() {
    StringBuilder stringBuilder = new StringBuilder();
    
    // Parcourt tous les rendez-vous et les ajoute à stringBuilder
    for (int i = 0; i < gestionRdv.ListeRdv.size(); i++) {
        RendezVous rdv = gestionRdv.ListeRdv.get(i);
        stringBuilder.append("╔════════════════════════════════════════╗\n");
        stringBuilder.append("║ PATIENT: " + rdv.getPatient().get_nom() + " " + rdv.getPatient().get_prenom()+"\n");
        stringBuilder.append("║ DATE : " + rdv.getDate() + "\n");
        stringBuilder.append("║ HEURE: " + rdv.getHeure() + "\n");
        stringBuilder.append("╚════════════════════════════════════════╝\n\n");
    }
    
    // Vérifie si le StringBuilder n'est pas vide avant d'écrire dans le fichier
    if (stringBuilder.length() > 0) {
        // Met à jour le contenu de la zone de texte avec stringBuilder
        Liste.setText(stringBuilder.toString());
    }
}


    
void readAllData() {
    try {
        File file = new File("datardvs.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println("Données lues : " + data); // Ajout d'une instruction d'impression
            String[] curData = data.split(";");
            // Vérifie si curData a la taille attendue
            if (curData.length >= 3) {
                // Récupère le nom et le prénom du patient
                String[] patientData = curData[2].split(" ");
                String nom = patientData[0];
                String prenom = patientData[1];

                // Crée un objet Patient avec le nom et le prénom récupérés
                Patients patient = new Patients(nom, prenom);

                // Crée un objet RendezVous avec les autres données
                RendezVous rdv = new RendezVous();
                rdv.setPatient(patient);
                // Convertit la date en LocalDate
                LocalDate date = LocalDate.parse(curData[0]);
                rdv.setDate(date);
                // Convertit l'heure en LocalTime
                LocalTime heure = LocalTime.parse(curData[1]);
                rdv.setHeure(heure);
                gestionRdv.ListeRdv.add(rdv);
            } else {
                // Affiche un message d'avertissement si la ligne ne contient pas suffisamment de données
                System.out.println("Données incomplètes : " + data);
            }
        }
        scanner.close();
        
        // Après avoir lu les données, mettez à jour l'affichage
        System.out.println("Nombre de rendez-vous lus : " + gestionRdv.ListeRdv.size()); // Ajout d'une instruction d'impression
        WriteAllData();
    } catch (Exception e) {
        e.printStackTrace();
    }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Liste = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(67, 142, 242));

        jPanel2.setBackground(new java.awt.Color(4, 85, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTE DES RENDEZ VOUS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        Liste.setColumns(20);
        Liste.setRows(5);
        jScrollPane1.setViewportView(Liste);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments*/
    public static void main(String args[]) {
    GestionRdv gestionRdv = new GestionRdv();
    LISTERDVS listeRdv = new LISTERDVS(gestionRdv); // Passer la liste de rendez-vous depuis GestionRdv

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
    private javax.swing.JTextArea Liste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
