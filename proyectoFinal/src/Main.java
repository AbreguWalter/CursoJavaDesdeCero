import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String argumento[]){

        //Utilizando el objeto de entrada obtenemos lo que el usuario ingrese por consola
        Scanner entrada = new Scanner(System.in);

        //Creamos la lista en donde seran almacenados los vehiculos.
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        //El while sera ejecutado hasta que  la entrada sea salir TRUE

        boolean salir = false;

        while (!salir){
            // Le incamos al usuario  ales son sus opciones
            System.out.println("Ingrese la opcion :");
            System.out.println("1.- Crear Vehiculo");
            System.out.println("2.- Listar vehiculos ingresados");
            System.out.println("3.- Eliminar vehiculo");
            System.out.println("4.- Modificar vehiculo");
            System.out.println("0 .- Salir");

            //Obtenemos el numero ingresado por el usuario en la consola
            int opcion = Integer.parseInt(entrada.nextLine());

            //Segun el numero que el usaurio ingreser en la consola se ejecutara el "case" correspondiente
            switch (opcion){
                case 1: // "case" ingresar nuevo vehiculo
                    Vehiculo a = new Vehiculo();
                    System.out.println("Ingrese patente del vehiculo :");
                    //obteniendo la patente del vehiculo
                    a.setPatente(entrada.nextLine());
                    System.out.println("Ingrese la marca del vehiculo :");
                    //obteniendo la marca de vehiculo
                    a.setMarca(entrada.nextLine());
                    System.out.println("Ingrese el color :");
                    //obteni3endo el color del vehiculo
                    a.setColor(entrada.nextLine());
                    System.out.println("Ingrese los litros de bencina :");
                    //obteniendo la csntidad de litos de bencina que necesita el vehiculo
                    a.setBencina(Integer.parseInt(entrada.nextLine()));

                    //Este paso es fundamental porque tomamos el vehiculo que a sido definido
                    // por la variable a y lo agrupamos a la lista de vehiculos utilizando el metodo .add(a)
                    listaVehiculos.add(a);

                    //Le avisamos al usuario del vehiculo creado:

                    /*System.out.println("Vehiculo creado :");
                    System.out.println("Patente :" + a.getPatente());
                    System.out.println("Marca : "+ a.getMarca());
                    System.out.println("Color : "+ a.getColor());
                    System.out.println("Litros de Bencina : "+ a.getBencian());*/

                    System.out.println(a.toString());

                    break;
                case 2 : //Listar de todos los vehiculos ingresados.
                    // el for va a recorrer todos los elementos que estén almacenados en la lista.
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        //listavehiculos.size() Permite ver cuantos elementos hay guardados.
                        System.out.println("*********************************************");
                        System.out.println("Auto: " + (i+1));
                        // Para obtener un elemento de la lista, utilizamos .get():
                        Vehiculo auto = listaVehiculos.get(i);

                        System.out.println("Patente :" + auto.getPatente());
                        System.out.println("Marca :" + auto.getMarca());
                        System.out.println("Color :" + auto.getColor());
                        System.out.println("Litros Bencina :" + auto.getBencian());
                    }
                    break;
                case 3 ://Elimnar vehiculo de la lista
                    System.out.println("Ingrese la patente del vehiculo a eliminar ");

                    String patente = entrada.nextLine();

                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        Vehiculo auto = listaVehiculos.get(i);

                        if (patente.equals(auto.getPatente())){
                            listaVehiculos.remove(i);
                            System.out.println("Vehiculo fue eliminado");
                        }
                    }
                    break;
                case 4: //Modificacion del vehiculo :

                    System.out.println("Ingrese la patente del vehiculo a modificar ");

                    patente = entrada.nextLine();

                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        Vehiculo auto = listaVehiculos.get(i);

                        if (patente.equals(auto.getPatente())){
                            System.out.println("Marca del vehiculo : " + auto.getMarca());
                            System.out.println("Color del vehiculo : " + auto.getColor());

                            System.out.println("Ingrese nueva marca del vehiculo : ");
                            String marca = entrada.nextLine();
                            System.out.println("Ingrese nuevo color del vehiculo : ");
                            String color = entrada.nextLine();

                            auto.setMarca(marca);
                            auto.setColor(color);
                        }
                    }
                    break;
                case 0: //"case" salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa o programa terminado");
                    break;
                default:
                    //En caso de que el numero ingresado no sea correspondiente
                    System.out.println("Opcion ingresada por el usuario no es valida , ingrese nuevamente la opcion");

            }

        }


    }
}
