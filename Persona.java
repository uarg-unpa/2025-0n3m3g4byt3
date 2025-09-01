import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt(); // Lee directamente como int

        // Validaciones
        boolean nombreValido = nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+");
        boolean apellidoValido = apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+");
        boolean dniValido = dni.matches("\\d{7,8}"); // 7 u 8 dígitos
        boolean edadValida = edad >= 0 && edad <= 120;

        // Resultado
        if (nombreValido && apellidoValido && dniValido && edadValida) {
            System.out.println("✅ Datos válidos");
        } else {
            System.out.println("❌ Datos inválidos");
        }

        sc.close();
    }
}