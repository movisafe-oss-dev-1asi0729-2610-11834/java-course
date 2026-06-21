import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.print("Edad: ");
        int age = scanner.nextInt();

        System.out.print("Promedio final: ");
        double finalAverage = scanner.nextDouble();

        Student student = new Student(name, age, finalAverage);

        String[] favoriteSubjects = {"Matemática", "Comunicación", "Ciencia"};

        student.showProfile();
        student.showResult();

        System.out.println("Cursos recomendados para seguir practicando:");
        for (String subject : favoriteSubjects) {
            System.out.println("- " + subject);
        }

        scanner.close();
    }
}

class Student {
    private String name;
    private int age;
    private double finalAverage;

    public Student(String name, int age, double finalAverage) {
        this.name = name;
        this.age = age;
        this.finalAverage = finalAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFinalAverage() {
        return finalAverage;
    }

    public void setFinalAverage(double finalAverage) {
        this.finalAverage = finalAverage;
    }

    public void showProfile() {
        System.out.println("\nPerfil del estudiante");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Promedio final: " + finalAverage);
    }

    public void showResult() {
        if (finalAverage >= 13) {
            System.out.println("Resultado: aprobado/a. ¡Buen trabajo!");
        } else {
            System.out.println("Resultado: sigue practicando. Puedes mejorar paso a paso.");
        }
    }
}
