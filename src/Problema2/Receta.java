package Problema2;


import java.util.ArrayList;
import java.util.List;

public class Receta {

    //Atributos
    private List<String> listaDeMedicamentos;
    private List<String> listaDeRecomendaciones;

    //Constructor
    public Receta() {
        this.listaDeMedicamentos = new ArrayList<>();
        this.listaDeRecomendaciones = new ArrayList<>();
    }

    //metodos
    public void agregarMedicamento(String medicamento){
        listaDeMedicamentos.add(medicamento);
    }
    public void agregarRecomendacion(String recomendacion){
        listaDeRecomendaciones.add(recomendacion);
    }

    public List<String> getListaDeMedicamentos() {
        return listaDeMedicamentos;
    }

    public List<String> getListaDeRecomendaciones() {
        return listaDeRecomendaciones;
    }

    @Override
    public String toString() {
        return "Receta Medica"+"\n"+"Medicamentos Recetados:"+listaDeMedicamentos+"\n"+
                "Recomendaciones"+listaDeRecomendaciones;
    }
}


