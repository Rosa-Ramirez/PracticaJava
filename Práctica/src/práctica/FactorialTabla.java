package práctica;

import java.util.Scanner;

public class FactorialTabla {
    public int factorial(int numero){
        int factorial = 1;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese el número del que desee conocer su factorial");
        numero = escaner.nextInt();
        
        while (numero != 0){
            factorial = factorial * numero;
            numero = numero - 1;
        }
        
        return factorial;
    }
        
    public double tablaMultiplicar(double tabla){
        int contador = 1;
        double resultado;
        while (contador <= 10){
            resultado = tabla * contador;
            System.out.println(tabla + "*" + contador+"="+resultado);
            contador ++;
        
        }
        return 0;
    }
    
}
