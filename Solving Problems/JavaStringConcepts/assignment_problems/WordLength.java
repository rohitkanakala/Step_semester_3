package _01_JavaFoundation.assignment_problems;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {

            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println(
                "Short: " + shortWords +
                        " | Medium: " + mediumWords +
                        " | Long: " + longWords
        );

        sc.close();
    }
}