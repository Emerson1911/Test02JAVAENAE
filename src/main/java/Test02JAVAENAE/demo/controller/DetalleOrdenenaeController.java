package Test02JAVAENAE.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Test02JAVAENAE.demo.model.DetalleOrdenenae;
import Test02JAVAENAE.demo.service.DetallesOrdenenaeService;
import Test02JAVAENAE.demo.service.OrdenenaeService;
import Test02JAVAENAE.demo.service.ProductoenaeService;


@Controller
@RequestMapping("/detalleorden")
public class DetalleOrdenenaeController {

    @Autowired
    private DetallesOrdenenaeService detallesOrdenenaeService;

    @Autowired
    private OrdenenaeService ordenenaeService;

    @Autowired
    private ProductoenaeService productosenaeService;

    @GetMapping
    public String listarDetalleOrden(Model model) {
        model.addAttribute("detalles", detallesOrdenenaeService.listarTodas());
        return "detalleorden/detalleorden-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDetallesOrden(Model model) {
        model.addAttribute("detalle", new DetalleOrdenenae());
        model.addAttribute("ordenes", ordenenaeService.listarTodas());
        model.addAttribute("productos", productosenaeService.listarTodas());
        return "detalleorden/detalleorden-forn";
    }

    @PostMapping
    public String guardarDetallesOrden(DetalleOrdenenae detalleOrdenenae) {
        detallesOrdenenaeService.guardar(detalleOrdenenae);
        return "redirect:/detalleorden";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarDetallesOrden(@PathVariable Long id, Model model) {
        model.addAttribute("detalle", detallesOrdenenaeService.ontenerPorId(id));
        model.addAttribute("ordenes", ordenenaeService.listarTodas());
        model.addAttribute("productos", productosenaeService.listarTodas());
        return "detalleorden/detalleorden-forn";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarDetallesOrden(@PathVariable Long id) {
        detallesOrdenenaeService.eliminar(id);
        return "redirect:/detalleorden";
    }
}
