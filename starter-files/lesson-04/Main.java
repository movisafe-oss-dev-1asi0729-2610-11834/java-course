import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String name = scanner.nextLine();

        // TODO: Llama al método showWelcome y envía el nombre como parámetro.
        showWelcome(name);

        scanner.close();
    }

    public static void showWelcome(String name) {
        System.out.println("Bienvenido/a, " + name + "!");
    }
}
