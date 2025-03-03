import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {
         LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ENGLISH);

        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
