package org.institutsaintjean.gestionbancaire.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue(value = "EPARGNE")
public class CompteEpargne extends Compte{

    private int tauxInteret;
}
