# Variablesyoperadores
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


    }
}
