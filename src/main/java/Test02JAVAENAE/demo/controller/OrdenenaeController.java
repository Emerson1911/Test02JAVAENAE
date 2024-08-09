package Test02JAVAENAE.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Test02JAVAENAE.demo.model.Ordenenae;
import Test02JAVAENAE.demo.service.OrdenenaeService;


@Controller
@RequestMapping("orden")
public class OrdenenaeController {

    @Autowired
    private OrdenenaeService ordenenaeService;

    @GetMapping
    public String listarOrden (Model model) {
        model.addAttribute("ordenes", ordenenaeService.listarTodas());
        return "orden/orden-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaOrden (Model model) {
        model.addAttribute("orden", new Ordenenae());
        return "orden/orden-forn";
    }

     @PostMapping
    public String guardarOrden (Ordenenae ordenenae) {
        ordenenaeService.guardar(ordenenae);
        return "redirect:/orden";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarOrden (@PathVariable Long id, Model model) {
        model.addAttribute("orden", ordenenaeService.ontenerPorId(id));
        return "orden/orden-forn";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarOrden (@PathVariable Long id) {
        ordenenaeService.eliminar(id);
        return "redirect:/orden";
    }

}
