package tn.esprit.spring.examenquiz.ServicesInterface;

import tn.esprit.spring.examenquiz.Entiies.Candidat;
import tn.esprit.spring.examenquiz.Entiies.Niverau;
import tn.esprit.spring.examenquiz.Entiies.Question;
import tn.esprit.spring.examenquiz.Entiies.Quiz;

import java.util.List;

public interface examenInterface {
    public Candidat ajouterCandidat(Candidat candidat) ;
    public Quiz ajouterQuiz(Quiz quiz);
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) ;
    public List<Candidat> recupererCandidat (String specialite, Niverau niveau) ;
    public Question ajouterQuestEtRepEtAffecterQuestAQuiz(Question question, Integer idQuiz) ;
}
