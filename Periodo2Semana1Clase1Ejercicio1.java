package estructuraswitch;
import java.util.Scanner;
public class EstructuraSwitch {
   public static void main(String[] args) {
     Scanner ingresar = new Scanner(System.in);
     int num1, num2, resultado, opcion;
     System.out.println("Ingrese el primer número: ");
     num1 = ingresar.nextInt();
     System.out.println("Ingrese el segundo número: ");
     num2 = ingresar.nextInt();
     System.out.println(" +++++ Menú de opciones +++++");
     System.out.println(" Para sumar los dos números digite 1");
     System.out.println(" Para restar los dos números digite 2");
     System.out.println(" Para elevarlos al cuadrado digite 3");
     System.out.println(" Para multiplicarlos digite 4");
     opcion = ingresar.nextInt();
     
     switch (opcion) {
         case 1: {
             resultado = num1 + num2;
             System.out.println("El resultado de la suma es: "+ resultado);
             break;
            }
         case 2: {
             resultado = num1 - num2;
             System.out.println("El resultado de la resta es: "+ resultado);
             break;
            }
         case 3: {
             System.out.println("El resultado de elevarlo al cuadrado"+ num1 + "es: "+ Math.pow(num1,2));
             System.out.println("El resultado de elevarlo al cuadrado"+ num2 + "es: "+ Math.pow(num2,2));
             break;
            }
         case 4: {
             resultado = num1 * num2;
             System.out.println("El resultado de la multiplicación es: "+ resultado);
             break;
            }
         default: {
             System.out.println("Seleccione una opción correcta.");
             break;
         }
     }
     
    }
    
}
