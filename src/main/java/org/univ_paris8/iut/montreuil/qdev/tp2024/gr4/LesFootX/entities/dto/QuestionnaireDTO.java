package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto;

import java.util.List;
import java.util.Objects;

public class QuestionnaireDTO {

    private List<QuestionDTO> lsteQuestion;

    public QuestionnaireDTO(List<QuestionDTO> lsteQuestion) {
        this.lsteQuestion = lsteQuestion;
    }

    public List<QuestionDTO> getLsteQuestion() {
        return lsteQuestion;
    }

    public void setLsteQuestion(List<QuestionDTO> lsteQuestion) {
        this.lsteQuestion = lsteQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnaireDTO that = (QuestionnaireDTO) o;
        return Objects.equals(lsteQuestion, that.lsteQuestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lsteQuestion);
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "lsteQuestion=" + lsteQuestion +
                '}';
    }
}
