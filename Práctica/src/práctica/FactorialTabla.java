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
        
    public String tablaMultiplicar(int tabla){
        int contador = 1;
        int resultado;
        String resultadoTabla = "";
        
        while (contador <= 10){
            resultado = tabla * contador;
           resultadoTabla = resultadoTabla + tabla + "X" + contador + "=" + resultado +"\n";
            contador ++;
        
        }
        return resultadoTabla;
    }
    
}
