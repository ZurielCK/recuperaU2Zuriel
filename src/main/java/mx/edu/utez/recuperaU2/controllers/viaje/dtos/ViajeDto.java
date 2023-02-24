package mx.edu.utez.recuperaU2.controllers.viaje.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import mx.edu.utez.recuperaU2.models.destino.Destino;
import mx.edu.utez.recuperaU2.models.usuario.Usuario;
import mx.edu.utez.recuperaU2.models.viaje.Viaje;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ViajeDto {
    private Long id;
    private Date fechasalida;
    private Date fecharegreso;
    private Usuario usuario;
    private Destino destino;

    public Viaje parseToTrainer() {
        return new Viaje(
                getId(),
                getFechasalida(),
                getFecharegreso(),
                getUsuario(),
                getDestino()

        );
    }
}
