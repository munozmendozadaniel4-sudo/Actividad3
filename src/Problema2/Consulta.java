package Problema2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {

    //atributos
    private LocalDate fecha;
    private List<Sintoma> listaDesintomas;
    private List<String> listaDeDiagnosticos;
    private Receta receta;

    //Constructor
    public Consulta(LocalDate fecha,Receta receta ){
        this.fecha=fecha;
        this.receta=receta;
        this.listaDesintomas=new ArrayList<>();
        this.listaDeDiagnosticos=new ArrayList<>();
    }

    //Metodos
    public void agregarSintoma(Sintoma sintoma) {
        listaDesintomas.add(sintoma);
    }
    public void agregarDiagnostico(String diagnostico) {
        listaDeDiagnosticos.add(diagnostico);
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public Receta getReceta() {
        return receta;
    }
    public List<String> getListaDeDiagnosticos() {
        return listaDeDiagnosticos;
    }
    public List<Sintoma> getListaDesintomas() {
        return listaDesintomas;
    }

    @Override
    public String toString() {
        return "Fecha de consulta: "+fecha+"\n"+"Diagnostico: "+listaDeDiagnosticos+"\n"+"Receta medica: "+receta;
    }

}

