
import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        ColaNombres cola = new ColaNombres(8); // capacidad 8
        Scanner sc = new Scanner(System.in);

        // ===== DEMO AUTOMÁTICA =====
        System.out.println("=== DEMO AUTOMÁTICA ===");
        String[] iniciales = {"Ana", "Beto", "Carla", "Damián", "Ema", "Fede", "Gabi", "Hugo"};

        System.out.println("Encolando 8 nombres...");
        for (String n : iniciales) {
            cola.enqueue(n);
            System.out.println("Encolado: " + n + "  -> " + cola);
        }

        System.out.println("\nDesencolando 3 nombres...");
        for (int i = 0; i < 3; i++) {
            String quitado = cola.dequeue();
            System.out.println("Desencolado: " + quitado + "  -> " + cola);
        }

        System.out.println("\nEncolando 3 más (circularmente):");
        String[] nuevos = {"Iara", "Juan", "Katy"};
        for (String n : nuevos) {
            cola.enqueue(n);
            System.out.println("Encolado: " + n + "  -> " + cola);
        }

        System.out.println("\nFrente actual: " + cola.peek());
        System.out.println("Estado final de la cola: " + cola + " (tamaño " + cola.size() + ")");
        System.out.println("=== FIN DEMO ===\n");

        // ===== MENÚ INTERACTIVO =====
        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Ver frente (peek)");
            System.out.println("4. Ver estado (vacía/llena/tamaño)");
            System.out.println("5. Mostrar cola completa");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            String entrada = sc.nextLine().trim();

            if (entrada.equals("1")) {
                System.out.print("Ingrese un nombre: ");
                String nombre = sc.nextLine().trim();
                try {
                    cola.enqueue(nombre);
                    System.out.println("Encolado: " + nombre + " -> " + cola);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (entrada.equals("2")) {
                try {
                    String quitado = cola.dequeue();
                    System.out.println("Desencolado: " + quitado + " -> " + cola);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (entrada.equals("3")) {
                try {
                    System.out.println("Frente actual: " + cola.peek());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (entrada.equals("4")) {
                System.out.println("Tamaño: " + cola.size() + "/" + 8
                        + (cola.isEmpty() ? " (vacía)" : "")
                        + (cola.isFull() ? " (llena)" : ""));
            } else if (entrada.equals("5")) {
                System.out.println("Cola actual: " + cola);
            } else if (entrada.equals("6")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}

