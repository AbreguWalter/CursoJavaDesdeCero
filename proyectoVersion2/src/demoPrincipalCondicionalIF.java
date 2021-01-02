import temasJava.Persona;

import java.util.Scanner;

public class demoPrincipalCondicionalIF {

    /*
    * Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario y contraseña,
    * y mostrar un mensaje en pantalla, inicio de sesión correcto/ nombre de usuario incorrecto.
    * */

    public static void main(String argumento[]){

        String nombre;

        String clave;

        //Entrada de datos por consola
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese Nombre de usuario :");

        nombre = entrada.nextLine();

        System.out.println("Ingrese Clave de usuario :");

        clave = entrada.nextLine();

        if(nombre.equals("walter") && clave.equals("123456")){
            System.out.println("Bienvenido al Sistema");
        } else {
            System.out.println("El nombre o la clave del usuario no es el correcto.");
        }

    }
}
