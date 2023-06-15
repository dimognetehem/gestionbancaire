package org.institutsaintjean.gestionbancaire.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.institutsaintjean.gestionbancaire.model.Employe;
import org.institutsaintjean.gestionbancaire.repository.EmployeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private EmployeRepository employeRepository;

    @RequestMapping("/login")
    public String loginForm() {
        return "loginpage";
    }

    @RequestMapping("/")
    public String loginPage(){
        return "loginpage";
    }
    @RequestMapping("/login-error")
    public String loginError(Model model, Employe employe) {
//        if(!employe.equals()){
//            model.addAttribute("notActive", true);
//        }
        model.addAttribute("loginError", true);
        return "loginpage";

    }
    @RequestMapping("/accueil")
    public String login(){
        return "homepage";
    }


    @RequestMapping("/access-denied")
    public String accesrefuse(){
        return "accesrefuse";
    }

    @RequestMapping("/erreur404")
    public String errornotfound(HttpServletRequest request, ch.qos.logback.core.model.Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        System.out.println(status);
        return "error404";
    }
}
