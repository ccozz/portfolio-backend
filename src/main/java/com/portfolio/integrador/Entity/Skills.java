package com.portfolio.integrador.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ski;
    private String img_ski;
    private int porcentaje;
    private String skill;

    public Skills(Long id_ski, String img_ski, int porcentaje, String skill) {
        this.id_ski = id_ski;
        this.img_ski = img_ski;
        this.porcentaje = porcentaje;
        this.skill = skill;
    }
    
    
    
}
