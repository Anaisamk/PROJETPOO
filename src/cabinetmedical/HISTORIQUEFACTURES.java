/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmedical;

import java.io.File;
import java.io.FileWriter;
import static java.lang.Float.parseFloat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anis
 */
public class HISTORIQUEFACTURES extends javax.swing.JFrame {
    ArrayList<Facture> factures = new ArrayList<>();
    private static HISTORIQUEFACTURES instance;

    public static HISTORIQUEFACTURES getInstance() {
        if (instance == null) {
            instance = new HISTORIQUEFACTURES();
        }
        return instance;
    }
    /**
     * Creates new form HISTORIQUEFACTURES
     */
    public HISTORIQUEFACTURES() {
        initComponents();
        readAllData();
        WriteAllData();
    }
    
    void SaveAllData() {
        try {
            FileWriter fileWriter = new FileWriter("src/cabinetmedical/factures.txt");
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            for (Facture f : factures) {
                Patients patient = f.getPatient();
                if (patient != null) {
                    fileWriter.write(patient.get_nom() + ";" + patient.get_prenom() + ";" + patient.get_num_dossier() + ";" + f.getMontant() + ";" + f.getDateEmission().format(dateFormatter) + "\n");
                }
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void WriteAllData() {
        dpf.setText("");
        for (Facture f : factures) {
            dpf.append("╔════════════════════════════════════════╗\n");
            dpf.append("║ Nom: " + f.getPatient().get_nom() + "\n");
            dpf.append("║ Prenom: " + f.getPatient().get_prenom() + "\n");
            dpf.append("║ Numero du dossier: " + f.getPatient().get_num_dossier() + "\n");
            dpf.append("║ Montant a payer: " + f.getMontant() + "\n");
            dpf.append("║ Date D'emission: " + f.getDateEmission() + "\n");
        }
    }

    void readAllData() {
        try {
            File pfile = new File("src/cabinetmedical/factures.txt");
            Scanner scanner = new Scanner(pfile);
            DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter dateFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE; // for "yyyy-MM-dd" format
            
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine().trim();
                String[] curData = data.split(";");
                
                Facture f = new Facture();
                Patients patient = new Patients();
                patient.set_nom(curData[0].trim());
                patient.set_prenom(curData[1].trim());
                patient.set_num_dossier(curData[2].trim());
                f.setPatient(patient);
                
                f.setMontant(parseFloat(curData[3].trim()));
                
                String dateStr = curData[4].trim();
                try {
                    f.setDateEmission(LocalDate.parse(dateStr, dateFormatter1));
                } catch (DateTimeParseException e) {
                    f.setDateEmission(LocalDate.parse(dateStr, dateFormatter2));
                }
                
                factures.add(f);
            }
            scanner.close();
            
            // After reading the data, update the display
            WriteAllData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addfactures(Facture f) {
        factures.add(f);
        // Mettre à jour l'affichage de la liste des dossiers
        WriteAllData();
        SaveAllData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dpf = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(67, 142, 242));

        dpf.setColumns(20);
        dpf.setRows(5);
        jScrollPane2.setViewportView(dpf);

        jPanel3.setBackground(new java.awt.Color(4, 85, 191));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historique des factures");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HISTORIQUEFACTURES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HISTORIQUEFACTURES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HISTORIQUEFACTURES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HISTORIQUEFACTURES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HISTORIQUEFACTURES historiquefactures = HISTORIQUEFACTURES.getInstance();
            historiquefactures.setVisible(true);
            historiquefactures.WriteAllData();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
