public class Clase_ColaCircular {
    private int[] cola;       // Arreglo para guardar los elementos
    private int frente;       // Índice del primer elemento
    private int fin;          // Índice del último elemento
    private int tamaño;       // Capacidad máxima de la cola

    // Constructor: inicializa la cola vacía
    public Clase_ColaCircular(int capacidad) {
        cola = new int[capacidad];
        tamaño = capacidad;
        frente = 0;
        fin = 0;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return frente == fin;
    }

    // Verifica si la cola está llena
    public boolean estaLlena() {
        return (fin + 1) % tamaño == frente;
    }

    // Encola (agrega un elemento al final)
    public void encolar(int valor) {
        if (estaLlena()) {
            System.out.println("⚠️ La cola está llena, no se puede encolar " + valor);
        } else {
            cola[fin] = valor;               // Guarda el valor en la posición fin
            fin = (fin + 1) % tamaño;        // Avanza circularmente
            System.out.println("Encolado: " + valor);
        }
    }

    // Desencola (saca el elemento más antiguo)
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("⚠️ La cola está vacía.");
            return -1;
        } else {
            int valor = cola[frente];        // Guarda el valor del frente
            frente = (frente + 1) % tamaño;  // Avanza circularmente
            System.out.println("Desencolado: " + valor);
            return valor;
        }
    }

    // Muestra el contenido actual de la cola
    public void mostrar() {
        System.out.print("Cola actual: ");
        if (estaVacia()) {
            System.out.println("[vacía]");
        } else {
            int i = frente;
            while (i != fin) {
                System.out.print(cola[i] + " ");
                i = (i + 1) % tamaño;
            }
            System.out.println();
        }
    }
}

