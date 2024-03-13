package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception;

public class FichierIntrouvableException extends Exception {
    private String fichier;

    public FichierIntrouvableException(String fichier) {
        this.fichier = fichier;
    }

    @Override
    public String toString() {
        return "Le fichier '" + fichier + "' est introuvable.";
    }
}
