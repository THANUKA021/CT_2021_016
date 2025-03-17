package Q_09;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        double p = x.nextDouble();

        System.out.print("Enter the interest rate in percentage: ");
        double rate = x.nextDouble();

        double rateDecimal = rate / 100;

        System.out.print("Enter the number of years : ");
        int years = x.nextInt();

        double futureValue = p * Math.pow(1 + rate, years);

        System.out.printf("The future value of your investment after %d years is: %.2f%n", years, futureValue);

        x.close();
    }
}