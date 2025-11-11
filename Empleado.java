package Proyectos.Clases;
public class Empleado {
    //Atributos:
    private Persona empleado;
    private double sueldo;
    private int legajo;


    //Constructor:
    public Empleado(Persona empleado, double sueldo, int legajo) {
        this.empleado = empleado;
        this.sueldo = sueldo;
        this.legajo = legajo;
    }

    //Getters:
    public Persona getEmpleado() {
        return empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    //Setters:
    public void setEmpleado(Persona e) {
        this.empleado = e;
    }

    public void setSueldo(double s) {
        this.sueldo = s;
    }

    public void setLegajo(int l) {
        this.legajo = l;
    }

    public boolean ganaMasQue(Empleado otroEmpleado) {
        return this.sueldo > otroEmpleado.getSueldo();
    }

    //Método toString:
    public String toString() {
        return "[" + "Empleado: " + empleado.toString() + ", Sueldo: " + sueldo + ", Legajo: " + legajo + "]";
    }
}
