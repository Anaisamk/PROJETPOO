/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabinetmedical;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author anais
 */
public class LISTEPATIENTS extends javax.swing.JFrame {
ArrayList<Patients> allPatients = new ArrayList<>();
   private static LISTEPATIENTS instance;

    // Reste du code de la classe...

    // Méthode statique pour obtenir l'instance unique de LISTEPATIENTS
    public static LISTEPATIENTS getInstance() {
        if (instance == null) {
            instance = new LISTEPATIENTS();
        }
        return instance;
    }
    /**
     * Creates new form LISTEPATIENTS
     */
    public LISTEPATIENTS() {
        initComponents();
        readAllData();
        WriteAllData();
   
    }
    void SaveAllData(){
        try{
            FileWriter fileWriter = new FileWriter("datapatients.txt");
            for (int i=0;i<allPatients.size();i++){
                fileWriter.write(allPatients.get(i).get_nom()+";"+allPatients.get(i).get_prenom()+";"+allPatients.get(i).get_age()+";"+allPatients.get(i).get_sexe()+";"+allPatients.get(i).get_groupe_sanguin()+";"+allPatients.get(i).get_num_tel()+";"+allPatients.get(i).get_num_dossier()+";"+allPatients.get(i).get_num_assurance()+"\n");

            }fileWriter.close();
        }catch (Exception e){}
    }
void WriteAllData() {
    dp.setText(""); // Efface le contenu actuel de la zone de texte

    // Parcourt tous les patients et les affiche avec une mise en forme adaptée
    for (int i = 0; i < allPatients.size(); i++) {
        Patients patient = allPatients.get(i);
        dp.append("╔════════════════════════════════════════╗\n");
        dp.append("║ Nom: " + patient.get_nom() + "\n");
        dp.append("║ Age: " + patient.get_age() + "\n");
        dp.append("║ Sexe: " + patient.get_sexe() + "\n");
        dp.append("║ Groupe Sanguin: " + patient.get_groupe_sanguin() + "\n");
        dp.append("║ Numéro de Téléphone: " + patient.get_num_tel() + "\n");
        dp.append("║ Numéro de Dossier: " + patient.get_num_dossier() + "\n");
        dp.append("║ Numéro d'Assurance: " + patient.get_num_assurance() + "\n");
        dp.append("╚════════════════════════════════════════╝\n\n");
    }
}

void readAllData(){
    try{
        File pfile = new File("datapatients.txt");
        Scanner scanner = new Scanner(pfile);
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            String[] curData = data.split(";");
            Patients patient = new Patients();
            patient.set_nom(curData[0]);
            patient.set_prenom(curData[1]);
            patient.set_age(curData[2]);
            patient.set_sexe(curData[3]);
            patient.set_groupe_sanguin(curData[4]);
            patient.set_num_tel(curData[5]);
            patient.set_num_dossier(curData[6]);
            patient.set_num_assurance(curData[7]);
            allPatients.add(patient);
        }
        scanner.close();
        
        // Après avoir lu les données, mettez à jour l'affichage
        WriteAllData();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

   // Méthode pour ajouter un nouveau patient à la liste
    public void addPatient(Patients patient) {
        allPatients.add(patient);
        // Mettre à jour l'affichage de la liste des patients
        WriteAllData();
        SaveAllData();
    }

    // Reste du code de la classe...






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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTE DES PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        dp.setColumns(20);
        dp.setRows(5);
        jScrollPane2.setViewportView(dp);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     */
   /* @param args the command line arguments */
     
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Utilisez getInstance() pour obtenir l'instance unique de LISTEPATIENTS
            LISTEPATIENTS listePatients = LISTEPATIENTS.getInstance();
            listePatients.setVisible(true);
            listePatients.WriteAllData(); // Déplacer cet appel ici
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
