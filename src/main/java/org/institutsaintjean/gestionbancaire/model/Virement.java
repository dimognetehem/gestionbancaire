package org.institutsaintjean.gestionbancaire.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue(value = "VIREMENT")
public class Virement extends Operation{


    @ManyToOne
    @JoinColumn(name="numCompte")
    private Compte destinataire;
}
