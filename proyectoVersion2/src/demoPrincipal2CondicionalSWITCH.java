import java.util.Scanner;

public class demoPrincipal2CondicionalSWITCH {

    /*
    * Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares,
    * con el siguiente menú de opciones:
    1.	Ingresar dinero a la cuenta
    2.	Retirar dinero de la cuenta
    3.	Salir
    *
    * */

    public static void main(String argumento[]){
        final int saldo_inicial = 1000;
        int opcion;
        double ingreso,saldoActual,retiro;

        //Entrada de datos por consola
        Scanner entrada = new Scanner(System.in);

        System.out.println("1.Ingresar dinero a la cuenta");
        System.out.println("2.Retirar dinero de la cuenta");
        System.out.println("3. Salir");

        System.out.println("Ingresar un numero : ");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Digite la cantidad que desea ingresar en la cuenta :");
                ingreso = entrada.nextDouble();
                saldoActual = saldo_inicial+ingreso;
                System.out.println("El saldo actual de la cuenta es : " + saldoActual);
                break;
            case 2:
                System.out.println("Digite la cantidad que desea retirar:");
                retiro = entrada.nextDouble();

                if (retiro<=saldo_inicial) {
                    saldoActual = saldo_inicial - retiro;
                    System.out.println("El saldo actual de la cuenta es : " + saldoActual);
                }
                break;
            case 3:
                break;
        }

    }
}
