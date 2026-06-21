# Guion de video - Lección 3: Estructuras de control, decisiones y bucles

**Duración sugerida**: 12 minutos  
**Herramienta**: OnlineGDB, JDoodle o Replit  
**Objetivo**: Que el estudiante use decisiones y repeticiones en Java.

## Estructura del video

### 0:00 - 1:00 | Introducción
Explica que no todos los programas hacen siempre lo mismo. A veces deben tomar decisiones o repetir tareas.

### 1:00 - 5:00 | Condicionales if-else
Mostrar un ejemplo:

```java
int age = 15;

if (age >= 13) {
    System.out.println("Puedes unirte al club de programación.");
} else {
    System.out.println("Puedes seguir practicando para unirte pronto.");
}
```

Explicar que la condición puede ser verdadera o falsa.

### 5:00 - 8:30 | Bucle for
Mostrar cómo repetir un mensaje cinco veces:

```java
for (int challenge = 1; challenge <= 5; challenge++) {
    System.out.println("Reto " + challenge);
}
```

### 8:30 - 10:30 | Bucle while
Mostrar una cuenta regresiva:

```java
int countdown = 3;
while (countdown > 0) {
    System.out.println(countdown);
    countdown--;
}
```

### 10:30 - 12:00 | Práctica y cierre
Pedir cambiar la edad, el puntaje y el número de repeticiones.

## Checklist de grabación

- Usar ejemplos cortos.
- Ejecutar el programa después de cada bloque.
- Explicar `true` y `false` con lenguaje sencillo.
