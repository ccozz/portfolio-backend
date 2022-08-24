package com.portfolio.integrador.Interface;

import com.portfolio.integrador.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar persona
    public void savePersona(Persona persona);
    
    //eliminar persona por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
}
