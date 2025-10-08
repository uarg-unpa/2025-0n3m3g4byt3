import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        ColaCaracteres cola = new ColaCaracteres(10); // capacidad máxima 10

        // --------- DEMO AUTOMÁTICO ----------
        System.out.println("=== DEMO AUTOMÁTICO ===");
        System.out.println("Encolando 5 comandos: a, b, c, d, e");
        char[] inicial = {'a', 'b', 'c', 'd', 'e'};
        for (char ch : inicial) {
            cola.enqueue(ch);
            System.out.println("Encolado: " + ch + "  Cola: " + cola);
        }

        System.out.println("\nDesencolando 2 comandos:");
        for (int i = 0; i < 2; i++) {
            char d = cola.dequeue();
            System.out.println("Desencolado: " + d + "  Cola: " + cola);
        }

        System.out.println("\nVolviendo a encolar hasta llenarla (capacidad 10):");
        char next = 'f';
        while (!cola.isFull()) {
            cola.enqueue(next);
            System.out.println("Encolado: " + next + "  Cola: " + cola);
            next++;
        }

        System.out.println("\nEstado final del demo: " + cola + " (tamaño " + cola.size() + "/" + cola.capacity() + ")");
        System.out.println("=== FIN DEMO ===\n");

        // ---------- INTERFAZ INTERACTIVA ----------

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nElija una opción:");
            System.out.println("1 - Encolar un comando (carácter)");
            System.out.println("2 - Desencolar el comando más antiguo");
            System.out.println("3 - Ver el frente (peek)");
            System.out.println("4 - Estado (vacía/llena/tamaño)");
            System.out.println("5 - Mostrar contenido de la cola");
            System.out.println("6 - Salir");
            System.out.print("Opción: ");
            String linea = sc.nextLine().trim();
            if (linea.isEmpty()) continue;

            int opcion;
            try {
                opcion = Integer.parseInt(linea);
            } catch (NumberFormatException ex) {
                System.out.println("Opción inválida. Intente nuevamente.");
                continue;
            }

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese un carácter para encolar: ");
                        String entrada = sc.nextLine();
                        if (entrada.isEmpty()) {
                            System.out.println("No ingresó ningún carácter.");
                        } else {
                            char c = entrada.charAt(0);
                            cola.enqueue(c);
                            System.out.println("Encolado: " + c + "  Cola: " + cola);
                        }
                        break;
                    case 2:
                        char desencolado = cola.dequeue();
                        System.out.println("Desencolado: " + desencolado + "  Cola: " + cola);
                        break;
                    case 3:
                        char frente = cola.peek();
                        System.out.println("Frente (sin desencolar): " + frente);
                        break;
                    case 4:
                        System.out.println("Tamaño: " + cola.size() + "/" + cola.capacity()
                                + (cola.isEmpty() ? " (vacía)" : "") + (cola.isFull() ? " (llena)" : ""));
                        break;
                    case 5:
                        System.out.println("Contenido de la cola: " + cola);
                        break;
                    case 6:
                        System.out.println("Saliendo. ¡Hasta luego!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (IllegalStateException | NoSuchElementException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
