import java.util.Scanner;

public class ReverseBinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        String reversed = new StringBuilder(binary).reverse().toString();

        int result = Integer.parseInt(reversed, 2);

        System.out.println(result);
    }
}