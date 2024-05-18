package chapter2;

import java.util.Scanner;

public class Exercise4 {
    /*Write an application that inputs three integers from the
    user and displays the sum, average, product, smallest and largest of the numbers*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.print("Enter first integer: ");
        x = input.nextInt();
        System.out.print("Enter second integer: ");
        y = input.nextInt();
        System.out.print("Enter third integer:");
        z = input.nextInt();

        System.out.printf("Sum of three integers: %d%n", x + y + z);
        System.out.printf("Product of three integers: %d%n", x * y * z);
        System.out.printf("Average of three integers: %d%n", (x + y + z) / 3);

        if (x > y && x > z) {
            System.out.printf("%d is the largest number", x);
        }
        if (y > x && y > z) {
            System.out.printf("%d is the largest number", y);
        }
        if (z > x && z > y) {
            System.out.printf("%d is the largest number", z);
        }

        if (x < y && x < z) {
            System.out.printf("%n%d is the smallest number", x);
        }
        if (y < x && y <z) {
            System.out.printf("%n%d is the smallest number", y);
        }
        if (z < x && z < y) {
            System.out.printf("%n%d is the smallest number", z);
        }
    }
}