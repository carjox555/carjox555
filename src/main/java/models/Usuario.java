package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    private String nombre;
    @Column
    private String password;
    @Column
    private String nombrePersona;

    @JsonIgnore
    @OneToOne(mappedBy = "usuario")
    private Persona persona;
    @ManyToOne
    private Perfil perfil;

}
