import java.util.NoSuchElementException;

public class ColaNombres {
    private String[] datos;   // arreglo de Strings
    private int capacidad;    // tamaño máximo
    private int frente;       // índice del primer elemento
    private int fin;          // índice del próximo espacio libre
    private int tamaño;       // cantidad actual de elementos

    // Constructor
    public ColaNombres(int capacidad) {
        if (capacidad <= 0) throw new IllegalArgumentException("Capacidad debe ser > 0");
        this.capacidad = capacidad;
        this.datos = new String[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.tamaño = 0;
    }

    // ¿Está vacía?
    public boolean isEmpty() {
        return tamaño == 0;
    }

    // ¿Está llena?
    public boolean isFull() {
        return tamaño == capacidad;
    }

    // Encolar un nombre al final (posición fin)
    public void enqueue(String nombre) {
        if (isFull()) throw new IllegalStateException("Cola llena: no se puede encolar " + nombre);
        datos[fin] = nombre;
        fin = (fin + 1) % capacidad; // avance circular
        tamaño++;
    }

    // Desencolar: eliminar y devolver el nombre más antiguo (posición frente)
    public String dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Cola vacía: no se puede desencolar.");
        String nombre = datos[frente];
        datos[frente] = null; // opcional: limpiar referencia
        frente = (frente + 1) % capacidad; // avance circular
        tamaño--;
        return nombre;
    }

    // Ver el frente sin eliminar
    public String peek() {
        if (isEmpty()) throw new NoSuchElementException("Cola vacía: no hay frente.");
        return datos[frente];
    }

    // Tamaño actual
    public int size() {
        return tamaño;
    }

    // Mostrar todo el contenido en orden FIFO
    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamaño; i++) {
            int index = (frente + i) % capacidad;
            sb.append(datos[index]);
            if (i < tamaño - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
