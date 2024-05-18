package chapter2;

import java.util.Scanner;

public class meaning {
    public static void main(String[] args){
        /*Write an application that reads five integers and determines
and prints the largest and smallest integers in the group*/
       Scanner input = new Scanner(System.in);

            int a;
            int b;
            int c;
            int d;
            int e;

            System.out.print("Enter first integer:");
            a = input.nextInt();
            System.out.print("Enter second integer:");
            b = input.nextInt();
            System.out.print("Enter third integer:");
            c = input.nextInt();
            System.out.print("Enter fourth integer:");
            d = input.nextInt();
            System.out.print("Enter fifth integer:");
            e = input.nextInt();

            if (a > b && a > c && a > d && a > e) {
                System.out.printf("%d is the largest number", a);
            }
            if (b > a && b > c && b > d && b > e) {
                System.out.printf("%d is the largest number", b);
            }
            if (c > a && c > b && c > d && c > e) {
                System.out.printf("%d is the largest number", c);
            }
            if (d > a && d > b && d > c && d > e) {
                System.out.printf("%d is the largest number", d);
            }
            if (e > a && e > b && e > c && e > d) {
                System.out.printf("%d is the largest number", e);
            }

            if (a < b && a < c && a < d && a < e) {
            System.out.printf("%d is the smallest number", a);
            }
            if (b < a && b < c && b < d && b < e) {
            System.out.printf("%d is the smallest number", b);
            }
            if (c < a && c < b && c < d && c < e) {
            System.out.printf("%d is the smallest number", c);
            }
            if (d < a && d < b && d < c && d < e) {
            System.out.printf("%d is the smallest number", d);
            }
            if (e < a && e < b && e < c && e < d) {
            System.out.printf("%d is the smallest number", e);
            }
    }
}
