package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String nombre;
    @Column
    private String descricion;

    @ManyToMany
    private List<Perfil> perfiles;

    public Menu() {
    }

}
