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


