package Proyectos.Mains;

import java.util.Scanner;

import Proyectos.Clases.Musicalizador;
import Proyectos.Clases.TemaMusical;

public class MainMusicalizador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musicalizador musicalizador = new Musicalizador();
        int opcion = 0;
        do {
            System.out.println("Bienvenido al Musicalizador!");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Agregar tema a la playlist");
            System.out.println("2. Reproducir tema");
            System.out.println("3. Mostrar cantidad de temas en la playlist");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado agregar un tema a la playlist!");
                System.out.print("Ingrese el intérprete: ");
                String interprete = scanner.nextLine();
                System.out.print("Ingrese el género: ");
                String genero = scanner.nextLine();
                System.out.print("Ingrese el año de lanzamiento: ");
                int anioLanzamiento = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                TemaMusical tema = new TemaMusical(interprete, genero, anioLanzamiento);
                musicalizador.agregarTema(tema);
                System.out.println("Tema agregado a la playlist.");
                break;

            case 2:
                if (musicalizador.estaVacia()) {
                    System.out.println("La playlist está vacía.");
                } else {
                    TemaMusical temaReproducido = musicalizador.reproducirTema();
                    System.out.println("Reproduciendo: " + temaReproducido);
                }
                break;

            case 3:
                System.out.println("Cantidad de temas en la playlist: " + musicalizador.cantidadTemas());
                break;

            case 4:
                System.out.println("Saliendo del Musicalizador. ¡Hasta luego!");
                break;
        } 
    } while (opcion != 4);
    scanner.close();
}
}