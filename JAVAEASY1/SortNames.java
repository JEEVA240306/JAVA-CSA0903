import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.print("Order (A/D): ");
        char ch = sc.next().charAt(0);

        Arrays.sort(names);

        if (ch == 'A' || ch == 'a') {
            for (String s : names)
                System.out.println(s);
        } else {
            for (int i = names.length - 1; i >= 0; i--)
                System.out.println(names[i]);
        }
    }
}