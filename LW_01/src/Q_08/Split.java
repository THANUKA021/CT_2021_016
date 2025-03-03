import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing a single exclamation mark (!): ");
        String input = scanner.nextLine();

        scanner.close();

        int index = input.indexOf('!');

        if (index == -1 || input.indexOf('!', index + 1) != -1) {
            System.out.println("Error: The input must contain exactly one exclamation mark.");
            return;
        }

        String before = input.substring(0, index).trim();
        String after = input.substring(index + 1).trim();

        System.out.println(before);
        System.out.println(after);
    }
}
