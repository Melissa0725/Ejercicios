package periodo2clase191;
import javax.swing.JOptionPane;
public class Periodo2clase191 {
    public static void main(String[] args) {
        String daysLeft = "";
        String weekDay = JOptionPane.showInputDialog("Ingresar el día de la semana (en inglés)");
        switch (weekDay.toUpperCase()) {
            case "SUNDAY":
                daysLeft = daysLeft + "Sunday";
            case "MONDAY":
                daysLeft = daysLeft + "Monday";
            case "TUESDAY":
                daysLeft = daysLeft + "Tuesday";
            case "WEDNESDAY":
                daysLeft = daysLeft + "Wednesday";
            case "THURSDAY":
                daysLeft = daysLeft + "Thursday";
            case "FRIDAY":
                daysLeft = daysLeft + "Friday";
            case "SATURDAY":
                daysLeft = daysLeft + "Saturday";
        }
       JOptionPane.showInputDialog(null, "Quedan \"" + daysLeft + "\" para terminar la semana");
    }
    
}
