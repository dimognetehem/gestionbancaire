package org.institutsaintjean.gestionbancaire.repository;


import org.institutsaintjean.gestionbancaire.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
}
