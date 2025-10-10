public class Main_ColaCircular {
    public static void main(String[] args) {
        Clase_ColaCircular cola = new Clase_ColaCircular(5);
        // Simulación de la actividad del PDF
        cola.encolar(10);
        cola.mostrar();

        cola.encolar(20);
        cola.mostrar();

        cola.encolar(30);
        cola.mostrar();

        cola.desencolar();
        cola.mostrar();

        cola.encolar(40);
        cola.mostrar();

        cola.encolar(50);
        cola.mostrar();

        cola.desencolar();
        cola.mostrar();

        cola.encolar(60);
        cola.mostrar();

        System.out.println("\n✅ Ejecución finalizada correctamente.");
    }
}

