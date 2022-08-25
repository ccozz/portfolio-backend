package com.portfolio.integrador.Interface;

import com.portfolio.integrador.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    //traer lista de personas
    public List<Experiencia> getExperiencia();
    
    //guardar persona
    public void saveExperiencia(Experiencia experiencia);
    
    //eliminar persona por id
    public void deleteExperiencia(Long id);
    
    //buscar persona por id
    public Experiencia findExperiencia(Long id);
    
}
