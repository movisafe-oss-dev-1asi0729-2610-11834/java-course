# Guion de video - Lección 4: Métodos, parámetros y entrada de datos

**Duración sugerida**: 10 minutos  
**Herramienta**: OnlineGDB  
**Objetivo**: Que el estudiante organice código en métodos y lea datos desde consola.

## Estructura del video

### 0:00 - 1:00 | Introducción
Explica que cuando un programa crece, conviene dividirlo en partes pequeñas llamadas métodos.

### 1:00 - 4:00 | Crear un método simple
Mostrar:

```java
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    }
}}
```

Explicar que `name` es un parámetro.

### 4:00 - 7:00 | Entrada de datos con Scanner
Mostrar:

```java
System.out.print("Por favor, escribe tu nombre: ");
String nombreIngresado = lector.nextLine();
System.out.print("Ahora, escribe tu edad: ");
int edadIngresada = lector.nextInt()
```

Explicar que `Scanner` permite leer lo que el usuario escribe.

### 7:00 - 08:30 | Método con retorno
Mostrar:

```java
saludarUsuario(nombreIngresado, edadIngresada);
lector.close();
}
```

Explicar que `return` devuelve un resultado.

### 08:30 - 10:00 | Práctica y cierre
Pedir al estudiante agregar otro método, por ejemplo, uno que muestre un mensaje motivador.

## Checklist de grabación

- Explicar método, parámetro y retorno con ejemplos simples.
- Probar entradas de texto y número.
- Cerrar el `Scanner` al final.
