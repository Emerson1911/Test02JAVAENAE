package Test02JAVAENAE.demo.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ordenenae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaenae;

    public Ordenenae() {
    }

    public Ordenenae(Long id, LocalDate fechaenae) {
        this.id = id;
        this.fechaenae = fechaenae;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaenae() {
        return fechaenae;
    }

    public void setFechaenae(LocalDate fechaenae) {
        this.fechaenae = fechaenae;
    }

    


}
