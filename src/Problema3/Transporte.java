package Problema3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transporte {

    //Atributos
    private String marca;
    private String modelo;
    private float cantidadmaximadeCarga;
    private LocalDate fechaDeadquisición;
    private List<Viaje> listaDeviajes;

    //Constructor
    public Transporte(String marca,String modelo, float cantidadmaximadeCarga,LocalDate fechaDeadquisición){
      this.marca=marca;
      this.modelo=modelo;
      this.cantidadmaximadeCarga=cantidadmaximadeCarga;
      this.fechaDeadquisición=fechaDeadquisición;
      this.listaDeviajes=new ArrayList<>();
    }

    //Metodos
    public void agregarViaje(Viaje viaje){
        listaDeviajes.add(viaje);
    }
    public void eliminarviaje(Viaje viaje){
        listaDeviajes.remove(viaje);
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public float getCantidadmaximadeCarga() {
        return cantidadmaximadeCarga;
    }
    public LocalDate getFechaDeadquisición() {
        return fechaDeadquisición;
    }
    public List<Viaje> getListaDeviajes() {
        return listaDeviajes;
    }

    @Override
    public String toString() {
        return "Marca del transporte: "+marca+"\n"+"Modelo del transporte: "+modelo+"\n"+
               "Carga maxima del transporte: "+cantidadmaximadeCarga+"\n"+"Fecha de adquisición: "+fechaDeadquisición;
    }
}
