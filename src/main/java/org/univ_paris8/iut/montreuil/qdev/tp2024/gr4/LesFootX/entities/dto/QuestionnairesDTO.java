package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto;

import java.util.List;
import java.util.Objects;

public class QuestionnairesDTO {

    private List<QuestionnaireDTO> listeQuestionnaires;

    public QuestionnairesDTO(List<QuestionnaireDTO> listeQuestionnaires) {
        this.listeQuestionnaires = listeQuestionnaires;
    }

    public List<QuestionnaireDTO> getListeQuestionnaires() {
        return listeQuestionnaires;
    }

    public void setListeQuestionnaires(List<QuestionnaireDTO> listeQuestionnaires) {
        this.listeQuestionnaires = listeQuestionnaires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnairesDTO that = (QuestionnairesDTO) o;
        return Objects.equals(listeQuestionnaires, that.listeQuestionnaires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listeQuestionnaires);
    }

    @Override
    public String toString() {
        return "QuestionnairesDTO{" +
                "listeQuestionnaires=" + listeQuestionnaires +
                '}';
    }
}
