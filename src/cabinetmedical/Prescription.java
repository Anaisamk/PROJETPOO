/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinetmedical;

/**
 *
 * @author anais
 */
public class Prescription {
    // Attributs
    private String medicament;
    private String posologie;
    private String typeExamen;
    private String instructions;

    // Constructeur
    public Prescription(String medicament, String posologie, String typeExamen, String instructions) {
        this.medicament = medicament;
        this.posologie = posologie;
        this.typeExamen = typeExamen;
        this.instructions = instructions;
    }

    // Méthodes d'accès (getters) et de modification (setters) pour chaque attribut
    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public String getTypeExamen() {
        return typeExamen;
    }

    public void setTypeExamen(String typeExamen) {
        this.typeExamen = typeExamen;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
