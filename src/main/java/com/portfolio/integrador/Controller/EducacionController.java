package com.portfolio.integrador.Controller;

import com.portfolio.integrador.Entity.Educacion;
import com.portfolio.integrador.Interface.IEducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired IEducacionService iEducacionService;
    
    @GetMapping("/traer")
    public List<Educacion> getEducacion() {
        return iEducacionService.getEducacion();
    }
    
    @PostMapping("/crear")
    public String createEducacion(@RequestBody Educacion educacion) {
        iEducacionService.saveEducacion(educacion);
        return "El estudio fue guardado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        iEducacionService.deleteEducacion(id);
        return "El estudio fue eliminado correctamente";
    }
    
    @GetMapping("/traerEducacion")
    public Educacion findEducacion() {
        return iEducacionService.findEducacion((long)1);
    }
    
    @PutMapping("/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                               @RequestParam("institucion") String nuevoInstitucion,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("direccion") String nuevoDireccion,
                               @RequestParam("año") int nuevoAño) {
        Educacion educacion = iEducacionService.findEducacion(id);
        educacion.setInstitucion(nuevoInstitucion);
        educacion.setTitulo(nuevoTitulo);
        educacion.setDireccion(nuevoDireccion);
        educacion.setAño(nuevoAño);
        
        iEducacionService.saveEducacion(educacion);
        return educacion;
    }

}
