package temasJava;

import java.util.ArrayList;

public class variables {

    public static void main(String argumento[]){

        /*
        * Las temasJava.variables obligatoriamente empiezan con una letra
        * miNombre y MiNombre son distintas
        *
        * */

        String miNombre = "Walter Abregu";
        String MiNombre = "Walter Abregu";

        String primerNombre = "";

        System.out.println(miNombre);
        System.out.println(MiNombre);
        System.out.println(primerNombre);


        //Variables enteras su declaracion:

        byte numero1 = 1;
        short numero2 = 100;
        int numero3 = 10000;
        long numero4 = 1000000;

        //Variables decimales su declaracion:

        double numeroDecimal = 23.888;
        //Java cuando tu declaras un numero decimal siempre por defecto es double
        // Si quieres que sea flotante o float tienes que espeficiar al final del numero una f o F
        float numeroDecimal2 = 15.8f;

        System.out.println(numeroDecimal2);

        float numeroDecimal3 = (float) 14.8;

        System.out.println(numeroDecimal3);
        //Variables boleanas:

        boolean bandera = true;

        boolean bandera1 = false;

        System.out.println(bandera);
        //Variables de caracteres :

        char valor = 'a';

        String valorDeCaracteres = "hola mundo Java desde cero";


        //Variables Wrapper Class

        int numeroEntero = Integer.parseInt("10");

        double numeroDecimalParseado = Double.parseDouble("34.9");

        System.out.println(numeroDecimalParseado);
        System.out.println(numeroEntero);
        System.out.println(valorDeCaracteres);
        System.out.println(valor);

        String s = String.valueOf(3);

        String s1 = String.valueOf(true);

        System.out.println(s);

        System.out.println(s1);


    }
}
