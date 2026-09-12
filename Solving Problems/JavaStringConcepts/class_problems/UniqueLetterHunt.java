import java.util.*;

public class UniqueLetterHunt {

    static char findFirstNonRepeatingChar(String text) {

        int[] frequency = new int[256];

        for (char ch : text.toCharArray()) {
            frequency[ch]++;
        }

        for (char ch : text.toCharArray()) {
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println(
                    "First Non-Repeating Character: '" + result + "'"
            );
        }

        sc.close();
    }
}