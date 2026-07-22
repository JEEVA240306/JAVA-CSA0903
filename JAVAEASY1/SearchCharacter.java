import java.util.Scanner;

public class SearchCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(ch + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Character not found");
    }
}