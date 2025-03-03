import java.util.Scanner;

public class String_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        int length = input.length();

        if (length > 0) {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(length - 1);

            System.out.println(length);
            System.out.println(firstChar);
            System.out.println(lastChar);
        } else {
            System.out.println("Error: Empty string entered.");
        }
    }
}
