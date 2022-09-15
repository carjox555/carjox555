package models;

import repositoy.PerfilRepository;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "perfil")
public class Perfil {

    private PerfilRepository perfilRepository;

    private List<Usuario> usuarios;

}
