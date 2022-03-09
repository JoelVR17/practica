package com.practica.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Data
@Entity
@Table(name="estado")

public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    //MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //SE ESTABLECEN LOS ATRIBUTOS
    private long id_estado;
    private String nombre_estado;   
    private String capital;   
    private int poblacion;
    private boolean costas;

    
    //SE ESTABLECEN LOS CONSTRUCTORES
    public Estado() {
        
    }

    public Estado(long id_estado, String nombre_estado, String capital, int poblacion, boolean costas) {
        this.id_estado = id_estado;
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
}