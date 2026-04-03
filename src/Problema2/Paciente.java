package Problema2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
    //atributos
    private  String nombre;
    private String RFC;
    private LocalDate fechaDeNacimiento;
    private List<Consulta> ListaConsultas = new ArrayList<>();

    //constructor
    public Paciente(String nombre, String RFC, LocalDate fechaDeNacimiento){
        this.nombre=nombre;
        this.RFC=RFC;
        this.fechaDeNacimiento=fechaDeNacimiento;
    }

    //metodos
    public int calcularEdad(){
        int añoActual = LocalDate.now().getYear();
        int añoNacimiento = fechaDeNacimiento.getYear();
        return añoActual - añoNacimiento;
    }
    public List<Consulta> obtenerListaConsultas() {return ListaConsultas;}

    public void agregarConsulta(LocalDate fecha, Receta receta) {
        ListaConsultas.add(new Consulta(fecha, receta));
    }

    public String getNombre() {return nombre;}

    public int getEdad() {
        return calcularEdad();
    }

    public String getRFC() {
        return RFC;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre del Paciente: "+nombre+"\n"+"Rfc:"+RFC+"\n"+"Edad: "+calcularEdad()+"años";
    }
}

