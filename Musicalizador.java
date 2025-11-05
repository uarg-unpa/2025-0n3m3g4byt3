package Proyectos.Clases;

public class Musicalizador {
    private TemaMusical[] playlist;
    private int inicio;
    private int fin;
    private int capacidad = 100;


    public Musicalizador() {
        playlist = new TemaMusical[capacidad];
        inicio = 0;
        fin = 0;
    }

    public void agregarTema(TemaMusical tema) {
        playlist[fin] = tema;
        fin++;
    }

    public TemaMusical reproducirTema() {
        TemaMusical tema = playlist[inicio];
        inicio++;
        return tema;
}


    public boolean estaVacia() {
        return inicio == fin;
    }

    public boolean estaLlena() {
        return fin == capacidad;
    }

    public int cantidadTemas() {
        return fin - inicio;
    }
}