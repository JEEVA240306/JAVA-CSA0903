import java.util.Scanner;

public class SimpleInterest {

    static double calculateSI(double p, int t, char senior) {
        double rate;

        if (senior == 'y' || senior == 'Y')
            rate = 12;
        else
            rate = 10;

        return (p * rate * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        System.out.print("Is customer senior citizen (y/n): ");
        char senior = sc.next().charAt(0);

        double interest = calculateSI(principal, years, senior);

        System.out.println("Interest: " + interest);
    }
}