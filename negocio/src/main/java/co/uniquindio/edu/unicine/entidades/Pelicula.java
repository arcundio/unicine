package co.uniquindio.edu.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Pelicula implements Serializable {

    @Id
    private String codigo;
    private String nombre;
    private String direccion_imagen;
    private String direccion_trailer;
    private Genero genero;

    public Pelicula(String codigo, String nombre, String direccion_imagen, String direccion_trailer, Genero genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion_imagen = direccion_imagen;
        this.direccion_trailer = direccion_trailer;
        this.genero = genero;
    }

    public Pelicula() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion_imagen() {
        return direccion_imagen;
    }

    public void setDireccion_imagen(String direccion_imagen) {
        this.direccion_imagen = direccion_imagen;
    }

    public String getDireccion_trailer() {
        return direccion_trailer;
    }

    public void setDireccion_trailer(String direccion_trailer) {
        this.direccion_trailer = direccion_trailer;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
