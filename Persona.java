package Proyectos.Clases;

public class Persona {
    //Atributos:
    private String nombre, apellido;
    private int edad;
    private double peso;
    private double altura;

    //Constructor:
    public Persona(String nombre, String apellido, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    //Getters:
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //Setters:
    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }

    public void setEdad(int e) {
        this.edad = e;
    }

    //Método toString:
    public String toString() {
        return "[" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Peso: " + peso + ", Altura: " + altura + "]";
    }
}
