package org.institutsaintjean.gestionbancaire.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static jakarta.persistence.DiscriminatorType.STRING;
import static jakarta.persistence.InheritanceType.SINGLE_TABLE;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OPERATION", discriminatorType=STRING)
@Table(name = "operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codeOp;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable = false)
    private Date dateOp;

    @ManyToOne
    @JoinColumn(name = "idEmp")
    private Employe employe;

    @ManyToMany
    @JoinTable( name = "Concerne",
            joinColumns = @JoinColumn( name = "codeOp" ),
            inverseJoinColumns = @JoinColumn( name = "numCompte" ) )
    private List<Compte> comptes = new ArrayList<>();
}
