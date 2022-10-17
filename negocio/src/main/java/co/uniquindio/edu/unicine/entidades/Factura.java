package co.uniquindio.edu.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Factura implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int codigo;

    LocalDate fecha;

    double total;

    @OneToOne
    private Cliente cliente;

    @OneToOne(mappedBy = "factura")
    private Cupon cupon;

}
