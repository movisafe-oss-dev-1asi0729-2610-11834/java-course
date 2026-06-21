# Guion de video - Lección 5: Fundamentos de POO y mini proyecto final

**Duración sugerida**: 14 a 15 minutos  
**Herramienta**: OnlineGDB, Replit o JDoodle  
**Objetivo**: Que el estudiante entienda clases, objetos, constructor, métodos, encapsulación y un mini proyecto.

## Estructura del video

### 0:00 - 1:30 | Introducción
Explica que la programación orientada a objetos permite representar elementos del mundo real dentro del código.

### 1:30 - 4:00 | Clase y objeto
Usa una analogía: una clase es un molde y un objeto es algo creado con ese molde. Ejemplo: clase `Student` y objeto `student`.

### 4:00 - 6:30 | Atributos y constructor
Mostrar:

```java
class Student {
    private String name;
    private int age;
    private double finalAverage;

    public Student(String name, int age, double finalAverage) {
        this.name = name;
        this.age = age;
        this.finalAverage = finalAverage;
    }
}
```

### 6:30 - 9:00 | Encapsulación con getters y setters
Explicar que `private` protege los datos y que los getters/setters permiten acceder o modificar de forma controlada.

### 9:00 - 12:30 | Mini proyecto: Registro de estudiante
Crear un objeto `Student`, pedir datos con `Scanner` y mostrar el perfil.

### 12:30 - 14:30 | Arrays simples y cierre
Mostrar un array de cursos recomendados y recorrerlo con `for-each`.

### 14:30 - 15:00 | Despedida
Felicitar al estudiante por completar el curso e invitarlo a modificar el proyecto con nuevos atributos.

## Checklist de grabación

- No saturar con demasiados conceptos.
- Usar analogías simples.
- Ejecutar el proyecto final completo.
- Mantener el texto grande y legible.
