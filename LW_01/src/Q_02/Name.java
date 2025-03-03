import javax.swing.*;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        scanner.close();

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame(fullName);


            frame.setSize(400, 300);


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            frame.setVisible(true);
        });
    }
}
