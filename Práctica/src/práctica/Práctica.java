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
        System.out.println("5. Dia laboral 2");
        accion = escaner.nextInt();
        FactorialTabla Calculo = new FactorialTabla();
        ParesImparesSwitch Calculo2 = new ParesImparesSwitch();
        
        
        switch(accion){
            case 1:
                int numero = 0;
                 System.out.println(Calculo.factorial(numero));
                 break;
                 
            case 2:
                int tabla;
                System.out.println("Ingrese el numero del que desee conocer su tabla");
                tabla = escaner.nextInt();
                System.out.println("********");
                System.out.println(Calculo.tablaMultiplicar(tabla));
                System.out.println("********");
                break;
            
            case 3:
                numero = 0;
                System.out.println(Calculo2.imparesPares(numero));
                break;
            
            case 4:
                String dia = "";
                System.out.println(Calculo2.diaLaboral(dia));
                break;
            
            case 5:
                int laboral = 0;
                System.out.println(Calculo2.diaLaboral2(laboral));
        }
        
    }
    
}
