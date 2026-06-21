public class Main {
    public static void main(String[] args) {
        int age = 15;
        int score = 18;

        if (age >= 13 && score >= 14) {
            System.out.println("Puedes unirte al club de programación.");
        } else if (age >= 13) {
            System.out.println("Puedes practicar un poco más y volver a intentarlo.");
        } else {
            System.out.println("Puedes empezar con ejercicios básicos y divertidos.");
        }

        System.out.println("Lista de retos de la semana:");
        for (int challenge = 1; challenge <= 5; challenge++) {
            System.out.println("Reto " + challenge + ": resolver un ejercicio corto.");
        }

        int countdown = 3;
        while (countdown > 0) {
            System.out.println("El programa inicia en " + countdown);
            countdown--;
        }

        System.out.println("¡A programar!");
    }
}
