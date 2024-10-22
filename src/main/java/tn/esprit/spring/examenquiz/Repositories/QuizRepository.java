package tn.esprit.spring.examenquiz.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.examenquiz.Entiies.Quiz;

public interface QuizRepository extends CrudRepository<Quiz,Integer> {
    Quiz findByTitreLike(String titreQuiz);
}
