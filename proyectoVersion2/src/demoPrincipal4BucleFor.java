import java.util.Scanner;

public class demoPrincipal4BucleFor {

    //MOSTRAR POR PANTALLA CUANTOS MULTIPLOS DE 4 EXISTEN ENTRE EL 10 Y EL 70.

    public static void main(String argumento[]){

        int i;

        int cont = 0;

        for (int j = 10; j <= 70 ; j++) {
            if (j%4 ==0){  // 10/4 = 4*2 + 2
                System.out.println(j);
                cont++;
            }
        }

        System.out.println("Cantidad de numeros entre el 10 y 70 multiplos de 4 : " + cont);

    }
}
