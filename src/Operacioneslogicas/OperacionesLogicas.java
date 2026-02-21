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


