package GestorCItas;

import java.util.Scanner;

public class LOGIN {

//Esta sera una muestra del login de pacientes que realizaremos 
    public static void main(String[] args) {
 Scanner teclado=new Scanner(System.in);
 String usuarioRegistrado="Ricardo";
 String contrasenaRegistrada="123456";
 String usuario;
 String contrasena;
 
        System.out.println("Hola vamos a validad tus credenciales de acceso");
        System.out.println("ingresa tu usuario");
        usuario=teclado.next();
        System.out.println("ingresa tu contraseña");
        contrasena=teclado.next();
        
        if(usuario.equalsIgnoreCase(usuarioRegistrado) & contrasena.equalsIgnoreCase(contrasenaRegistrada) ){
            System.out.println("Bienvenido "+ usuario);
        
        }
        else{
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
    
}
