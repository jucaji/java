package javatraining;

public class Coche {
    //Atributos
    private String color;
    private String marca;
    private String modelo;
    private Double peso;
    private Double largo;
    private Integer velocidad = 0;
    //COnstructores
    public Coche(String color, String marca, String modelo, Double peso, Double largo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }
    //Metodos

    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad < 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
