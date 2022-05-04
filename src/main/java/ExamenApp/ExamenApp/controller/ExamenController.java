/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenApp.ExamenApp.controller;

import ExamenApp.ExamenApp.entity.Examen;
import ExamenApp.ExamenApp.entity.Punto;
import ExamenApp.ExamenApp.service.ExamenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("/exam")
public class ExamenController {
   @Autowired
    private ExamenService es;
   

   

    @GetMapping("/add")
    public String create(Examen examen) {

        return "createexam";
    }
    @GetMapping("/listall")
    public String listAll(Model model) {
        List <Examen> examenes=es.findAllExamen();
        model.addAttribute("examenes",examenes);
        return "verexam";
    }

    @PostMapping("/save")
    public String save(Examen examen) {
    es.saveExamen(examen);
      return "index";
    }
     @GetMapping("/edit/{id}")
    public String editExamen(@PathVariable("id") Long id, Model model,Punto punto) {
       Examen ex=es.findExamenById(id);
       model.addAttribute("examen", ex);
        
        return "modify_exam";
    }
    @PostMapping("/modify")
    public String modify(@RequestParam(required = false) List<Punto> puntos,Long id) {
        Examen exam=es.findExamenById(id);
        for (Punto punto : puntos) {
            exam.getPuntos().add(punto);
        }
        es.saveExamen(exam);

        return "index";
    }
   
}
