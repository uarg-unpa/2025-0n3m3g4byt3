
import java.util.NoSuchElementException;

public class ColaCaracteres {
    private char[] datos;   // arreglo para guardar los caracteres
    private int capacidad;  // capacidad máxima de la cola
    private int tamaño;     // número actual de elementos (elementos válidos en 0..tamaño-1)

    // Constructor: recibe la capacidad máxima
    public ColaCaracteres(int capacidad) {
        if (capacidad <= 0) throw new IllegalArgumentException("Capacidad debe ser > 0");
        this.capacidad = capacidad;
        this.datos = new char[capacidad];
        this.tamaño = 0;
    }

    // Indica si la cola está vacía
    public boolean isEmpty() {
        return this.tamaño == 0;
    }

    // Indica si la cola está llena
    public boolean isFull() {
        return this.tamaño == this.capacidad;
    }

    // Encola un carácter al final de la cola (si hay espacio)
    // Complejidad: O(1)
    public void enqueue(char c) {
        if (isFull()) {
            throw new IllegalStateException("Cola llena: no se puede encolar '" + c + "'.");
        }
        // Insertamos en la primera posición libre: indice = tamaño
        datos[tamaño] = c;
        tamaño++;
    }

    // Desencola (elimina y retorna) el elemento del frente (índice 0).
    // Después desplaza todos los elementos hacia la izquierda para mantener el frente en 0.
    // Complejidad: O(n) por el desplazamiento.
    public char dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cola vacía: no se puede desencolar.");
        }
        char frente = datos[0]; // guardamos el elemento a devolver

        // Desplazamos los elementos hacia la izquierda:
        // datos[0] <- datos[1], datos[1] <- datos[2], ..., hasta tamaño-2 <- tamaño-1
        for (int i = 0; i < tamaño - 1; i++) {
            datos[i] = datos[i + 1];
        }

        // Reducimos el tamaño y limpiamos la última posición (opcional)
        tamaño--;
        datos[tamaño] = '\0'; // opcional: dejar vacío el slot que ya no usamos

        return frente;
    }

    // Devuelve el elemento del frente sin eliminarlo
    public char peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cola vacía: no hay frente.");
        }
        return datos[0];
    }

    // Devuelve el tamaño actual
    public int size() {
        return tamaño;
    }

    // Devuelve la capacidad máxima
    public int capacity() {
        return capacidad;
    }

    // Representación como cadena: [a, b, c]
    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamaño; i++) {
            sb.append(datos[i]);
            if (i < tamaño - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}


