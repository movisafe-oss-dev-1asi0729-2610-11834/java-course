# Guion de video - Lección 4: Métodos, parámetros y entrada de datos

**Duración sugerida**: 12 minutos  
**Herramienta**: Replit, JDoodle u OnlineGDB  
**Objetivo**: Que el estudiante organice código en métodos y lea datos desde consola.

## Estructura del video

### 0:00 - 1:00 | Introducción
Explica que cuando un programa crece, conviene dividirlo en partes pequeñas llamadas métodos.

### 1:00 - 4:00 | Crear un método simple
Mostrar:

```java
public static void showWelcome(String name) {
    System.out.println("Bienvenido/a, " + name + "!");
}
```

Explicar que `name` es un parámetro.

### 4:00 - 7:00 | Entrada de datos con Scanner
Mostrar:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String name = scanner.nextLine();
```

Explicar que `Scanner` permite leer lo que el usuario escribe.

### 7:00 - 10:30 | Método con retorno
Mostrar:

```java
public static int calculateNextAge(int age) {
    return age + 1;
}
```

Explicar que `return` devuelve un resultado.

### 10:30 - 12:00 | Práctica y cierre
Pedir al estudiante agregar otro método, por ejemplo, uno que muestre un mensaje motivador.

## Checklist de grabación

- Explicar método, parámetro y retorno con ejemplos simples.
- Probar entradas de texto y número.
- Cerrar el `Scanner` al final.
