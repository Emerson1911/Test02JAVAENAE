package Test02JAVAENAE.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DetalleOrdenenae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidadenae;

    private Double precioenae;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Productosenae productosenae;
    
    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Ordenenae ordenenae;

    public DetalleOrdenenae() {
    }

    public DetalleOrdenenae(Long id, Integer cantidadenae, Double precioenae, Productosenae productosenae,
            Ordenenae ordenenae) {
        this.id = id;
        this.cantidadenae = cantidadenae;
        this.precioenae = precioenae;
        this.productosenae = productosenae;
        this.ordenenae = ordenenae;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidadenae() {
        return cantidadenae;
    }

    public void setCantidadenae(Integer cantidadenae) {
        this.cantidadenae = cantidadenae;
    }

    public Double getPrecioenae() {
        return precioenae;
    }

    public void setPrecioenae(Double precioenae) {
        this.precioenae = precioenae;
    }

    public Productosenae getProductosenae() {
        return productosenae;
    }

    public void setProductosenae(Productosenae productosenae) {
        this.productosenae = productosenae;
    }

    public Ordenenae getOrdenenae() {
        return ordenenae;
    }

    public void setOrdenenae(Ordenenae ordenenae) {
        this.ordenenae = ordenenae;
    }

    

}
