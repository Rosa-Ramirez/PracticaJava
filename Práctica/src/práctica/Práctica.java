package práctica;
import java.util.Scanner;
public class Práctica {

    public static void main(String[] args) {
        System.out.println("Práctica");
        System.out.println("Digite el numero de la funcion que desea realizar");
        int accion;
        Scanner escaner = new Scanner (System.in);
        System.out.println("1. Factorial");
        System.out.println("2. Tabla de multiplicar");
        System.out.println("3. Numeros pares e impares");
        System.out.println("4. Dia laboral");
        accion = escaner.nextInt();
        FactorialTabla Calculo = new FactorialTabla();
        ParesImparesSwitch Calculo2 = new ParesImparesSwitch();
        switch(accion){
            case 1:
                int numero;
                System.out.println("Ingrese el número del que desee conocer su factorial");
                numero = escaner.nextInt();
                 System.out.println(Calculo.factorial(numero));

                 
            case 2:
                System.out.println("Ingrese el numero del que desee conocer su tabla");
                numero = escaner.nextInt();
                System.out.println(Calculo.tablaMultiplicar(numero));
            
            case 3:
                numero = 0;
                System.out.println(Calculo2.imparesPares(numero));
                
        }
        
    }
    
}
