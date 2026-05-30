import java.util.Scanner;

public class TrapeziumArea {

    // Parameterized method to calculate area
    public static double calculateArea(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of first parallel side: ");
        double a = sc.nextDouble();

        System.out.print("Enter length of second parallel side: ");
        double b = sc.nextDouble();

        System.out.print("Enter height of trapezium: ");
        double h = sc.nextDouble();

        double area = calculateArea(a, b, h);

        System.out.println("Area of Trapezium = " + area);

        sc.close();
    }
}