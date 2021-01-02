import java.util.Scanner;

public class demoPrincipal3BucleWhile {


    //MOSTRAR NUMEROS DEL 1 AL 100 y forzar una salida cuando llegue al 5

    public static void main(String argumento[]){

        int i = 1;

        while(i <= 100){
            System.out.println(i);
            if ( i == 5){
                break;
                //continue
            }
            i++;
        }

    }
}
