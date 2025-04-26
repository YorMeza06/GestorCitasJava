package GestorCItas;

import java.util.Scanner;

public class LOGIN {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioRegistrado = "Ricardo";
        String contrasenaRegistrada = "123456";
        String usuario;
        String contrasena;

        try {
            System.out.println("Hola, vamos a validar tus credenciales de acceso");

            System.out.print("Ingresa tu usuario: ");
            usuario = teclado.next();

            System.out.print("Ingresa tu contrase?a: ");
            contrasena = teclado.next();

            if (usuario.equalsIgnoreCase(usuarioRegistrado) && contrasena.equals(contrasenaRegistrada)) {
                System.out.println("Bienvenido " + usuario);
            } else {
                System.out.println("Usuario o contrase?a incorrecta");
            }

            //capturamos cualquier error que pueda ocasionar ingresar mal los datosRicard
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ingresar los datos.");
        }
    }
}
