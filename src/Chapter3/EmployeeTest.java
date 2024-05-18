package Chapter3;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args){
        String firstName;
        String lastName;
        double monthlySalary;

        Scanner input = new Scanner (System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //get details from first employee
        System.out.println("Employee 1");
        System.out.print("Enter first name:  ");
        firstName = input.nextLine();

        System.out.print("Enter last name:  ");
        lastName = input.nextLine();

        System.out.print("Enter monthly salary:  ");
        monthlySalary = input.nextDouble();

        //add employee 1 data
        employee1.setFirstName(firstName);
        employee1.setLastName(lastName);
        employee1.setMonthlySalary(monthlySalary);

        //get details from second employee
        System.out.println("Employee 2");
        System.out.print("Enter first name: ");
        input.nextLine();
        firstName = input.nextLine();

        System.out.print("Enter last name:  ");
        lastName = input.nextLine();

        System.out.print("Enter monthly salary: ");
        monthlySalary = input.nextDouble();

        //add employee 2 data
        employee2.setFirstName(firstName);
        employee2.setLastName(lastName);
        employee2.setMonthlySalary(monthlySalary);

        //display employee1 data
        System.out.println("............................");
        System.out.println ("Employee 1 information");
        System.out.println("First name: " + employee1.getFirstName());
        System.out.println("Last name: " + employee1.getLastName());
        System.out.println ("Monthly Salary: " + employee1.getMonthlySalary());
        System.out.println("Yearly salary: " + employee1.getYearlySalary());
        System.out.println("Yearly salary after 10% raise: " + employee1.getRaiseSalary());
        System.out.println("............................");

        //display employee2 data
        System.out.println("Employee 2 information");
        System.out.println("First name: " + employee2.getFirstName());
        System.out.println("Last name: " + employee2.getLastName());
        System.out.println("Monthly salary: " + employee2.getMonthlySalary());
        System.out.println("Yearly salary: " + employee2.getYearlySalary());
        System.out.println("Yearly salary after 10% raise: " + employee2.getRaiseSalary());
    }
}
