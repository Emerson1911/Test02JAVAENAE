package Test02JAVAENAE.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Productosenae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreenae;

    public Productosenae() {
    }

    public Productosenae(Long id, String nombreenae) {
        this.id = id;
        this.nombreenae = nombreenae;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreenae() {
        return nombreenae;
    }

    public void setNombreenae(String nombreenae) {
        this.nombreenae = nombreenae;
    }

    

}
