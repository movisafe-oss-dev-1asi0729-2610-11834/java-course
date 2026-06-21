import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Por favor, escribe tu nombre: ");
        String nombreIngresado = lector.nextLine();
        System.out.print("Ahora, escribe tu edad: ");
        int edadIngresada = lector.nextInt();
        saludarUsuario(nombreIngresado, edadIngresada);
        lector.close();
    }
    public static void saludarUsuario(String nombre, int edad) {
        System.out.println("¡Hola " + nombre + "! Qué genial que tengas " + edad + " años.");
        System.out.println("¡Bienvenido al mundo del código!");
    }
}
