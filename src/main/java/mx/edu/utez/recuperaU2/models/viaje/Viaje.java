package mx.edu.utez.recuperaU2.models.viaje;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.recuperaU2.models.destino.Destino;
import mx.edu.utez.recuperaU2.models.usuario.Usuario;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "viaje")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private Date fechasalida;
    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private Date fecharegreso;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Destino destino;
}
