# Variablesyoperadores
**¿Para qué se utilizan los operadores lógicos en programación?**
Los operadores logicos sirven para comparar, evaluar, combinar o negar condiciones, principalmente en estructuras como If-Else, Switch, While y for

**¿Por qué es importante declarar correctamente el tipo de dato de una variable?**
Para que cuando se ingrese el valor a la variable lo lea correctamente y se ingrese el tipo de dato que se necesita, en caso de que se necesiten numeros enteros y el usuario intente ingresar texto la variable no permite el ingreso de datos que no sean los solicitados.

**Explicar qué estructura de control utilizó en:**

**Clasificación de edad:** Se utilizo if-Else porque habia que hacer comparaciones numericas y era mas facil utilizando && y ><= para hacer las comparaciones segun el numero ingresado. Utlizando Switch seria un codigo largo e innecesario.

**Día de la semana:** Se utilizo Switch porque solo habia que agregar la respuesta a 7 posibles ingresos del usuario por lo tanto era un codigo mas corto.

**Verificación de acceso:** Se utilizo if-else para hacer las comparaciones de las cadenas de texto, por medio de equals que es para comparar cadenas, para validar o rechazar el usuario o contraseña ingresado que ya habia sido almacenado en el programa.

________________________________________________________________________________________________________________________________________________________________________________________________________________
**Programa 1**
package programadeclaracióndevariables;

import java.util.Scanner; // Se importa Scanner para poder utilizar las varibles

public class Programa1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Se crea correctamente el Scanner
 //Variables
        int numeroentero;
        String texto;
        double decimal;
        boolean Valorboleano;

        System.out.print("Ingrese un numero entero: ");
        numeroentero = sc.nextInt();

        sc.nextLine(); // limpiar buffer y permitir al usuario escribir

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();

        System.out.print("Ingrese un numero decimal: ");
        decimal = sc.nextDouble();

        System.out.print("Ingrese un valor booleano (true/false): ");
        Valorboleano = sc.nextBoolean();

        System.out.println("\nValores ingresados:");
        System.out.println("Numero Entero: " + numeroentero);
        System.out.println("Texto: " + texto);
        System.out.println("Decimal: " + decimal);
        System.out.println("Boolean: " + Valorboleano);

        sc.close();

_________________________________________________________________________________________________________________________________________
**Programa 2**
        package Programa2;

import java.util.Scanner;

public class Operacionesbasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Realizar operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // Para la división, debemos verificar que el segundo número no sea 0
        if (num2 != 0) {
            double division = (double) num1 / num2; // Convertimos a double para obtener decimales
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir entre 0");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
        
        //Enteros → byte, short, int, long

        // Decimales → float, double
    }
}

______________________________________________________________________________________________________
**Programa 3**
package Operacioneslogicas;
import java.util.Scanner;

public class OperacionesLogicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar dos valores numéricos
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        // Comparaciones básicas Mayor que (>)Menor que (<) Igual (==)
        System.out.println("\nComparaciones simples utilizando Mayor que (>)Menor que (<) Igual (==) :");
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }
        if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        }
        if (num1 == num2) {
            System.out.println(num1 + " es igual a " + num2);
        }

        // Operadores lógicos
        System.out.println("\nEjemplos de operadores lógicos: && And y || Or");
        // AND: ambos deben cumplirse
        if (num1 > 0 && num2 > 0) {
            System.out.println("Si numero 1 y 2 son mayores que 0 ambos números son positivos (AND)");
        } else {
            System.out.println("Al menos uno de los números no es positivo (AND)");
        }

        // OR: al menos uno se cumple
        if (num1 < 0 || num2 < 0) {
            System.out.println("Al menos uno de los números es negativo (OR)");
        } else {
            System.out.println("Ninguno de los números es negativo (OR)");
        }

        sc.close();
    }
}
_____________________________________________________________________________________________________________________________
**Programa 4**
package Comparacionedad;

import java.util.Scanner;

public class comparacionedad { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("\nLa edad corresponde a:");

        // Niño: 0-12
        if (edad >= 0 && edad <= 12) {
            System.out.println("Niño");
        }

        // Adolescente: 13-17
        if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        }

        // Adulto: 18-59
        if (edad >= 18 && edad <= 59) { 
            System.out.println("Adulto");
        }

        // Adulto mayor: 60+
        if (edad >= 60) {
            System.out.println("Adulto Mayor");
        }

        sc.close();
    }
}
**Se utilizo if-Else porque habia que hacer comparaciones numericas y era mas facil utilizando && y ><= para hacer las comparaciones segun el numero ingresado. Utlizando Switch seria un codigo largo e innecesario.**
____________________________________________________________________________________________________________________________________
**Programa 5**
package Diasdelasemana;

import java.util.Scanner; 

public class Diadelasemana {   
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Solicitar un número del 1 al 7
    System.out.print("Ingrese un número del 1 al 7: ");
    int dia = sc.nextInt();

    // Usamos switch para determinar el nombre del día
    switch (dia) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Número inválido. Debe ser del 1 al 7.");
    }

    sc.close();
}
}

**Se utilizo Switch porque solo habia que agregar la respuesta a 7 posibles ingresos del usuario por lo tanto era un codigo mas corto.**

_________________________________________________________________________________________________________________________________
**Programa 6**
package Verificaciondeacceso;

import java.util.Scanner;

public class verificaciondeacceso {  // Corrección: convención de nombres
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Usuario y contraseña "registrados" en el sistema
        String usuarioRegistrado = "Yesly Esteves";
        String contrasenaRegistrada = "1234";

        // Solicitar usuario y contraseña
        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = sc.nextLine();

        // Validación de acceso
        //equals sirve para comparar cadenas de texto
        if (usuario.equals(usuarioRegistrado) && contrasena.equals(contrasenaRegistrada)) {
            System.out.println("Acceso concedido");
        } else if (usuario.equals(usuarioRegistrado) && !contrasena.equals(contrasenaRegistrada)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario no registrado");
        }

        sc.close();
    }
}
**Se utilizo if-else para hacer las comparaciones para validar o rechazar el usuario o contraseña ingresado que ya habia sido almacenado en el programa**
__________________________________________________________________________________________________________________________________________________________
