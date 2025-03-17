package Q_03;

import java.util.Scanner;
public class Fahrenheit {

    public static void main (String[] arg){
        Scanner x =new Scanner(System.in);

        System.out.print("Enter the temperature in celsius:");
        double cel = x.nextDouble();

        double far = (1.8 * cel) + 32;

        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit", cel, far);

        x.close();
    }


}
