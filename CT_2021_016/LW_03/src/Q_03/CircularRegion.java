package Q_03;

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the inner circle (ri): ");
        double innerRadius = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double outerRadius = scanner.nextDouble();

        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();
        double ringArea = outerArea - innerArea;

        System.out.printf("\nResults:");
        System.out.printf("\n Inner circle radius: %.2f" ,innerRadius);
        System.out.printf("\n Inner circle area: %.2f " ,innerArea);
        System.out.printf("\n Outer circle radius: %.2f" ,outerRadius);
        System.out.printf("\n Outer circle area: %.2f" , outerArea);
        System.out.printf("\n Area of the circular region (ring): %.2f " , ringArea);
        System.out.printf("\n Inner circle circumference: %.2f " , innerCircle.computeCircumference());
        System.out.printf("\n Outer circle circumference: %.2f" ,outerCircle.computeCircumference());

        scanner.close();
    }
}