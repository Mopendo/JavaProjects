package chapter2;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args){
/*Write a program that inputs five numbers and deter￾mines and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input. */
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        System.out.print("Enter third number: ");
        number3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        number4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        number5 = input.nextInt();

        if (number1 >= 0 ) {
            System.out.printf("%d is a positive number", number1);
        }
        if (number1 == 0) {
            System.out.printf("%d is zero", number1);
        }
        if (number1 <= 0) {
            System.out.printf("%d is a negative number", number1);
            }

        if (number2 >= 0) {
            System.out.printf("%n%d is a positive number", number2);
        }
        if (number2 == 0){
            System.out.printf("%n%d is zero", number2);
        }
        if (number2 <= 0){
            System.out.printf("%n%d is a negative number", number2);
        }

        if (number3 >= 0) {
            System.out.printf("%n%d is a positive number", number3);
        }
        if (number3 == 0){
            System.out.printf("%n%d is zero", number3);
        }
        if (number3 <= 0){
            System.out.printf("%n%d is a negative number", number3);
        }

        if (number4 >= 0) {
            System.out.printf("%n%d is a positive number", number4);
        }
        if (number4 == 0){
            System.out.printf("%n%d is zero", number4);
        }
        if (number4 <= 0){
            System.out.printf("%n%d is a negative number", number4);
        }

        if (number5 >= 0) {
            System.out.printf("%n%d is a positive number", number5);
        }
        if (number5 == 0){
            System.out.printf("%n%d is zero", number5);
        }
        if (number5 <= 0){
            System.out.printf("%n%d is a negative number", number5);
        }


    }
}
