package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception;

public class FormatFichierInvalideException extends Exception {
    private String fichier;

    public FormatFichierInvalideException(String fichier) {
        this.fichier = fichier;
    }

    @Override
    public String toString() {
        return "Le format du fichier '" + fichier + "' est invalide.";
    }
}
