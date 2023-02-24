package mx.edu.utez.recuperaU2.models.destino;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Table(name = "destino")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double precio;
    private Double calificacion;
    private Boolean disponibilidad;


}
