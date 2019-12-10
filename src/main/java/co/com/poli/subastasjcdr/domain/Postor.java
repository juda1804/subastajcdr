package co.com.poli.subastasjcdr.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="postor")
public class Postor implements Serializable {
    @Id
    private String idPostor;
    private Double puja;

    @JsonBackReference
    @ManyToOne()
    private InMueble inMueble;

}
