
package práctica;

import java.util.Scanner;

public class ParesImparesSwitch {
    public int imparesPares(int numero){
        int contadorGeneral = 1;
        int contadorPar = 1;
        int contadorImpar = 1;
        Scanner escaner = new Scanner(System.in);
        while (contadorGeneral <= 10){
            System.out.println("Ingrese un numero");
            numero = escaner.nextInt();
            contadorGeneral ++;
            if (numero % 2 == 0){
                contadorPar++; 
            }
            else {
                contadorImpar++;
            }
            
        }
        return 0;
    }
}
