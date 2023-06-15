package org.institutsaintjean.gestionbancaire.controller;


import org.institutsaintjean.gestionbancaire.config.SecurityConfig;
import org.institutsaintjean.gestionbancaire.model.Employe;
import org.institutsaintjean.gestionbancaire.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeController{


    @Autowired
    EmployeService employeService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @GetMapping("/listE")
    public String getEmployes(Model model){
        Iterable<Employe> employes = employeService.getEmployes();
        model.addAttribute("ListeEmployes", employes);
        return "listeemployes";
    }
    @GetMapping("/delE/{idEmp}")
    public String deleteEmploye(@PathVariable(value = "idEmp") Long idEmp){
        Employe employe = employeService.getEmploye(idEmp);
        employe.setActiveEmp(false);
        employeService.saveEmploye(employe);
        return "redirect:/listE";
    }

    @GetMapping("/addE")
    public String addEmploye(Model model){
        Employe employe = new Employe();
        model.addAttribute("employe", employe);
        return "creeremploye";
    }

    @PostMapping("/saveE")
    public String saveEmploye(@ModelAttribute("employe") Employe employe){
        employe.setPassword(passwordEncoder.encode(employe.getPassword()));
        employeService.saveEmploye(employe);
        return "redirect:/listE";
    }

    @GetMapping("/changePrivi")
    public String newPrivi(Model model){
        Employe employe = new Employe();
        model.addAttribute("employe", employe);
        return "privilege";
    }
}
