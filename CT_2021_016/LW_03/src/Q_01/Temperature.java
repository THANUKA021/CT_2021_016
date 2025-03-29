package Q_01;

import java.util.Scanner;

class Temperature1{
    private double celsius;

    public Temperature1() {
        this.celsius = 0.0;
    }

    public Temperature1(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

public class Temperature{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Temperature1 temp = new Temperature1(celsiusInput);

        System.out.println("Equivalent temperature in Fahrenheit: " + temp.toFahrenheit());

        scanner.close();
    }
}