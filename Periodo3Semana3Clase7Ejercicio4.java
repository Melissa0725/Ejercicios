package periodo3clase72;
import java.util. Scanner;
public class Periodo3clase72 {
    public static void main(String[] args) {
      Scanner Reader = new Scanner (System.in);
      int contador;
      int fin;
      System.out.println("Por favor ingrese  el valor inicial (contador): ");
      contador = Reader.nextInt();
      System.out.println("Por favor ingrese el valor final (fin): ");
      fin = Reader.nextInt();
      while (contador <= fin) {
          System.out.println("Valor actual de iteración: "+contador);
          contador++;
      }
    }
    
}
