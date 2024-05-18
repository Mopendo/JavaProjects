package chapter2;
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args){
/*Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you pre￾fer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
body mass index */
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double BMI;

        System.out.print("Enter your weight in kilograms: ");
        weight = input.nextDouble();
        System.out.print ("Enter your height in metres: ");
        height = input.nextDouble();

        BMI = (weight/(height*height));
        System.out.printf("Your BMI:" + BMI);

        if (BMI < 18.5) {
            System.out.printf(" - Underweight");
        }
        if (BMI >= 18.5 && BMI <= 24.9){
            System.out.printf(" - Normal");
        }
        if (BMI >= 25 && BMI <= 29.9){
            System.out.printf(" - Overweight");
        }
        if (BMI >= 30) {
            System.out.printf(" - Obese");
        }
    }
}
