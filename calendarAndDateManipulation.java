
import java.util.Calendar;
// will turn it into a functional agenda format
public class calendarAndDateManipulation {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("The current date is : " + calendar.getTime());
        calendar.add(Calendar.DATE, -28);
        System.out.println("28 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 7);
        System.out.println("5 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 3);
        System.out.println("3 years later: " + calendar.getTime());
    }
}
