package org.institutsaintjean.gestionbancaire.service;


import org.institutsaintjean.gestionbancaire.model.Employe;
import org.institutsaintjean.gestionbancaire.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    public Employe getEmploye(final Long id){
        return employeRepository.getReferenceById(id);
    }

    public List<Employe> getEmployes(){
        return employeRepository.findAllByActiveEmp(true);
    }

    public void saveEmploye(Employe employe){
        employeRepository.save(employe);
    }

    public void deleteEmploye(Long idEmp){ employeRepository.deleteById(idEmp);}
}
