package Chapter3;
import java.util.Scanner;
public class DateTest {
    public static void main(String[] args){
        int month;
        int day;
        int year;
        int displayDate;

        Scanner input = new Scanner (System.in);
        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println("Date 1");
        System.out.print("Enter month: ");
        month = input.nextInt();

        System.out.print("Enter day: ");
        day = input.nextInt();

        System.out.print("Enter year: ");
        year = input.nextInt();

        //set the data
        date1.setMonth(month);
        date1.setDay(day);
        date1.setYear(year);

        System.out.println("Date 2");
        System.out.print("Enter month: ");
        month = input.nextInt();

        System.out.print("Enter day: ");
        day = input.nextInt();

        System.out.print("Enter year: ");
        year = input.nextInt();

        //set the data
        date2.setMonth(month);
        date2.setDay(day);
        date2.setYear(year);

        //display date1 information
        System.out.println("Date 1 Information");
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println("Year: " + date1.getYear());
        System.out.printf("Today's Date is: " + date1.getDisplayDate());

        System.out.println("........................");
        System.out.println("Date 2 Information");
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
        System.out.println("Year: " + date2.getYear());
        System.out.printf("Today's date is: " + date2.getDisplayDate());
    }
}
