package com.portfolio.integrador.Service;

import com.portfolio.integrador.Entity.Experiencia;
import com.portfolio.integrador.Interface.IExperienciaService;
import com.portfolio.integrador.Repository.IExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {
    
    @Autowired IExperienciaRepository iExperienciaRepository;
    
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iExperienciaRepository.findAll();
        return experiencia;
    }

    public void saveExperiencia(Experiencia experiencia) {
        iExperienciaRepository.save(experiencia);
    }

    public void deleteExperiencia(Long id) {
        iExperienciaRepository.deleteById(id);
    }
    
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iExperienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia) {
        return iExperienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> traerExperiencia() {
        return iExperienciaRepository.findAll();
    }
    
}
