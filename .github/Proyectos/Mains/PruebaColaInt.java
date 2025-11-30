package Proyectos.Mains;
import Proyectos.Clases.ColaInt;
public class PruebaColaInt {
    public static void main(String[] args) {
        int cap = 10;
        ColaInt cola = new ColaInt(cap);
        ColaInt aux = new ColaInt(cap);
        cola.insertar(10);
        cola.insertar(20);
        cola.insertar(15);
        cola.insertar(30);
        cola.insertar(20);
        cola.insertar(40);
        cola.insertar(20);

        System.out.println("Contenido inicial de la cola: ");
        while (!cola.estaVacia()) {
            int elemento = cola.borrar();
            System.out.println(elemento);
            aux.insertar(elemento);
        }
        while (!aux.estaVacia()) {
            cola.insertar(aux.borrar());
        }

        System.out.println("\n¿La cola contiene el elemento 25? " + cola.contiene(25));


        System.out.println("\nLa cantidad de ocurrencias del elemento 20 en la cola es de: " + cola.eliminarTodas(20));

        System.out.println("\nContenido final de la cola después de eliminar todas las ocurrencias de 20: ");
        while (!cola.estaVacia()) {
            int elemento = cola.borrar();
            System.out.println(elemento);
            aux.insertar(elemento);
        }
        while (!aux.estaVacia()) {
            cola.insertar(aux.borrar());
        }

        cola = cola.invertir();
        System.out.println("\nContenido de la cola después de invertirla: ");
        while (!cola.estaVacia()) {
            int elemento = cola.borrar();
            System.out.println(elemento);
            aux.insertar(elemento);
        }
        while (!aux.estaVacia()) {
            cola.insertar(aux.borrar());
        }
}
}