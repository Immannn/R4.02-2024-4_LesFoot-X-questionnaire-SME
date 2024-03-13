package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FormatFichierInvalideException;

import java.io.IOException;

public interface IQuestionnaire {

    public QuestionnairesDTO chargerQuestionnaire(String url, String nomFichier)
            throws FichierIntrouvableException, FormatFichierInvalideException, IOException;

}
