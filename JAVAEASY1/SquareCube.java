import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        System.out.println("Square Number: " + (n * n));
        System.out.println("Cube Number: " + (n * n * n));
    }
}