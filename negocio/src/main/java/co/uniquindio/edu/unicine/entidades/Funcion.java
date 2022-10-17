package co.uniquindio.edu.unicine.entidades;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Funcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private String codigo;
    private String horaInicial;
    private String horaFinal;

    @ManyToOne
    private Pelicula pelicula;

}
