package co.uniquindio.edu.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Ciudad implements Serializable {
    @Id
    int codigo;
    String nombre;
    Enum departamento;

}
