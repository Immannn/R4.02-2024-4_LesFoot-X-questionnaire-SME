package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.test.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.test.MockTest.IServiceQuestionnaireChargerListeQuestMock1;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.test.MockTest.IServiceQuestionnaireChargerListeQuestMock2;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.test.MockTest.IServiceQuestionnaireChargerListeQuestMock3;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FormatFichierInvalideException;

import java.util.ArrayList;
import java.util.List;

class ChargerQuestionnaireTest {

    @Override
    public QuestionnairesDTO chargerQfuestionnaire(String path) throws LienException {
        //new QuestionDTO(1,1,Langue.ANGLAIS, " ", " ", 1, " ", " " , " ")
        List<QuestionDTO> questions = new ArrayList<>();

        // Add sample questions
        questions.add(new QuestionDTO(1, 1, Langue.FRANÇAIS  , "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", 1, "Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.", "https://fr.wikipedia.org/wiki/Matériel_de_golf", ""));

        return new QuestionnaireDTO(questions, 1);
    }

    @Override
    public QuestionDTO chargerUneQuestion(int idQuestion) throws NumTropGrandException {
        return new QuestionDTO(1, 1, Langue.FRANÇAIS  , "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "Tee", 1, "Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.", "https://fr.wikipedia.org/wiki/Matériel_de_golf", "");
    }

    @Test
    void testFichierIntrouvableException() {
        IServiceQuestionnaireChargerListeQuestMock1 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock1();

        assertThrows(FichierIntrouvableException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("url/fictive/nonExistant.csv");
        });
    }

    @Test
    void testFichierVideException() {
        IServiceQuestionnaireChargerListeQuestMock2 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock2();

        assertThrows(FichierVideException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("/home/etudiants/info/zgueddou/IdeaProjects/R4.02-2024-4_LesFootX-questionnaire-SME/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr4/LesFootX/ressources/fichiervide.csv");
        });
    }

    @Test
    void testFormatFichierInvalideException() {
        IServiceQuestionnaireChargerListeQuestMock3 iQuestionnaire = new IServiceQuestionnaireChargerListeQuestMock3();

        assertThrows(FormatFichierInvalideException.class, () -> {
            iQuestionnaire.chargerQuestionnaire("chemin/vers/fichierAvecMauvaisFormat.csv");
        });
    }
}


