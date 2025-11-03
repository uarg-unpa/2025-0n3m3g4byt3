package Proyectos.Mains;

import java.util.Scanner;

import Proyectos.Clases.PilaEnergia;
public class MainPilaEnergia {
    public static void main(String[] args) {
        //Inicialización de objetos:
    PilaEnergia pila = new PilaEnergia();
    Scanner scanner = new Scanner(System.in);
    int opcion;
    //Variable auxiliar en caso de haber un valor repetido.
    int valorRepetido = 0;
        do {
    //Mostrar el menú de opciones al usuario.
        System.out.println("    //MENÚ DE PILA DE ENERGÍA//    ");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Meter niveles de energía.");
        System.out.println("2. Quitar niveles de energía.");
        System.out.println("3. Mostrar nivel de energía actual de la pila.");
        System.out.println("4. Verificar si hay niveles de energía que se repiten.");
//Leer la opción seleccionada por el usuario.
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                if (!pila.estaLlena()) {
                System.out.println("Has seleccionado meter un nivel de energía a la pila.");
                int elemento = scanner.nextInt();
                pila.meter(elemento);
                System.out.println("El nivel de energía " + elemento + " se ha añadido a la pila.");
                break;
                } else {
                    System.out.println("La cola está llena. No se puede encolar más elementos.");
                break;
            }


            case 2:
                if (!pila.estaVacia()) {
                System.out.println("Has seleccionado sacar un nivel de la pila.");
                int quitado = pila.sacar();
                System.out.println("Se ha quitado el nivel de energía " + quitado + " de la pila.");
                break;
                } else {
                    System.out.println("No fue posible quitar niveles de la pila, ya que está vacía.");
                break;
            }

            case 3:
                System.out.println("Has seleccionado mostrar el nivel en el que se encuentra la pila.");
                System.out.println("El nivel de energía actual en la cima de la pila es: " + pila.cima());
                break;
case 4:
    System.out.println("Has seleccionado verificar si hay niveles de energía que se repiten.");
    System.out.println("Introduce el nivel de energía que deseas verificar: ");
    int x = scanner.nextInt();
    int repeticiones = pila.contarOcurrencias(x);
    if (repeticiones > 0) {
        System.out.println("El nivel de energía " + x + " se encuentra repetido " + repeticiones + " veces dentro de la pila.");
    } else {
        System.out.println("El nivel de energía " + x + " no se encuentra en la pila.");
    }
    break;
}
    } while (opcion != 0);
    scanner.close();
}
}