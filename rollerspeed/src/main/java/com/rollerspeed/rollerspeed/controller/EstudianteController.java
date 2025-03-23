package com.rollerspeed.rollerspeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rollerspeed.rollerspeed.Service.EstudianteService;
import com.rollerspeed.rollerspeed.model.EstudianteEntity;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;



@Controller
@AllArgsConstructor
@RequestMapping("/rollerspeed")
public class EstudianteController {

    @Autowired
    public final EstudianteService estudianteService; 

    @GetMapping
    public String showAllEstudiantes (Model model){ 
    List<EstudianteEntity> EstudianteLista = this.estudianteService.findAllEstudiante();

        model.addAttribute("EstudianteLista", EstudianteLista);
    
        return "VerUsuarios";
    }

    // @GetMapping("/get/{Id}")
    // public String getEstudianteById(Model model, @PathVariable Long Id){
    //     EstudianteEntity estudiante = this.estudianteService.findByIdEstudiante(Id);
    //     model.addAttribute("EncontrarEstudiante", estudiante);   
    //     return "VerUsuarios"; 
    // }

    @PostMapping("/create")
    public String crearEstudiante(@ModelAttribute EstudianteEntity estudiante, Model model) {
        model.addAttribute("CrearEstudiante", estudiante);
        return "formEstudiante";
    }
    // @PutMapping("/update/{Id}")
    // public String updateEstudiante(@PathVariable Long Id, @ModelAttribute EstudianteEntity estudiante) {
    // this.estudianteService.updateEstudiante(Id, estudiante);
    //     return "redirect:/";
    // }

    // @DeleteMapping ("/delete/{Id}")
    // public String deleteEstudiante(@PathVariable Long Id){
    //     this.estudianteService.deleteEstudiante(Id);
    //     return "redirect:/";
    // }

}
