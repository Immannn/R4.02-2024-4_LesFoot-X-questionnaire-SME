package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception;

public class FichierVideException extends Exception {
    private String fichier;

    public FichierVideException(String fichier) {
        this.fichier = fichier;
    }

    @Override
    public String toString() {
        return "Le fichier '" + fichier + "' est vide.";
    }
}
