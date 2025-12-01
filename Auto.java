package Proyectos.Clases;

public class Auto {
    //Atributos:
    private String marca;
    private String modelo;
    private int anio;
    private int velocidadMax;

    //Constructor:
    public Auto (String marc, String mod, int a, int vM) {
        this.marca = marc;
        this.modelo = mod;
        this.anio = a;
        this.velocidadMax = vM;
    }

    //Getters:
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    //Métodos:
    public boolean esMasRapidoQue (Auto otroAuto) {
        return this.velocidadMax > otroAuto.getVelocidadMax();
    }

    public boolean esAutoClasico () {
        return this.anio < 2000;
    }

    public String toString() {
        return "[" + "Marca del auto: " + this.marca + "; Modelo del auto: " + this.modelo + "; del año: " + this.anio + "; con una velocidad máxima de: " + this.velocidadMax + "Km/h." + "]";
    }
}
