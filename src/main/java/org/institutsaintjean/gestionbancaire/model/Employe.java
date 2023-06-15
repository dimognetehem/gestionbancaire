package org.institutsaintjean.gestionbancaire.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employe")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmp;

    @Column(nullable = false)
    private String nomEmp;

    private String prenomEmp;

    @Column(unique = true)
    private String emailEmp;

    @Column(nullable = false)
    private boolean activeEmp = true;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String roles;

}
