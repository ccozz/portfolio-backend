package com.portfolio.integrador.Interface;

import com.portfolio.integrador.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //traer lista de personas
    public List<Educacion> getEducacion();
    
    //guardar persona
    public void saveEducacion(Educacion educacion);
    
    //eliminar persona por id
    public void deleteEducacion(Long id);
    
    //buscar persona por id
    public Educacion findEducacion(Long id);
}
