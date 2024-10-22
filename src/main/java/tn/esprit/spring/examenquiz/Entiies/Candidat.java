package tn.esprit.spring.examenquiz.Entiies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Integer idCandidat;
    String nom;
    String prenom;
    Integer nbQuiz;
    @Enumerated(EnumType.STRING)
    Niverau niveau;
    @JsonIgnore
    @ManyToMany(mappedBy = "condidats")
    List<Quiz>quizs;


}
