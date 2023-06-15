package org.institutsaintjean.gestionbancaire.repository;


import org.institutsaintjean.gestionbancaire.model.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long> {
}
