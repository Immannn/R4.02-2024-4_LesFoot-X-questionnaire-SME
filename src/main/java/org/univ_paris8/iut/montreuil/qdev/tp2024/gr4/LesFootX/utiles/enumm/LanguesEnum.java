package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm;

public enum LanguesEnum {
    FRANÇAIS(1, "FR", "Française"),
    ANGLAIS(2, "EN", "Anglaise"),
    ARABE(3, "AR", "Arabe");

    private final int id;
    private final String code;
    private final String label;

    private LanguesEnum(int id, String code, String label) {
        this.id = id;
        this.code = code;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}
