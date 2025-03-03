import javax.swing.*;
import java.util.Scanner;

public class Frame_window {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the frame: ");
        String title = scanner.nextLine();

        System.out.print("Enter the width of the frame (W): ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the frame (H): ");
        int height = scanner.nextInt();

        scanner.close();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
