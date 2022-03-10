package com.practica.controller;

import com.practica.domain.Estado;
import com.practica.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
   
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Estamos usando Spring");
        
        var estados = estadoService.getEstado();
        
        model.addAttribute("estados", estados);
        
        return "index";
    }
    
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado){
        
        return "modificarEstado";
    }
    
   @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado){
        estadoService.save(estado);
        return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{id_estado}")
    public String modificarEstado(Estado estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{id_estado}")
    public String eliminarEstado(Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
}