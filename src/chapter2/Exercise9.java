package chapter2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        /*write an application that dis￾plays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.
Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character */
        Scanner input = new Scanner(System.in);
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
        System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
        System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
        System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
        System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
    }
}
