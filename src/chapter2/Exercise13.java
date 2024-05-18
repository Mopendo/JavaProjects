package chapter2;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args){
/*Write an application that inputs current world population and the annual world population growth rate values,
then displays the estimated world population after one, two, three, four and five years */
        Scanner input = new Scanner(System.in);

        double population = 8.100000000;
        double growth_rate;
        double Result;

        System.out.println("Enter the growth_rate in percentage: ");
        growth_rate = input.nextDouble()/100;

        Result = population * growth_rate * 1;
        System.out.printf("The estimated world population after a year is %s%n", Result);

        Result = population * growth_rate * 2;
        System.out.printf("The estimated world population after two years is %s%n", Result);

        Result = population * growth_rate * 3;
        System.out.printf("The estimated world population after three years is %s%n", Result);

        Result = population * growth_rate * 4;
        System.out.printf("The estimated world population after four years is %s%n", Result);

        Result = population * growth_rate * 5;
        System.out.printf("The estimated world population after five years is %s%n", Result);
    }
}
