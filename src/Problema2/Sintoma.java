package Problema2;

public class Sintoma {
    //atributos
    private String descripcion;
    private float temperatura;
    private float peso;
    private float altura;

    //constructor
    public Sintoma(String descripcion, float peso, float altura, float temperatura) {
        this.descripcion = descripcion;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
    }

    //Metodos
    public String getDescripcion() {
        return descripcion;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public float getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Sintoma del paciente: "+descripcion+"\n"+"Temperatura: "+temperatura+"\n"+
                "Peso: "+peso+"\n"+"Altura: "+"\n";
    }
}
