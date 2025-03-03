import java.util.Scanner;

public class Middle_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String input = scanner.nextLine();

        scanner.close();

        int length = input.length();

        if (length % 2 == 1) {
            int middleIndex = length / 2;
            char middleChar = input.charAt(middleIndex);

            System.out.println("Middle character: " + middleChar);
        } else {
            System.out.println("Error: The word must have an odd number of characters.");
        }
    }
}
