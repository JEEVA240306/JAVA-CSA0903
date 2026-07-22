import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        char[] ch = word.toCharArray();
        Arrays.sort(ch);

        System.out.print("Reverse Alphabetical Order: ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}