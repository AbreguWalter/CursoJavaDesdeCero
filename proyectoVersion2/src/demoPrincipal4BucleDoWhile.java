import java.util.Scanner;

public class demoPrincipal4BucleDoWhile {


    //Al ingresar los valores por teclado se deben acumular , tener en cuenta que sera hasta 300
    // y luego imprimir valores que son de 1 ,2,3 digitos y sumarlos.

    public static void main(String argumento[]){

        Scanner entrada = new Scanner(System.in);

        int valor;

        do{
            System.out.println("Ingresar un valor entre 0 a 300 con cero finalizas :");
            valor = entrada.nextInt();

            if (valor>=100){
                System.out.println("Tiene 3 digitos");
            }else{
                if (valor>=10){
                    System.out.println("Tiene 2 digitos");
                }else{
                    System.out.println("Tiene 1 digito");
                }
            }

        }while(valor!=0);

    }
}
