public class Main {
    public static void main(String[] args) {
        // TODO: Crea un objeto Student y muestra su información.
        Student student = new Student("Alex", 15);
        student.showProfile();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showProfile() {
        System.out.println("Estudiante: " + name);
        System.out.println("Edad: " + age);
    }
}
