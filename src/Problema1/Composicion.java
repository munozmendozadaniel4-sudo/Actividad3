package Problema1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Composición {
    //atributos
    private String titulo;
    private String duracion;
    private String generoMusical;
    private LocalDate fechaDeRegistro;
    private LocalDate fechaDeEstreno;
    private List<Solicitud> listaSolicitudes;

    //constructor
    public Composición(String titulo,String duracion,String generoMusical,LocalDate fechaDeRegistro) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.generoMusical = generoMusical;
        this.fechaDeRegistro = fechaDeRegistro;
        this.listaSolicitudes = new ArrayList<>();
    }

    //metodos
    public void modificarFechaDeEstreno(LocalDate fechaDeEstreno){

        this.fechaDeEstreno = fechaDeEstreno;
    }
    public void agregarSolicitud(Solicitud solicitud) {

        listaSolicitudes.add(solicitud);
    }
    public List<Solicitud> obtenerListaInterpretes() {
        List<Solicitud> autorizadas = new ArrayList<>();
        for (Solicitud s : listaSolicitudes) {
            if (s.validarFechas()) {
                autorizadas.add(s);
            }
        }
        return autorizadas;
    }
    public String getTitulo() {

        return titulo;
    }
    public String getDuracion() {

        return duracion;
    }
    public String getGeneroMusical() {

        return generoMusical;
    }
    public LocalDate getFechaRegistro() {

        return fechaDeRegistro;
    }
    public LocalDate getFechaEstreno() {

        return fechaDeEstreno;
    }
    public List<Solicitud> getListaSolicitudes() {

        return listaSolicitudes;
    }

    //muestra la información
    @Override
    public String toString() {
        return "Composición: " + titulo +"\n"+ "Género: " + generoMusical + "\n"+
                "Duración: " + duracion +"\n"+ "Registro: " + fechaDeRegistro;
    }
}

