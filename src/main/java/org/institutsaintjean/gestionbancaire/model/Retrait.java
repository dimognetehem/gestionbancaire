package org.institutsaintjean.gestionbancaire.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue(value = "RETRAIT")
public class Retrait extends Operation{
}
