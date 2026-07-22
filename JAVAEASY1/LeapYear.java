import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.next(); // Example: 04/11/1947

        String[] parts = date.split("/");

        if (parts.length != 3) {
            System.out.println("Invalid Date");
            return;
        }

        int year = Integer.parseInt(parts[2]);

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }
}