package org.institutsaintjean.gestionbancaire.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codeCli;

    @Column(nullable = false)
    private String nomCli;

    private String prenomCli;

    @Column(unique = true)
    private String emailCli;

    @Column(nullable = false)
    private String telCli;

    @Column(nullable = false)
    private boolean isActiveCli = true;
}
