package chapter2;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
    /*Write an application that inputs from the user the radius of a circle
as an integer and prints the circle’s diameter, circumference and area using the floating-point value
3.14159 for π */
        Scanner input = new Scanner(System.in);

        int r;
        double pi=3.1459;
        int diameter;
        double circumference;
        double area;

        System.out.print("Enter the radius: ");
        r=input.nextInt();

        diameter=2*r;
        System.out.printf("The diameter of the circle is %d%n", diameter);

        circumference=2*pi*r;
        System.out.printf("The circumference of the circle is %s%n", circumference);

        area=pi*r*r;
        System.out.printf("The area of the circle is %s%n", area);
    }
}
