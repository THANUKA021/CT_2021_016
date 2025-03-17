package Q_06;


import java.util.Calendar;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = x.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + Math.abs(age) + " this year.");

        x.close();
    }
}