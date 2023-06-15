package org.institutsaintjean.gestionbancaire.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue(value = "DEPOT")
public class Depot extends Operation{
}
