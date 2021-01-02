package temasJava;

import java.util.ArrayList;

public class arrays {

    public static void main(String argumento[]){

        int [] cifraNegocios;

        cifraNegocios = new int[4];

        cifraNegocios[0] = 100;

        System.out.println(cifraNegocios[0]);

        int [] cifrasDeclaradas = {1,2,3,4,5,6,7};

        System.out.println(cifrasDeclaradas[6]);

        ArrayList<Integer> cifras = new ArrayList<Integer>();

        cifras.add(2);
        cifras.add(9);
        cifras.add(34);

        System.out.println(cifras.size());


    }
}
