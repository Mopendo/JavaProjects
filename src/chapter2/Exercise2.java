package chapter2;


    import java.util.Scanner;
    public class Exercise2 {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            int x;
            int y;

            System.out.print("Enter first integer: ");
            x = in.nextInt();
            System.out.print("Enter second integer: ");
            y = in.nextInt();

            System.out.printf("Sum of two integers: %d%n", x + y);
            System.out.printf("Difference of two integers: %d%n", x - y);
            System.out.printf("Product of two integers: %d%n", x * y);
            System.out.printf("Division of two integers: %d%n", x / y);

        }
    }

