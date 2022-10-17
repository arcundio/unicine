package co.uniquindio.edu.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pelicula implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;
    private String nombre;
    private String direccion_imagen;
    private String direccion_trailer;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String sinopsis;

    @OneToMany(mappedBy = "pelicula")
    private List<Funcion> funciones;

}
