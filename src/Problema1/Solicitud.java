package Problema1;

import java.time.LocalDate;

public class Solicitud {

    //atributos
    private String nombreDelInterprete;
    private LocalDate fechaDeSolicitud;
    private LocalDate fechaDeAutorizacion;
    private String compañiaDeGrabacion;

    //constructor
    public Solicitud(String nombreDelInterprete,LocalDate fechaDeSolicitud,LocalDate fechaDeAutorizacion,
                     String compañiaDeGrabacion){
        this.nombreDelInterprete = nombreDelInterprete;
        this.fechaDeSolicitud = fechaDeSolicitud;
        this.fechaDeAutorizacion = fechaDeAutorizacion;
        this.compañiaDeGrabacion = compañiaDeGrabacion;
    }

    //metodos
   public boolean validarFechas(){

        return !fechaDeAutorizacion.isBefore(fechaDeSolicitud);
   }

    public String getNombreInterprete() {
        return nombreDelInterprete;
    }

    public LocalDate getFechaSolicitud() {
        return fechaDeSolicitud;
    }

    public LocalDate getFechaAutorizacion() {
        return fechaDeAutorizacion;
    }

    public String getCompaniaGrabacion() {
        return compañiaDeGrabacion;
    }

    //muestra la información
    @Override
    public String toString() {
        return "Intérprete: " + nombreDelInterprete +"\n"+
                "Solicitud: " + fechaDeSolicitud +"\n"+
                "Autorización: " + fechaDeAutorizacion +"\n"+
                "Compañía: " + compañiaDeGrabacion;
    }
}

