package co.uniquindio.edu.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;
@Entity
public class Funcion implements Serializable{
    @Id
    @GeneratedValue
    private String codigo;
    private String horaInicial;
    private String horaFinal;

    public Funcion(String codigo, String horaInicial, String horaFinal) {
        this.codigo = codigo;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public Funcion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }


}
