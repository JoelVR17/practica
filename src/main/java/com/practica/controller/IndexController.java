package com.practica.controller;

import com.practica.dao.EstadoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
   
    @Autowired
    private EstadoDao estadoDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Estamos usando Spring");
        
        var estados = estadoDao.findAll();
        
        model.addAttribute("estados", estados);
        
        return "index";
    }
}