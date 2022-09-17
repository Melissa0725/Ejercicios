package suma;
import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        int numero1; //Declaración de variable, primer número a sumar.
        int numero2; //Declaración de variable, segundo número a sumar.
        int suma; //Declaración de variable, suma de numero1 y numero2.
        
        System.out.print("Escriba el primer entero: "); //indicador.
        numero1 = entrada.nextInt(); //lee el primer número del uasuario.
        
        System.out.print("Escriba el segundo entero: "); //indicador.
        numero2 = entrada.nextInt(); //lee el segundo número del usuario.
        
        suma = numero1 + numero2; //suma de los números, después almacena el total en suma.
         System.out.println("La suma es: " + suma); //muestra la suma.
    }
    
}
