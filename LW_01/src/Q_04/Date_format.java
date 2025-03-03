import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_format {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");

        String formattedDate = today.format(formatter);

        System.out.println("Today's Date: " + formattedDate);
    }
}
