package co.com.poli.subastasjcdr.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="inmueble")
public class InMueble implements Serializable {

    @Id
    @Column(name = "id_inmueble")
    private String idInmueble;
    private String ponente;
    private Double valor;

    private Double porPerdida;

    @Min(0)
    private Integer pujasMin;

    private Integer pujasMax;

    private Boolean estado = true;

    //@JsonManagedReference
    //@OneToMany(mappedBy = "inMueble")
    //private List<Postor> postores;
}
