package Proyectos.Mains;

import Proyectos.Clases.Auto;

public class MainAuto {
    public static void main(String[] args) {
        //Creación e inicialización de los tres autos dentro de un array:
        Auto auto1 = new Auto ("Ferrari", "488 GPT", 2020, 330);
        Auto auto2 = new Auto ("Dodge", "Challenger SRT Hellcat", 2019, 320);
        Auto auto3 = new Auto ("Ford", "Mustang Fastback", 1967, 200);
        Auto masRapido; //Un objeto auxiliar para usarlo en la verificación de cual de los tres autos es más rápido.


        //Comparación de cuál auto es más rápido de los tres:
        if (auto1.esMasRapidoQue(auto2)) {
            masRapido = auto1;
        } else {
            masRapido = auto2;
        }
        if (masRapido.esMasRapidoQue(auto3)) {
            System.out.println("El auto más rápido de los tres es el: " + masRapido.getMarca() + " " + masRapido.getModelo() + " con aproximadamente" + " " +masRapido.getVelocidadMax() + "Km/h.");
        } else {
            System.out.println("El auto más rápido de los tres es: " + auto3.getMarca() + " " + auto3.getModelo() + " con aproximadamente" + " " +auto3.getVelocidadMax() + "Km/h.");
        }

        //Comparación de cuál de los tres autos es clásico:
        if (auto1.esAutoClasico()) {
        System.out.println("El " + auto1.getMarca() + " " + auto1.getModelo() + " es clásico.");
}
        if (auto2.esAutoClasico()) {
        System.out.println("El " + auto2.getMarca() + " " + auto2.getModelo() + " es clásico.");
}
        if (auto3.esAutoClasico()) {
        System.out.println("El " + auto3.getMarca() + " " + auto3.getModelo() + " es clásico.");
}
}
}
