package clase11;
import java.util.Scanner;
public class Clase11 {

     public static void main(String[] args) {
         Scanner Entrada = new Scanner(System.in);
         float nota1, nota2, nota3, promedio;
         
         System.out.println("Ingrese la primera nota:");
         nota1 = Entrada.nextFloat();
         System.out.println("Ingrese la segunda nota:");
         nota2 = Entrada.nextFloat();
         System.out.println("Ingrese la tercera nota:");
         nota3 = Entrada.nextFloat();
         promedio = (nota1 + nota2 + nota3) / 3;
         System.out.println("El promedio es:" + promedio);
         if (promedio >= 7); {
            System.out.println("Promocionado");
        } if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
                  
        }
       
    }
    
}
