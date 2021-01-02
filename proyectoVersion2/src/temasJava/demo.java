package temasJava;

import temasJava.Persona;

public class demo {

    /*
    * El método main es el primer elemento llamado por la máquina virtual de java al lanzar la aplicación.
    * public : modificador de acceso utilizado para hacer que el metodo sea accesible al conjunto de las demas clases
    * y objetos de la aplicacion y para el interprete de Java
    * static: modificsador de acceso utilizado para definir el metodo main() como metodo de clase
    * void : palabra clave utilizada para indicar que el metodo es un procedimiento que no devuelve valor
    * main: identificador del metodo
    * String argumento[] : parametro del metodo y vertor de cadena de caracteres.
    * */
    public static void main(String argumento[]){
        //System.out.println("Hola mundo");
        //System.out.println("Bienvenidos al curso de Java desde cero");

        Persona persona = new Persona();

        Persona persona2 = new Persona("Hugo","Tinoco","Hugito","72181733",24,"ROCK");

        persona.setNombre("Walter");
        persona.setApellido("Abregu Tinoco");
        persona.setChapa("Wally");
        persona.setDni("72181731");
        persona.setEdad(26);

        System.out.println(persona2.toString());
        System.out.println(persona.toString());
        //persona.tipoMusica = "POP";

        //System.out.println(persona.tipoMusica);

        /*System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getChapa());
        System.out.println(persona.getDni());
        System.out.println(persona.getEdad());*/

    }
}
