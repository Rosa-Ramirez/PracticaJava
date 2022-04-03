package práctica;
import java.util.Scanner;

public class ParesImparesSwitch {
    public int imparesPares(int numero){
        int contadorGeneral = 1;
        int contadorPar = 0;
        int contadorImpar = 0;
        int sumaPares = 0;
        int sumaGeneral = 0;
        int sumaImpares = 0;
        double promedioImpares = 0;
        
        Scanner escaner = new Scanner(System.in);
        
        while (contadorGeneral <= 10){
            System.out.println("Ingrese un numero");
            numero = escaner.nextInt();
            contadorGeneral ++;
            sumaGeneral = sumaGeneral + numero;
            
            if (numero % 2 == 0){
                contadorPar++;
                sumaPares = sumaPares + numero;
            }
            else {
                contadorImpar++;
                sumaImpares = sumaImpares + numero;
            }
        }
        System.out.println("La suma de todos los numeros es: " + sumaGeneral);
        System.out.println("El total de numeros pares es: " + contadorPar);
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
        
        System.out.println("El total de numeros impares es: " + contadorImpar);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
        promedioImpares = sumaImpares / contadorImpar;
        System.out.println("El promedio de los numeros impares es: " + promedioImpares);
        
        return 0;
    }
    
    public String diaLaboral(String dia){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana (por favor, escríbalo en minusculas, sin tildacion)");
        dia = escaner.nextLine();
        
        switch(dia){
            case "lunes":
                System.out.println("Es un día laboral.");
                break;
                
            case "martes":
                System.out.println("Es un día laboral.");
                break;
            
            case "miercoles":
                System.out.println("Es un día laboral.");
                break;
            
            case "jueves":
                System.out.println("Es un día laboral.");
                break;
             
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
                
            case "sabado":
                System.out.println("Puede ser un día laboral o no.");
                break;
                
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
        }
        return "Gracias";
    }
    public int diaLaboral2(int dia){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Digite el numero que corresponde al dia de la semana que desea seleccionar");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sábado");
        System.out.println("7. Domingo");
        dia = escaner.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Es un día laboral.");
                break;
                
            case 2:
                System.out.println("Es un día laboral.");
                break;
            
            case 3:
                System.out.println("Es un día laboral.");
                break;
            
            case 4:
                System.out.println("Es un día laboral.");
                break;
             
            case 5:
                System.out.println("Es un día laboral.");
                break;
                
            case 6:
                System.out.println("Puede ser un día laboral o no.");
                break;
                
            case 7:
                System.out.println("No es un día laboral.");
                break;
        }
        return 0;
    }  
}
