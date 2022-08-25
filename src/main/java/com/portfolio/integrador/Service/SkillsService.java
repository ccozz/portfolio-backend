package com.portfolio.integrador.Service;

import com.portfolio.integrador.Entity.Skills;
import com.portfolio.integrador.Interface.ISkillsService;
import com.portfolio.integrador.Repository.ISkillsRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService implements ISkillsService {
    
    @Autowired ISkillsRepository iSkillsRepository;
    
    public List<Skills> getSkills() {
        List<Skills> skills = iSkillsRepository.findAll();
        return skills;
    }

    public void saveSkills(Skills skills) {
        iSkillsRepository.save(skills);
    }

    public void deleteSkills(Long id) {
        iSkillsRepository.deleteById(id);
    }
    
    public Skills findSkills(Long id) {
        Skills skills = iSkillsRepository.findById(id).orElse(null);
        return skills;
    }
    
    public Skills addSkills(Skills skills) {
        return iSkillsRepository.save(skills);
    }
    
    public List<Skills> traerSkills() {
        return iSkillsRepository.findAll();
    }
}
