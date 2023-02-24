package mx.edu.utez.recuperaU2.controllers.usuario.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.recuperaU2.models.usuario.Usuario;


import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UsuarioDto {
    private Long id;
    private String name;
    private String email;
    private Date birth;



    public Usuario parseToUsuario() {
        return new Usuario(
                getId(),
                getName(), getEmail(),
                getBirth()

        );
    }
}
