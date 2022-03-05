package com.practica.domain;

import lombok.Data;

@Data
public class Estado {
    private int idEstado;
    private String nombreEstado;   
    private String capital;   
    private int poblacion;
    private boolean costas;

    public Estado() {
        
    }

    public Estado(int idEstado, String nombreEstado, String capital, int poblacion, boolean costas) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

    
}
