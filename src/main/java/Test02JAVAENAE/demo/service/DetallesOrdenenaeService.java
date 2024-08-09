package Test02JAVAENAE.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test02JAVAENAE.demo.model.DetalleOrdenenae;
import Test02JAVAENAE.demo.repository.DetalleOrdenenaeRepository;

@Service
public class DetallesOrdenenaeService {

    @Autowired
    private DetalleOrdenenaeRepository detallesOrdenenaeRepository;

    public List<DetalleOrdenenae> listarTodas() {
        return detallesOrdenenaeRepository.findAll();
    }

    public DetalleOrdenenae guardar(DetalleOrdenenae productosenae) {
        return detallesOrdenenaeRepository.save(productosenae);
    }

    public DetalleOrdenenae ontenerPorId(Long id) {
        return detallesOrdenenaeRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        detallesOrdenenaeRepository.deleteById(id);
    }

}
