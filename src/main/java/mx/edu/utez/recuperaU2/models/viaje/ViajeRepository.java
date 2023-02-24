package mx.edu.utez.recuperaU2.models.viaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ViajeRepository extends
        JpaRepository<Viaje, Long> {
    boolean existsByFecharegreso(Date name);
}
