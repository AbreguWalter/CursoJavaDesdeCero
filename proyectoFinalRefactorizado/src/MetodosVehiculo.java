import java.util.ArrayList;
import java.util.Scanner;

public class MetodosVehiculo {

    public void menuPrincipal(){
        System.out.println("Ingrese la opcion :");
        System.out.println("1.- Crear Vehiculo");
        System.out.println("2.- Listar vehiculos ingresados");
        System.out.println("3.- Eliminar vehiculo");
        System.out.println("4.- Modificar vehiculo");
        System.out.println("0 .- Salir");
    }

    public void ingreseVehiculo(Scanner entrada, ArrayList<Vehiculo> listaVehiculos){
        Vehiculo a = new Vehiculo();
        System.out.println("Ingrese patente del vehiculo :");
        a.setPatente(entrada.nextLine());
        System.out.println("Ingrese la marca del vehiculo :");
        a.setMarca(entrada.nextLine());
        System.out.println("Ingrese el color :");
        a.setColor(entrada.nextLine());
        System.out.println("Ingrese los litros de bencina :");

        a.setBencina(Integer.parseInt(entrada.nextLine()));

        listaVehiculos.add(a);

        System.out.println("Vehiculo creado :");
        System.out.println("Patente :" + a.getPatente());
        System.out.println("Marca : "+ a.getMarca());
        System.out.println("Color : "+ a.getColor());
        System.out.println("Litros de Bencina : "+ a.getBencian());

    }

    public void listadoVehiculos(ArrayList<Vehiculo> listaVehiculos){
        for (int i = 0; i < listaVehiculos.size(); i++) {

            System.out.println("*********************************************");
            System.out.println("Auto: " + (i+1));
            Vehiculo auto = listaVehiculos.get(i);

            System.out.println("Patente :" + auto.getPatente());
            System.out.println("Marca :" + auto.getMarca());
            System.out.println("Color :" + auto.getColor());
            System.out.println("Litros Bencina :" + auto.getBencian());
        }
    }

    public void eliminacionVehiculo(Scanner entrada, ArrayList<Vehiculo> listaVehiculos){
        System.out.println("Ingrese la patente del vehiculo a eliminar ");

        String patente = entrada.nextLine();

        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo auto = listaVehiculos.get(i);

            if (patente.equals(auto.getPatente())){
                listaVehiculos.remove(i);
                System.out.println("Vehiculo fue eliminado");
            }
        }
    }

    public void modificarVehiculo(Scanner entrada, ArrayList<Vehiculo> listaVehiculos){
        System.out.println("Ingrese la patente del vehiculo a modificar ");

        String patente = entrada.nextLine();

        for (Vehiculo auto : listaVehiculos) {
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

    }

}
