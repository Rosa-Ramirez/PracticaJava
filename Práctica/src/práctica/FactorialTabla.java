
package práctica;
        
public class FactorialTabla {
    public long factorial(long numero){
        int factorial = 1;
        long contadorFactorial = 1;
        int i = 1;
        while (i <= factorial){
            contadorFactorial = contadorFactorial*i;
            i++;
        }
        return contadorFactorial;
    }
    public double tablaMultiplicar(double tabla){
        int contador = 1;
        double resultado;
        while (contador <= 10){
            resultado = tabla * contador;
            System.out.println(tabla * contador+"="+resultado);
            contador ++;
         
        }
        return 0;
    }
    
}
