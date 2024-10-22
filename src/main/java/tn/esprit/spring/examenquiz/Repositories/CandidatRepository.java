package tn.esprit.spring.examenquiz.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenquiz.Entiies.Candidat;
import tn.esprit.spring.examenquiz.Entiies.Niverau;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CandidatRepository extends CrudRepository<Candidat,Integer> {
    List<Candidat> findByNiveauAndQuizsSpesialiteAndQuizsDateQuizAfter( Niverau niveau,String specialite, LocalDate  dateQuiz);
}
