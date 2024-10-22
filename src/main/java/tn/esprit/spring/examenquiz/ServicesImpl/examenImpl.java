package tn.esprit.spring.examenquiz.ServicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.examenquiz.Entiies.Candidat;
import tn.esprit.spring.examenquiz.Entiies.Niverau;
import tn.esprit.spring.examenquiz.Entiies.Question;
import tn.esprit.spring.examenquiz.Entiies.Quiz;
import tn.esprit.spring.examenquiz.Repositories.CandidatRepository;
import tn.esprit.spring.examenquiz.Repositories.QuestionRepository;
import tn.esprit.spring.examenquiz.Repositories.QuizRepository;
import tn.esprit.spring.examenquiz.Repositories.ReponseRepository;
import tn.esprit.spring.examenquiz.ServicesInterface.examenInterface;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class examenImpl implements examenInterface {
    CandidatRepository candidatRepo;
    ReponseRepository reponseRepo;
    QuestionRepository questionRepo;
    QuizRepository quizRepo;
    @Override
    public Candidat ajouterCandidat(Candidat candidat) {
        return candidatRepo.save(candidat);
    }

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) {
        Candidat candidat = candidatRepo.findById(idCandidat).orElse(null);
        Quiz quiz = quizRepo.findByTitreLike(titreQuiz);
        quiz.getCandidats().add(candidat);
        quizRepo.save(quiz);
        candidat.setNbQuiz(candidat.getNbQuiz()+1);
        candidatRepo.save(candidat);
        return quiz;
    }

    @Override
    public List<Candidat> recupererCandidat(String specialite, Niverau niveau) {
        LocalDate dateQuiz= LocalDate.now();
        return candidatRepo.findByNiveauAndQuizsSpesialiteAndQuizsDateQuizAfter(niveau,specialite,dateQuiz);
    }

    @Override
    public Question ajouterQuestEtRepEtAffecterQuestAQuiz(Question question, Integer idQuiz) {
        Quiz quiz = quizRepo.findById(idQuiz).orElse(null);
        question.setQuiz(quiz);
        return questionRepo.save(question);
    }
}
