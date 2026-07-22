import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int start = Math.min(A, B);
        int end = Math.max(A, B);

        for (int i = start; i <= end; i++) {
            if (i > 3) {
                boolean composite = false;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        composite = true;
                        break;
                    }
                }

                if (composite) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}