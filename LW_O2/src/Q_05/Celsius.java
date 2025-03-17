package Q_05;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenhite:");
        double temp= x.nextDouble();

        double cel=(5.0/9) * (temp-32);

        System.out.print(String.format("%.2f",temp ) + " Fahrenhite is equal to " + String.format("%.2f", cel) + " Celsius");

        x.close();
    }
}
