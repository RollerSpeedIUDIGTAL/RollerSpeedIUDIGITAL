package com.rollerspeed.rollerspeed.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rollerspeed.rollerspeed.Repository.EstudianteRepository;
import com.rollerspeed.rollerspeed.model.EstudianteEntity;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Transactional
@Service
public class EstudianteService {
    @Autowired 
    private final EstudianteRepository estudianteRepository;
    
    public List<EstudianteEntity> findAllEstudiante(){
        return this.estudianteRepository.findAll();
    }

    public EstudianteEntity findByIdEstudiante(Long Id){
        return this.estudianteRepository.findById(Id).orElse(null);
    }

    public EstudianteEntity insertEstudiante(EstudianteEntity estudiante){
        return this.estudianteRepository.save(estudiante);
    }

    public void deleteEstudiante (Long Id){
        this.estudianteRepository.deleteById(Id);
    }

    public EstudianteEntity updateEstudiante(Long Id,EstudianteEntity estudiante){
        EstudianteEntity estudianteNuevo = this.findByIdEstudiante(Id);

        if (estudianteNuevo == null){
        return null;  
        }

        estudianteNuevo = estudiante;

        return this.estudianteRepository.save(estudianteNuevo);
    }
}
