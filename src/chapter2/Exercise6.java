package chapter2;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
        /*Write an application that reads two integers, determines whether the first is a
        multiple of the second and prints the result */

        Scanner input = new Scanner (System.in);
        int x;
        int y;

        System.out.print("Enter first integer: ");
        x = input.nextInt();
        System.out.print("Enter second integer: ");
        y = input.nextInt();

        if (x%y==0){
        System.out.printf("%d is a multiple of %d%n", x,y);
        }
        if (x%y!=0){
            System.out.printf("%d is not a multiple of %d%n", x, y);
        }



    }
}
