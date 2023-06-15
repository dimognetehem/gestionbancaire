package org.institutsaintjean.gestionbancaire.repository;


import org.institutsaintjean.gestionbancaire.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
    Optional<Employe> findEmployeByNomEmp(String username);
    Optional<Employe> findEmployeByEmailEmp(String email);
    List<Employe> findAllByActiveEmp(boolean activeEmp);
}
