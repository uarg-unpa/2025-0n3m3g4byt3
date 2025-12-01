package Proyectos.Clases;

public class Deportista {
    //Atributos:
    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    //Constructor:
    public Deportista (String n, int e, String d, int p) {
        this.nombre = n;
        this.edad = e;
        this.deporte = d;
        this.puntos = p;
    }

    //Getters:
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getPuntos() {
        return puntos;
    }

    //Métodos:
    public boolean esMasExperimentado(Deportista otroDeportista) {
        return this.puntos > otroDeportista.getPuntos();
    }

    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    public String toString() {
        return "[" + "Nombre: " + this.nombre + "]" +  "[" + "Tiene: " + this.edad + "años" + "]" + "[" + "Su deporte es: " + this.deporte + "]" +  "[" + "Tiene una cantidad de: " + this.puntos + "puntos." + "]";
    }
}
