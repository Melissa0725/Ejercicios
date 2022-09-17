package periodo2clase13;
public class Periodo2Clase13 {
   public static void main(String[] args) {
       String tipoDia = "";
       String diaSemana = "Lunes";
       
       switch (diaSemana.toLowerCase()) {
           case "lunes":
               tipoDia = "Inicio de semana";
               break;
           case "martes":
           case "miércoles":
           case "jueves":
               tipoDia = "Mediados de semana";
               break;
           case "viernes":
               tipoDia = "Inicio de fin de semana";
               break;
           case "sábado":
           case "domingo":
               tipoDia = "Fin de semana";
               break;
       }
       
       System.out.println(diaSemana + " es " + tipoDia);
       
    }
    
}
