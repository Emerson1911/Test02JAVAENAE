package Test02JAVAENAE.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test02JAVAENAE.demo.model.Productosenae;
import Test02JAVAENAE.demo.repository.ProductoenaeRepository;

@Service
public class ProductoenaeService {

    @Autowired
    private ProductoenaeRepository productoenaeRepository;

    public List<Productosenae> listarTodas() {
        return productoenaeRepository.findAll();
    }

    public Productosenae guardar (Productosenae productosenae) {
        return productoenaeRepository.save(productosenae);
    }

    public Productosenae ontenerPorId (Long id) {
        return productoenaeRepository.findById(id).orElse(null);
    }

    public void eliminar (Long id) {
        productoenaeRepository.deleteById(id);
    }

}
