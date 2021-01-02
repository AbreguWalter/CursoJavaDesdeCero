package temasJava;

import java.util.Objects;

public class Persona {

    private String nombre;

    private String apellido;

    private String chapa;

    private String dni;

    private int edad;

    private String tipoMusica;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String chapa, String dni, int edad, String tipoMusica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.chapa = chapa;
        this.dni = dni;
        this.edad = edad;
        this.tipoMusica = tipoMusica;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getChapa() {
        return chapa;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "temasJava.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", chapa='" + chapa + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", tipoMusica='" + tipoMusica + '\'' +
                '}';
    }

}
