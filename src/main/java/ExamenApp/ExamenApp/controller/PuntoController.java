package ExamenApp.ExamenApp.controller;

import ExamenApp.ExamenApp.entity.Examen;
import ExamenApp.ExamenApp.entity.Punto;
import ExamenApp.ExamenApp.service.ExamenService;
import ExamenApp.ExamenApp.service.PuntoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("/point")
public class PuntoController {
    @Autowired
    private PuntoService ps;
    @Autowired
    private ExamenService es;
    @GetMapping("/add")
    public String add(Punto punto) {

        return "createpoint";
    }
    @GetMapping("/listall")
    public String listAll(Model model) {
        List <Punto> puntos=ps.findAllPunto();
        model.addAttribute("puntos",puntos);
        return "redirect:/";
    }

    @PostMapping("/save")
    public String save(Long idExamen, Punto punto) {
        Examen ex=es.findExamenById(idExamen);
        punto.setExamen_id(ex);
    ps.savePunto(punto);
      return "index";
    } 
}
