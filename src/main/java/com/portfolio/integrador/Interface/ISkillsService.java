package com.portfolio.integrador.Interface;

import com.portfolio.integrador.Entity.Educacion;
import com.portfolio.integrador.Entity.Skills;
import java.util.List;

public interface ISkillsService {
    //traer lista de personas
    public List<Skills> getSkills();
    
    //guardar persona
    public void saveSkills(Skills skills);
    
    //eliminar persona por id
    public void deleteSkills(Long id);
    
    //buscar persona por id
    public Skills findSkills(Long id);
}
