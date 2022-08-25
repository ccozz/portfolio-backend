package com.portfolio.integrador.Controller;

import com.portfolio.integrador.Entity.Skills;
import com.portfolio.integrador.Interface.ISkillsService;
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
@RequestMapping("/skills")
public class SkillsController {
    
    @Autowired ISkillsService iSkillsService;
    
    @GetMapping("/traer")
    public List<Skills> getSkills() {
        return iSkillsService.getSkills();
    }
    
    @PostMapping("/crear")
    public String createSkills(@RequestBody Skills skills) {
        iSkillsService.saveSkills(skills);
        return "El skill fue guardado correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteSkills(@PathVariable Long id) {
        iSkillsService.deleteSkills(id);
        return "El skill fue eliminado correctamente";
    }
    
    @GetMapping("/traerSkills")
    public Skills findSkills() {
        return iSkillsService.findSkills((long)1);
    }
    
    @PutMapping("/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
                               @RequestParam("img_ski") String nuevoImg_ski,
                               @RequestParam("porcentaje") int nuevoPorcentaje,
                               @RequestParam("skill") String nuevoSkill) {
        Skills skills = iSkillsService.findSkills(id);
        skills.setImg_ski(nuevoImg_ski);
        skills.setPorcentaje(nuevoPorcentaje);
        skills.setSkill(nuevoSkill);
        
        iSkillsService.saveSkills(skills);
        return skills;
    }
}
