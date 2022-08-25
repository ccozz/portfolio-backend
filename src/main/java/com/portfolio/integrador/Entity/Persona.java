package com.portfolio.integrador.Entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_per;
    
    @NotNull
    @Size(min=1, max=50, message = "No cumple con la longitud prevista para el campo.")
    private String nombre;
    
    @NotNull
    @Size(min=1, max=50, message = "No cumple con la longitud prevista para el campo.")
    private String apellido;
    
    @NotNull
    private String titulo;
    @NotNull
    private String descripcion;
    @NotNull
    private String img_per;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_edu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_exp")
    private List<Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_ski")
    private List<Skills> skillsList;
    
    public Persona() {
    }

    public Persona(Long id_per, String nombre, String apellido, String titulo, String descripcion, String img_per, List<Educacion> educacionList, List<Experiencia> experienciaList, List<Skills> skillsList) {
        this.id_per = id_per;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img_per = img_per;
        this.educacionList = educacionList;
        this.experienciaList = experienciaList;
        this.skillsList = skillsList;
    }
    
    
}
