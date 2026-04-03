package Problema3;

import java.time.LocalDate;
import java.util.List;

public class Viaje {

    //Atributos
    private String ciudad;
    private String destino;
    private String direccion;
    private LocalDate fechaDeViaje;
    private LocalDate fechaDeRegreso;
    private String descripcionDeCarga;
    private float montoDelViaje;

    //Constructor
    public Viaje(String ciudad, String destino,String direccion,LocalDate fechaDeViaje,
                 LocalDate fechaDeRegreso,String descripcionDeCarga, float montoDelViaje) {
        this.ciudad=ciudad;
        this.destino=destino;
        this.direccion=direccion;
        this.fechaDeViaje=fechaDeViaje;
        this.fechaDeRegreso=fechaDeRegreso;
        this.descripcionDeCarga=descripcionDeCarga;
        this.montoDelViaje=montoDelViaje;
    }

    //Metodos
    public String getCiudad() {
        return ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getDestino() {
        return destino;
    }
    public String getDescripcionDeCarga() {
        return descripcionDeCarga;
    }
    public LocalDate getFechaDeViaje() {
        return fechaDeViaje;
    }
    public LocalDate getFechaDeRegreso() {
        return fechaDeRegreso;
    }
    public float getMontoDelViaje() {
        return montoDelViaje;
    }

    @Override
    public String toString() {
        return "Viaje a:"+ciudad+"\n"+
                "Destino:"+destino+"\n"+"Carga: "+descripcionDeCarga+"\n"+
                "Monto del viaje:"+montoDelViaje;
    }
}
