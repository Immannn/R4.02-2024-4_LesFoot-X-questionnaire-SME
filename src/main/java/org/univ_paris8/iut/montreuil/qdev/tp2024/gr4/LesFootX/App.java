package org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.services.impl.QuestionnaireImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierIntrouvableException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FichierVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr4.LesFootX.utiles.exception.FormatFichierInvalideException;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static class Main {
        public static void main(String[] args){
            String cheminFichier = "/home/etudiants/info/aboukebeche/IdeaProjects/Questionnaire-sme/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr4/LesFootX/ressources/questionsQuizz_V1.1.csv"; // Remplacez par le chemin de votre fichier CSV
            QuestionnaireImpl l = new QuestionnaireImpl();
            try {
                QuestionnairesDTO questionnairesDTO = l.chargerQuestionnaire(cheminFichier);
                System.out.println(questionnairesDTO);
            } catch (FichierIntrouvableException e) {
                throw new RuntimeException(e);
            } catch (FormatFichierInvalideException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (FichierVideException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Chargement réussi !");

        }
    }
}
