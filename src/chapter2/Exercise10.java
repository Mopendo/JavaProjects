package chapter2;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args){
/*write an application that calculates the squares and cubes of the numbers from 0 to 10*/

        Scanner input = new Scanner (System.in);
        int zero;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        int number7;
        int number8;
        int number9;
        int number10;

        System.out.print("Enter zero: ");
        zero = input.nextInt();
        System.out.print("Enter number1: ");
        number1 = input.nextInt();
        System.out.print("Enter number2: ");
        number2 = input.nextInt();
        System.out.print("Enter number3: ");
        number3 = input.nextInt();
        System.out.print("Enter number4: ");
        number4 = input.nextInt();
        System.out.print("Enter number5: ");
        number5 = input.nextInt();
        System.out.print("Enter number6: ");
        number6 = input.nextInt();
        System.out.print("Enter number7: ");
        number7 = input.nextInt();
        System.out.print("Enter number8: ");
        number8 = input.nextInt();
        System.out.print("Enter number9: ");
        number9 = input.nextInt();
        System.out.print("Enter number10: ");
        number10 = input.nextInt();


        System.out.println("Number  Square    Cube");

        System.out.println(zero+"         "+zero*zero+"         "+zero*zero*zero);
        System.out.println(number1+"         "+number1*number1+"         "+number1*number1*number1);
        System.out.println(number2+"         "+number2*number2+"         "+number2*number2*number2);
        System.out.println(number3+"         "+number3*number3+"         "+number3*number3*number3);
        System.out.println(number4+"         "+number4*number4+"        "+number4*number4*number4);
        System.out.println(number5+"         "+number5*number5+"        "+number5*number5*number5);
        System.out.println(number6+"         "+number6*number6+"        "+number6*number6*number6);
        System.out.println(number7+"         "+number7*number7+"        "+number7*number7*number7);
        System.out.println(number8+"         "+number8*number8+"        "+number8*number8*number8);
        System.out.println(number9+"         "+number9*number9+"        "+number9*number9*number9);
        System.out.println(number10+"        "+number10*number10+"       "+number10*number10*number10);

        }
}
