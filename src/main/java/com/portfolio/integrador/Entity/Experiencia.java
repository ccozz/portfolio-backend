package com.portfolio.integrador.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_exp;
    private String lugar;
    private String cargo;
    private String tareas;
    private int fecha;
    private String img_exp;

    public Experiencia(Long id_exp, String lugar, String cargo, String tareas, int fecha, String img_exp) {
        this.id_exp = id_exp;
        this.lugar = lugar;
        this.cargo = cargo;
        this.tareas = tareas;
        this.fecha = fecha;
        this.img_exp = img_exp;
    }

    

    
}
