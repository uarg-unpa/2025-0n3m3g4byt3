<<<<<<< Updated upstream
package Proyectos.Clases;

public class PilaEnergia {
    private final int maxpila = 100;
    private int[] elementos;
    private int cima;

    public PilaEnergia() {
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == maxpila - 1;
    }

    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
    }

    public int sacar() {
        int aux = elementos[cima];
        cima--;
        return aux;
    }

    public int cima() {
        return elementos[cima];
    }

    // 🔹 Método recursivo para contar ocurrencias
    public int contarOcurrencias(int x) {
        return contarRecursivo(x, 0, new PilaEnergia());
    }

    private int contarRecursivo(int x, int acumulado, PilaEnergia aux) {
        if (estaVacia()) {
            // restaurar
            while (!aux.estaVacia()) meter(aux.sacar());
            return acumulado;
        }
        int elem = sacar();
        aux.meter(elem);
        return contarRecursivo(x, acumulado + (elem == x ? 1 : 0), aux);
    }
}

=======
package Proyectos.Clases;

public class PilaEnergia {
    private final int maxpila = 100;
    private int[] elementos;
    private int cima;

    public PilaEnergia() {
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == maxpila - 1;
    }

    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
    }

    public int sacar() {
        int aux = elementos[cima];
        cima--;
        return aux;
    }

    public int cima() {
        return elementos[cima];
    }

    // 🔹 Método recursivo para contar ocurrencias
    public int contarOcurrencias(int x) {
        return contarRecursivo(x, 0, new PilaEnergia());
    }

    private int contarRecursivo(int x, int acumulado, PilaEnergia aux) {
        if (estaVacia()) {
            // restaurar
            while (!aux.estaVacia()) meter(aux.sacar());
            return acumulado;
        }
        int elem = sacar();
        aux.meter(elem);
        return contarRecursivo(x, acumulado + (elem == x ? 1 : 0), aux);
    }
}

>>>>>>> Stashed changes
