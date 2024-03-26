package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.bo;

import java.util.Objects;

public class QuestionBO {
    private String id_questionnaire;
    private String num_questionnaire;
    private String langue;
    private String libelle_question;
    private String reponse;
    private String difficulte;
    private String explication;
    private String reference;

    public QuestionBO(String num_questionnaire, String langue, String libelle_question, String reponse, String difficulte, String explication, String reference) {
        this.num_questionnaire = num_questionnaire;
        this.langue = langue;
        this.libelle_question = libelle_question;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public String getId_questionnaire() {
        return id_questionnaire;
    }

    public void setId_questionnaire(String id_questionnaire) {
        this.id_questionnaire = id_questionnaire;
    }

    public String getNum_questionnaire() {
        return num_questionnaire;
    }

    public void setNum_questionnaire(String num_questionnaire) {
        this.num_questionnaire = num_questionnaire;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
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

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
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
        QuestionBO that = (QuestionBO) o;
        return Objects.equals(id_questionnaire, that.id_questionnaire) && Objects.equals(num_questionnaire, that.num_questionnaire) && Objects.equals(langue, that.langue) && Objects.equals(libelle_question, that.libelle_question) && Objects.equals(reponse, that.reponse) && Objects.equals(difficulte, that.difficulte) && Objects.equals(explication, that.explication) && Objects.equals(reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_questionnaire, num_questionnaire, langue, libelle_question, reponse, difficulte, explication, reference);
    }

    @Override
    public String toString() {
        return "QuestionBO{" +
                "id_questionnaire='" + id_questionnaire + '\'' +
                ", num_questionnaire='" + num_questionnaire + '\'' +
                ", langue='" + langue + '\'' +
                ", libelle_question='" + libelle_question + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte='" + difficulte + '\'' +
                ", explication='" + explication + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
