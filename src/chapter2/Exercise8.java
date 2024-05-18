package chapter2;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
/*Write an application that inputs one number consist￾ing of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();
        int first_digit = number / 10000;
        int second_digit = (number % 10000) / 1000 ;
        int third_digit = (number % 1000) / 100;
        int fourth_digit = (number % 100) / 10;
        int fifth_digit = (number % 10);
        System.out.printf("%d   %d   %d   %d   %d%n", first_digit, second_digit, third_digit, fourth_digit, fifth_digit);
    }
}
