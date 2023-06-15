package org.institutsaintjean.gestionbancaire.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static jakarta.persistence.DiscriminatorType.STRING;
import static jakarta.persistence.InheritanceType.SINGLE_TABLE;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_COMPTE", discriminatorType=STRING)
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numCompte;

    private Long solde;

    @Column(nullable = false)
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "codeCli")
    private Client client;

    @ManyToMany
    @JoinTable( name = "Concerne",
            joinColumns = @JoinColumn( name = "numCompte" ),
            inverseJoinColumns = @JoinColumn( name = "codeOp" ) )
    private List<Operation> operations = new ArrayList<>();

}
