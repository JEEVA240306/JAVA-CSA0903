import java.util.Scanner;

public class EvenIndexFibSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int terms = 2 * n + 1;

        int a = 0, b = 1;
        int sum = 0;

        for (int i = 0; i < terms; i++) {
            if (i % 2 == 0)
                sum += a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Sum = " + sum);
    }
}