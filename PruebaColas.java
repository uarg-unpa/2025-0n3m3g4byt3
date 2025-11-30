package Proyectos.Mains;

import Proyectos.Clases.ColaInt2;
public class PruebaColas {
    public static void main(String[] args) {
        int i=0;
        int cap = 8;
        ColaInt2 c = new ColaInt2(cap);
        ColaInt2 aux = new ColaInt2(cap);
        c.meter(10);
        c.meter(20);
        c.meter(15);
        c.meter(30);
        c.meter(20);
        c.meter(40);
        c.meter(20);
        System.out.println(c.contiene(25));
        System.out.println(c.eliminarTodas(20));
        System.out.println("Cola resultante: " + c.toString());
        System.out.println("Cola invertida: " + c.invertir().toString());
        }
    }

