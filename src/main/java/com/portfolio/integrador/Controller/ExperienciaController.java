package com.portfolio.integrador.Controller;

import com.portfolio.integrador.Entity.Experiencia;
import com.portfolio.integrador.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
    @Autowired IExperienciaService iExperienciaService;
    
    @GetMapping("/traer")
    public List<Experiencia> getExperiencia() {
        return iExperienciaService.getExperiencia();
    }
    
    @PostMapping("/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia) {
        iExperienciaService.saveExperiencia(experiencia);
        return "La experiencia fue guardada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
        iExperienciaService.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    
    @GetMapping("/traerExperiencia")
    public Experiencia findExperiencia() {
        return iExperienciaService.findExperiencia((long)1);
    }
    
    @PutMapping("/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                               @RequestParam("lugar") String nuevoLugar,
                               @RequestParam("cargo") String nuevoCargo,
                               @RequestParam("tareas") String nuevoTareas,
                               @RequestParam("fecha") int nuevoFecha,
                               @RequestParam("img_exp") String nuevoImg_exp) {
        Experiencia experiencia = iExperienciaService.findExperiencia(id);
        experiencia.setLugar(nuevoLugar);
        experiencia.setCargo(nuevoCargo);
        experiencia.setTareas(nuevoTareas);
        experiencia.setFecha(nuevoFecha);
        experiencia.setImg_exp(nuevoImg_exp);
        
        iExperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
}
