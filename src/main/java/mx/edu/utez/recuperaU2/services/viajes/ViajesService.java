package mx.edu.utez.recuperaU2.services.viajes;


import mx.edu.utez.recuperaU2.models.viaje.Viaje;
import mx.edu.utez.recuperaU2.models.viaje.ViajeRepository;
import mx.edu.utez.recuperaU2.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ViajesService {
    @Autowired
    private ViajeRepository repository;

    public Response getAll() {
        return new Response<List<Viaje>>(
                this.repository.findAll(),
                false,
                200,
                "OK"
        );
    }

    public Response getOne(Long id) {
        if (this.repository.existsById(id))
            return new Response<Viaje>(
                    this.repository.findById(id).get(),
                    false,
                    200,
                    "OK"
            );
        return new Response(
                null,
                true,
                200,
                "No existe este Viaje"
        );
    }

    public Response insert(Viaje viaje) {
        if (this.repository.existsByFecharegreso(viaje.getFecharegreso()))
            return new Response(
                    null,
                    true,
                    200,
                    "Viaje existente"
            );
        return new Response(
                this.repository.saveAndFlush(viaje),
                false,
                200,
                "Viaje registrado correctamente"
        );
    }

    public Response update(Viaje viaje) {
        if (this.repository.existsById(viaje.getId()))
            return new Response(
                    this.repository.saveAndFlush(viaje),
                    false,
                    200,
                    "Viaje actualizado correctamente"
            );
        return new Response(
                null,
                true,
                200,
                "No existe este Viaje"
        );
    }

    public Response delete(Long id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return new Response(
                    null,
                    false,
                    200,
                    "Viaje eliminado correctamente"
            );
        }
        return new Response(
                null,
                true,
                200,
                "No existe este Viaje"
        );
    }
}
