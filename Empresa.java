package Proyectos.Mains;

import java.util.Locale;
import java.util.Scanner;

import Proyectos.Clases.Empleado;
import Proyectos.Clases.Persona;
public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //Acepta punto como separador decimal.

        //Array para guardar los empleados:

        int cantEmpleados = 3;
        Empleado[] empleados = new Empleado[cantEmpleados];
        System.out.println("/// Lista de empleados /// ");
        for (int i = 0; i < cantEmpleados; i++) {
            System.out.println("Empleado N°" + (i + 1) + ": ");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Sueldo: ");
            double sueldo = scanner.nextDouble();
            System.out.print("Legajo: ");
            int legajo = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            Persona persona = new Persona(nombre, apellido, edad, peso, altura);
            Empleado empleado = new Empleado(persona, sueldo, legajo);
            empleados[i] = new Empleado(persona, sueldo, legajo);
        }

        //Comparación de sueldos entre el primer empleado y el segundo:
        if(empleados[0].ganaMasQue(empleados[1])) {
            System.out.println("El empleado N°1 gana más que el empleado N°2.");
        } else {
            System.out.println("El empleado N°1 no gana más que el empleado N°2.");
        }
        scanner.close();
}
}
