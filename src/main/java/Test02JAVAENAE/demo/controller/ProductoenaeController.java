package Test02JAVAENAE.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Test02JAVAENAE.demo.model.Productosenae;
import Test02JAVAENAE.demo.service.ProductoenaeService;

@Controller
@RequestMapping("producto")
public class ProductoenaeController {

    @Autowired
    private ProductoenaeService productoenaeService;
    
    @GetMapping
    public String listarProducto (Model model) {
        model.addAttribute("productos", productoenaeService.listarTodas());
        return "producto/producto-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaProducto (Model model) {
        model.addAttribute("producto", new Productosenae());
        return "producto/producto-forn";
    }

    @PostMapping
    public String guardarProducto (Productosenae productosenae) {
        productoenaeService.guardar(productosenae);
        return "redirect:/producto";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarProducto (@PathVariable Long id, Model model) {
        model.addAttribute("producto", productoenaeService.ontenerPorId(id));
        return "producto/producto-forn";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto (@PathVariable Long id) {
        productoenaeService.eliminar(id);
        return "redirect:/producto";
    }

}
