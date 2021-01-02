import java.util.Scanner;

public class demoPrincipal1CondicionalIF {

    /*
    *Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente:
    * si el pago se efectúa al “contado”, calcular un descuento del 5%; pero si el pago es con “tarjeta”
    * se incrementa un recargo del 3% al valor de compra. Calcular y visualizar el descuento o recargo
    * según sea el caso y el total a pagar de la compra.
    * */

    public static void main(String argumento[]){

        double valor;

        double descuento;

        double recarga;

        double total;

        String tipo_pago;

        //Entrada de datos por consola
        Scanner entrada = new Scanner(System.in);

        //siempre es recomendable que cuando ingresemos un dato por consola se primero String y luego los valores enteros
        System.out.println("Ingrese el tipo de pago :");
        tipo_pago = entrada.nextLine();

        System.out.println("Ingrese el valor de la compra :");
        valor = entrada.nextDouble();


        descuento = 0.05*valor;
        recarga = 0.03*valor;

        if(tipo_pago.equalsIgnoreCase("contado")){
            System.out.println("El descuento es " + descuento);
            total = valor - descuento;
            System.out.println("El total es " + total);
        }else{
            System.out.println("El recargo al monto es  " + recarga);
            total = valor + recarga;
            System.out.println("El total es " + total);
        }


    }
}
