import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String argumento[]){

        Scanner entrada = new Scanner(System.in);

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        boolean salir = false;

        MetodosVehiculo metodosVehiculo = new MetodosVehiculo();

        while (!salir){

            metodosVehiculo.menuPrincipal();

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion){
                case 1:
                    metodosVehiculo.ingreseVehiculo(entrada,listaVehiculos);
                    break;

                case 2 :
                    metodosVehiculo.listadoVehiculos(listaVehiculos);
                    break;
                case 3 :
                    metodosVehiculo.eliminacionVehiculo(entrada,listaVehiculos);
                    break;
                case 4:
                    metodosVehiculo.modificarVehiculo(entrada,listaVehiculos);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa o programa terminado");
                    break;
                default:
                    System.out.println("Opcion ingresada por el usuario no es valida , ingrese nuevamente la opcion");

            }

        }


    }
}
