package Proyectos.Mains;
import Proyectos.Clases.Deportista;
public class MainDeportista {
    public static void main(String[] args) {

        //Creación e inicialización de los dos deportistas:
        Deportista deportista1 = new Deportista ("Messi", 38, "Futbol", 93);
        Deportista deportista2 = new Deportista ("Cristiano",40, "Futbol", 91 );
        deportista1.toString();
        deportista2.toString();

        //Comparación de puntaje para ver cuál de los dos deportistas es más experimentado:
        if (deportista1.esMasExperimentado(deportista2) == true) {
            System.out.println("El deportista " + deportista1.getNombre() + " es más experimentado que " + deportista2.getNombre()+ ".");
        } else {
            System.out.println("El segundo deportista " + deportista2.getNombre() + " es más experimentado que " + deportista1.getNombre() + ".");
        }


        //Validación de si ambos deportistas son mayores de edad:
        if (deportista1.esMayorDeEdad()) {
            System.out.println("El deportista " + deportista1.getNombre() + " es mayor de edad.");
        } else {
            System.out.println("El deportista " + deportista1.getNombre() + " no es mayor de edad.");
}

        if (deportista2.esMayorDeEdad()) {
            System.out.println("El deportista " + deportista2.getNombre() + " es mayor de edad.");
        } else {
            System.out.println("El deportista " + deportista2.getNombre() + " no es mayor de edad.");
}
}
}