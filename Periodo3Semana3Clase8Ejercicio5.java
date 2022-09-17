package periodo3clase8;
import java.util.Scanner;
public class Periodo3clase8 {
    public static void main(String[] args) {
      Scanner Reader = new Scanner (System.in);
      String quieroJugar = "sí";
      while (quieroJugar.equals("sí")) {
          System.out.println("¿Quieres seguir jugando?");
          quieroJugar = Reader.next();
      }
    }
    
}
