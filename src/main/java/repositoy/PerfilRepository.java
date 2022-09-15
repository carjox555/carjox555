package repositoy;

import models.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository {
    public Perfil findByNombre(String nombre);
}
