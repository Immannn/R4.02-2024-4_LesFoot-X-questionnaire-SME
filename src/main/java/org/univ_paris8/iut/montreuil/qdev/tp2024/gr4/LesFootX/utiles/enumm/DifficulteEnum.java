package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm;

public enum DifficulteEnum {
    FACILE(1, "Facile"),
    MOYEN(2, "Moyen"),
    DIFFICILE(3, "Difficile");

    private final int id;
    private final String label;

    DifficulteEnum(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static DifficulteEnum getById(int id) {
        for (DifficulteEnum value : values()) {
            if (value.getId() == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("Aucune constante d'énumération DifficulteEnum avec id: " + id);
    }
}
