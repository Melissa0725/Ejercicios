package clase15ejercicio1;
import java.util.Scanner;
public class Clase15Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la base: ");
        double base = entrada.nextDouble();
        System.out.println("Ingrese el exponente: ");
        double exponente = entrada.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: "+ resultado);
    }
    
}
