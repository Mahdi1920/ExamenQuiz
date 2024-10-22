package tn.esprit.spring.examenquiz.Entiies;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Integer idQuiz;
    String titreQuiz;
    String specialite;
    LocalDate dateQuiz ;

    @OneToMany(mappedBy="quiz")
    List<Question> questions;
    @ManyToMany
    List<Candidat>candidats = new ArrayList<>();
}
