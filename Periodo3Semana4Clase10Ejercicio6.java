package periodo3clase10;
import java.util.Scanner;
public class Periodo3clase10 {
   public static void main(String[] args) {
      int fact=1, num, cont=1;
      Scanner entrada = new Scanner (System.in);
      System.out.println("Ingrese un número: ");
      num = entrada.nextInt();
      
      do {
          fact = fact*cont;
          cont = cont+1;
      } while (cont<=num);
      System.out.println("El factorial es: "+fact);
    }
    
}
