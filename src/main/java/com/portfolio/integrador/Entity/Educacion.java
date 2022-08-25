package com.portfolio.integrador.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_edu;
    private String institucion;
    private String titulo;
    private String direccion;
    private int año;

    public Educacion(Long id_edu, String institucion, String titulo, String direccion, int año) {
        this.id_edu = id_edu;
        this.institucion = institucion;
        this.titulo = titulo;
        this.direccion = direccion;
        this.año = año;
    }
    
    
    
}
