package mx.edu.utez.recuperaU2.models.destino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepository extends
        JpaRepository<Destino, Long> {

}
