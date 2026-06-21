# Guion de video - Lección 5: Fundamentos de POO y mini proyecto final

**Duración sugerida**: 10 minutos  
**Herramienta**: OnlineGDB, Replit o JDoodle  
**Objetivo**: Que el estudiante entienda clases, objetos, constructor, métodos, encapsulación y un mini proyecto.

## Estructura del video

Guion de Presentación - Lección 5: Programación Orientada a Objetos

Hola a todos. Bienvenidos a esta lección sobre Programación Orientada a Objetos, o POO.

La Programación Orientada a Objetos es uno de los paradigmas más utilizados en el desarrollo de software actual, ya que nos permite representar elementos del mundo real mediante clases y objetos.

En esta sesión aprenderemos los conceptos fundamentales de este paradigma utilizando Java.

Los temas que veremos son:

Clases, que funcionan como plantillas para definir características y comportamientos.
Objetos, que son instancias creadas a partir de una clase.
Constructores, que permiten inicializar los objetos al momento de crearlos.
Encapsulación, una técnica que protege los datos y controla el acceso a ellos mediante métodos.

Para aplicar estos conceptos desarrollaremos un mini proyecto de una cuenta bancaria.

Este proyecto permitirá registrar un titular, almacenar un saldo, realizar depósitos, efectuar retiros y mostrar la información actualizada de la cuenta.

A lo largo de la práctica veremos cómo cada uno de los conceptos de Programación Orientada a Objetos se integra para construir una solución funcional y organizada.

Ahora sí, comencemos creando nuestra primera clase y entendiendo cómo funcionan los objetos en Java.

Explicación del Código

Ahora vamos a desarrollar un pequeño sistema de cuenta bancaria para aplicar los conceptos de Programación Orientada a Objetos que hemos aprendido.

Lo primero que hacemos es crear nuestra clase principal:

public class Main

Una clase es una plantilla que define cómo serán los objetos que creemos posteriormente. En este caso, la clase representará una cuenta bancaria.

Atributos y Encapsulación

A continuación declaramos los atributos:

private String titular;
private double saldo;

Aquí estamos aplicando el concepto de encapsulación.

La palabra clave private significa que estos atributos solo pueden ser accedidos desde dentro de la propia clase.

El atributo titular almacenará el nombre del propietario de la cuenta, mientras que saldo almacenará la cantidad de dinero disponible.

La encapsulación es importante porque protege la información y evita modificaciones indebidas desde otras partes del programa.

Constructor

Ahora observemos el constructor:

public Main(String titular, double saldoInicial)

Un constructor es un método especial que se ejecuta automáticamente cuando creamos un objeto.

Su función es inicializar los atributos con valores iniciales.

Dentro del constructor encontramos:

this.titular = titular;
this.saldo = saldoInicial;

La palabra reservada this hace referencia al objeto actual.

Aquí estamos asignando los valores recibidos como parámetros a los atributos de la clase.

Gracias al constructor, cada cuenta bancaria puede crearse con información diferente.

Método Depositar

Ahora analizamos el método:

public void depositar(double monto)

Este método permite agregar dinero a la cuenta.

La instrucción:

saldo += monto;

equivale a:

saldo = saldo + monto;

Es decir, suma el monto ingresado al saldo actual.

Por ejemplo, si tenemos 1000 soles y depositamos 500, el nuevo saldo será 1500 soles.

Método Retirar

El siguiente método es:

public void retirar(double monto)

Su función es retirar dinero de la cuenta.

Antes de realizar la operación verificamos:

if (monto <= saldo)

Esta condición comprueba si existe suficiente dinero disponible.

Si la condición se cumple:

saldo -= monto;

se descuenta el monto solicitado.

En caso contrario:

System.out.println("Fondos insuficientes");

se muestra un mensaje indicando que no es posible realizar la operación.

Este tipo de validaciones son fundamentales para evitar errores en los sistemas reales.

Método Mostrar Información

Ahora observemos:

public void mostrarInformacion()

Este método tiene la responsabilidad de mostrar los datos actuales de la cuenta.

Las instrucciones:

System.out.println("Titular: " + titular);
System.out.println("Saldo: S/" + saldo);

imprimen el nombre del titular y el saldo disponible.

Separar esta funcionalidad en un método mejora la organización y reutilización del código.

Creación del Objeto

Llegamos al método principal:

public static void main(String[] args)

Este es el punto de entrada del programa.

Aquí crearemos nuestro objeto:

Main cuenta = new Main("Ana", 1000);

Estamos creando una instancia de la clase.

Recordemos que una clase es la plantilla y un objeto es una instancia real creada a partir de ella.

En este caso, estamos creando una cuenta bancaria para Ana con un saldo inicial de 1000 soles.

Ejecución de los Métodos

Ahora llamamos al método:

cuenta.mostrarInformacion();

La salida será:

Titular: Ana
Saldo: S/1000.0

Luego realizamos un depósito:

cuenta.depositar(500);

El saldo aumenta de 1000 a 1500 soles.

Después realizamos un retiro:

cuenta.retirar(200);

El saldo disminuye de 1500 a 1300 soles.

Finalmente mostramos nuevamente la información:

cuenta.mostrarInformacion();

y obtenemos:

Titular: Ana
Saldo: S/1300.0
Cierre de la Lección

Con este ejemplo hemos aplicado los principales conceptos de Programación Orientada a Objetos:

Clase: Main, que representa una cuenta bancaria.
Objeto: cuenta, creado a partir de la clase.
Constructor: utilizado para inicializar el titular y el saldo.
Encapsulación: mediante atributos privados.
Métodos: para depositar, retirar y mostrar información.

Aunque este es un ejemplo sencillo, los mismos principios se utilizan en aplicaciones reales como sistemas bancarios, plataformas web y aplicaciones móviles.
