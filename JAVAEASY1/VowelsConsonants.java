import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        System.out.print("Consonants: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLetter(ch) &&
                !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
                System.out.print(ch + " ");
        }

        System.out.print("\nVowels: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
                System.out.print(ch + " ");
        }
    }
}