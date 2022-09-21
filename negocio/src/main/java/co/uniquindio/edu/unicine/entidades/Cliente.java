package co.uniquindio.edu.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable {
    @Id
    private String cedula;

}
