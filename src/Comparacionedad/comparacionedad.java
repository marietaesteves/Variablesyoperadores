package Comparacionedad;

import java.util.Scanner;

public class comparacionedad {  // Corrección 1: nombre de la clase con mayúscula
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
        if (edad >= 18 && edad <= 59) {  // Corrección 2: expresión lógica correcta
            System.out.println("Adulto");
        }

        // Adulto mayor: 60+
        if (edad >= 60) {
            System.out.println("Adulto Mayor");
        }

        sc.close();
    }
}