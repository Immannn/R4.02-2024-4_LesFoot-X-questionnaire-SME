package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.test.MockTest;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FormatFichierInvalideException;

import java.io.IOException;

public class IServiceQuestionnaireChargerListeQuestMock2 implements IQuestionnaire {
    @Override
    public QuestionnairesDTO chargerQuestionnaire(String url) throws FichierIntrouvableException, FormatFichierInvalideException, IOException, FichierVideException {
        throw new FichierVideException("Fichier vide: " + url);
    }
}
