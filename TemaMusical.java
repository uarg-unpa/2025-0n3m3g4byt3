package Proyectos.Clases;

public class TemaMusical {
    private String interprete;
    private String genero;
    private int anioLanzamiento;

    public TemaMusical(String interprete, String genero, int anioLanzamiento) {
        this.interprete = interprete;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }


    public String toString() {
        return interprete + " - " + genero + " (" + anioLanzamiento + ")";
}
}