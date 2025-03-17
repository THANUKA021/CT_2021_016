package Q_07;

    import java.util.Scanner;

    public class bmi {
        public static void main(String[] args) {
            Scanner x= new Scanner(System.in);

            System.out.print("Enter your weight in kilograms: ");
            double weight = x.nextDouble();

            System.out.print("Enter your height in centimeters: ");
            double height = x.nextDouble();

            double bmi = weight / Math.pow(height / 100.0, 2);

            System.out.printf("Your BMI is: %.2f%n", bmi);

            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi >= 18.5 && bmi <= 25) {
                System.out.println("You have a normal weight.");
            } else {
                System.out.println("You are overweight.");
            }

            x.close();
        }
    }

