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