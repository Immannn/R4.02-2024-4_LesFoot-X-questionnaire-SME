package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm.DifficulteEnum;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm.LanguesEnum;

import java.util.Objects;

public class QuestionDTO {
    private long id_questionnaire;
    private int num_questionnaire;
    private LanguesEnum langue;
    private String libelle_question;
    private String reponse;
    private DifficulteEnum difficulte;
    private String explication;
    private String reference;

    public QuestionDTO(long id_questionnaire, int num_questionnaire, LanguesEnum langue, String libelle_question, String reponse, DifficulteEnum difficulte, String explication, String reference) {
        this.id_questionnaire = id_questionnaire;
        this.num_questionnaire = num_questionnaire;
        this.langue = langue;
        this.libelle_question = libelle_question;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public long getId_questionnaire() {
        return id_questionnaire;
    }

    public void setId_questionnaire(long id_questionnaire) {
        this.id_questionnaire = id_questionnaire;
    }

    public int getNum_questionnaire() {
        return num_questionnaire;
    }

    public void setNum_questionnaire(int num_questionnaire) {
        this.num_questionnaire = num_questionnaire;
    }

    public LanguesEnum getLangue() {
        return langue;
    }

    public void setLangue(LanguesEnum langue) {
        this.langue = langue;
    }

    public String getLibelle_question() {
        return libelle_question;
    }

    public void setLibelle_question(String libelle_question) {
        this.libelle_question = libelle_question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public DifficulteEnum getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(DifficulteEnum difficulte) {
        this.difficulte = difficulte;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDTO that = (QuestionDTO) o;
        return id_questionnaire == that.id_questionnaire && num_questionnaire == that.num_questionnaire && langue == that.langue && Objects.equals(libelle_question, that.libelle_question) && Objects.equals(reponse, that.reponse) && difficulte == that.difficulte && Objects.equals(explication, that.explication) && Objects.equals(reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_questionnaire, num_questionnaire, langue, libelle_question, reponse, difficulte, explication, reference);
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "id_questionnaire=" + id_questionnaire +
                ", num_questionnaire=" + num_questionnaire +
                ", langue=" + langue +
                ", libelle_question='" + libelle_question + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte=" + difficulte +
                ", explication='" + explication + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
