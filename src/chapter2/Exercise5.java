package chapter2;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        //Write an application that reads an integer and determines and prints wheth￾er it’s odd or even
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter an integer: ");
        num = input.nextInt();

        // if remainder is 0 after dividing by 2, the number is an even number
        if (num % 2 == 0)
            System.out.printf("%d is an even number", num);	// display the integer as even number

        // if remainder is not zero after dividing by 2, the number is an odd number
        if (num % 2 != 0)
            System.out.printf("%d is an odd number", num);	// display the integer as odd number
    }
}
