package tn.esprit.spring.examenquiz.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.examenquiz.Entiies.Question;

public interface QuestionRepository extends CrudRepository<Question,Integer> {
}
