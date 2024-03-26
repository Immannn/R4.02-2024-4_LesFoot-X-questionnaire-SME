package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm.DifficulteEnum;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.enumm.LanguesEnum;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FormatFichierInvalideException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireImpl implements IQuestionnaire {

    @Override
    public QuestionnairesDTO chargerQuestionnaire(String url) throws FichierIntrouvableException, FormatFichierInvalideException, IOException, FichierVideException {
        List<QuestionBO> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length != 8) {
                    throw new FormatFichierInvalideException("Le format du fichier est invalide : " + url);
                }
                QuestionBO question = new QuestionBO(
                        data[1], data[2], data[3], data[4], data[5], data[6], data[7]
                );
                questions.add(question);
            }
        } catch (IOException e) {
            throw new FichierIntrouvableException("Fichier introuvable : " + url);
        }

        if (questions.isEmpty()) {
            throw new FichierVideException("Le fichier est vide : " + url);
        }

        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        for (QuestionBO bo : questions) {
            QuestionDTO dto = new QuestionDTO();
            dto.setNum_questionnaire(Integer.parseInt(bo.getNum_questionnaire()));
            dto.setLangue(LanguesEnum.valueOf(bo.getLangue().toUpperCase()));
            dto.setLibelle_question(bo.getLibelle_question());
            dto.setReponse(bo.getReponse());
            int difficulteId = Integer.parseInt(bo.getDifficulte());
            dto.setDifficulte(DifficulteEnum.getById(difficulteId));
            dto.setExplication(bo.getExplication());
            dto.setReference(bo.getReference());
            questionnaireDTO.addQuestion(dto);
        }
        QuestionnairesDTO questionnairesDTO = new QuestionnairesDTO();
        questionnairesDTO.addQuestionnaire(questionnaireDTO);
        return questionnairesDTO;
    }

}
