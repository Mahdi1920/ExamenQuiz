package tn.esprit.spring.examenquiz.Entiies;

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
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Integer idQuestion;
    String libelleQ;
    @Enumerated(EnumType.STRING)
    Complexite comlexite;

    @OneToMany(cascade =CascadeType.ALL)
    List<Reponse> reponses;
    @ManyToOne
    Quiz quiz;
}
