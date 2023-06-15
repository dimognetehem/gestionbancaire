package org.institutsaintjean.gestionbancaire.repository;


import org.institutsaintjean.gestionbancaire.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
