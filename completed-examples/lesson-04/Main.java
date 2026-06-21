import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String name = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int age = scanner.nextInt();

        showWelcome(name, age);

        int nextAge = calculateNextAge(age);
        System.out.println("El próximo año tendrás " + nextAge + " años.");

        scanner.close();
    }

    public static void showWelcome(String name, int age) {
        System.out.println("Bienvenido/a, " + name + "!");
        System.out.println("Tu edad registrada es: " + age);
    }

    public static int calculateNextAge(int age) {
        return age + 1;
    }
}
