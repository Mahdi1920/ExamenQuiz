package tn.esprit.spring.examenquiz.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.examenquiz.Entiies.Candidat;
import tn.esprit.spring.examenquiz.Entiies.Niverau;
import tn.esprit.spring.examenquiz.Entiies.Question;
import tn.esprit.spring.examenquiz.Entiies.Quiz;
import tn.esprit.spring.examenquiz.ServicesInterface.examenInterface;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CandidatController {
    examenInterface candidatInterface;
    @PostMapping("/candidat/addCandidat")
    public Candidat ajouterCandidat(@RequestBody Candidat candidat) {
        return candidatInterface.ajouterCandidat(candidat);
    }
    @PostMapping("/quiz/addQuiz")
    public Quiz ajouterQuiz(@RequestBody Quiz quiz) {
        return candidatInterface.ajouterQuiz(quiz);
    }
    @PutMapping("/quiz/affecterQuizCandidat/{titreQuiz}/{idCandidat}")
    public Quiz affecterQuizCandidat(@PathVariable String titreQuiz, @PathVariable Integer idCandidat) {
        return candidatInterface.affecterQuizCandidat(titreQuiz, idCandidat);
    }
    @GetMapping("/candidat/recupererCandidat")
    public List<Candidat> recupererCandidat(String specialite, Niverau niveau) {
        return candidatInterface.recupererCandidat(specialite, niveau);
    }
    @PostMapping("/question/ajouterQuestEtRepEtAffecterQuestAQuiz/{idQuiz}")
    public Question ajouterQuestEtRepEtAffecterQuestAQuiz(@RequestBody Question question,@PathVariable Integer idQuiz) {
        return candidatInterface.ajouterQuestEtRepEtAffecterQuestAQuiz(question, idQuiz);
    }
}
