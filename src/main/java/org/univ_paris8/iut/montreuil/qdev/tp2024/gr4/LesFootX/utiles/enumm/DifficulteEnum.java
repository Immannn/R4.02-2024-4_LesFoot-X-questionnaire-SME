package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm;

public enum DifficulteEnum {
    FACILE(1, "Facile"),
    MOYEN(2, "Moyen"),
    DIFFICILE(3, "Difficile");

    private final int id;
    private final String label;

    // Constructeur privé de l'énumération
    private DifficulteEnum(int id, String label) {
        this.id = id;
        this.label = label;
    }

    // Accesseurs pour les attributs de l'énumération
    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
