package org.institutsaintjean.gestionbancaire.config;

import org.institutsaintjean.gestionbancaire.model.Employe;
import org.institutsaintjean.gestionbancaire.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Component
public class EmployeDetailsService implements UserDetailsService {


    @Autowired
    private EmployeRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Employe> employe = repository.findEmployeByEmailEmp(email);
//        System.out.println(employe.map(EmployeDetails::new));
        return employe.map(EmployeDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + email));

    }


}
