package repositoy;

import models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository {
    public Persona findByUsuarioNombreUsuario (String perdona);
}
