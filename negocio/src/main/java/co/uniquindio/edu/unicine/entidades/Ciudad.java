package co.uniquindio.edu.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    int codigo;

    @Column(nullable = false)
    String nombre;

    @Enumerated(EnumType.ORDINAL)
    Enum departamento;

    @OneToMany(mappedBy="ciudad")
    private List<Teatro> teatros;

}
