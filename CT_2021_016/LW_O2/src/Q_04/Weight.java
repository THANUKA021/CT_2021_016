package Q_04;

import java.util.Scanner;
public class Weight {
    public static void main(String[] args){

        Scanner y = new Scanner(System.in);

        System.out.print("Enter weight in pound:");
        double weight= y.nextDouble();

        double calories = weight * 19;

        System.out.print("you need " + String.format("%.0f", calories) + " calories per day");

        y.close();
    }
}
