package org.institutsaintjean.gestionbancaire;

import org.institutsaintjean.gestionbancaire.model.*;
import org.institutsaintjean.gestionbancaire.repository.CompteCourantRepository;
import org.institutsaintjean.gestionbancaire.repository.CompteEpargneRepository;
import org.institutsaintjean.gestionbancaire.repository.CompteRepository;
import org.institutsaintjean.gestionbancaire.repository.EmployeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionbancaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionbancaireApplication.class, args);


//		CompteRepository compteCourantRepository =
//				configurableApplicationContext.getBean(CompteCourantRepository.class);
//		CompteRepository compteEpargneRepository =
//				configurableApplicationContext.getBean(CompteEpargneRepository.class);
//		Compte c1 = new CompteEpargne();
//		Compte c2 = new CompteCourant();
//
//		compteEpargneRepository.save(c1);
//		compteCourantRepository.save(c2);
		}


}
