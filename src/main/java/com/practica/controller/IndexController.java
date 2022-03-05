package com.practica.controller;

import com.practica.domain.Estado;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
   
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Estamos usando Spring");
        
        
        Estado estado1 = new Estado(1, "Costa Rica", "San Jose", 1000, false);
        Estado estado2 = new Estado(2, "Nicaragua", "Managua", 1000, false);
        
        var estados = Arrays.asList(estado1, estado2);
        
        model.addAttribute("estados", estados);
        
        return "index";
    }
}
