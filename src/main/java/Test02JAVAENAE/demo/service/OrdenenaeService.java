package Test02JAVAENAE.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test02JAVAENAE.demo.model.Ordenenae;
import Test02JAVAENAE.demo.repository.OrdenenaeRepository;

@Service
public class OrdenenaeService {

    @Autowired
    private OrdenenaeRepository ordenenaeRepository;

    public List<Ordenenae> listarTodas() {
        return ordenenaeRepository.findAll();
    }

    public Ordenenae guardar(Ordenenae productosenae) {
        return ordenenaeRepository.save(productosenae);
    }

    public Ordenenae ontenerPorId(Long id) {
        return ordenenaeRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        ordenenaeRepository.deleteById(id);
    }

}
