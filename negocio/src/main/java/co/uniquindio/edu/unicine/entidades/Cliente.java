package co.uniquindio.edu.unicine.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = false)
public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false, unique = true)
    private String cedula;

    @Column(nullable = false)
    private String nombre;

    private String imagen_perfil;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false, length = 10)
    private String numero_telefono;

    @Column(nullable = false)
    private String email;

    @OneToOne(mappedBy = "cliente")
    private Factura factura;

}
