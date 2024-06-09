package pe.edu.cibertec.DSWII_CL1SOAP_Aybar_Marcial.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpublicacion;
    private String titulo;
    private String resumen;
    private Date fechpublicacion;
    @Column(name = "idautor")
    private Integer idautor;
}
