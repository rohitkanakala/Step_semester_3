package _01_JavaFoundation.assignment_problems;

import java.util.Scanner;

public class SignalStreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signal = sc.nextLine();

        if (signal.length() == 0) {
            System.out.println("Signal log is empty.");
        } else {

            char current = signal.charAt(0);
            char longest = current;

            int currentCount = 1;
            int longestCount = 1;

            for (int i = 1; i < signal.length(); i++) {

                if (signal.charAt(i) == current) {
                    currentCount++;
                } else {
                    current = signal.charAt(i);
                    currentCount = 1;
                }

                if (currentCount > longestCount) {
                    longestCount = currentCount;
                    longest = current;
                }
            }

            System.out.println(
                    "Longest Streak: '" + longest +
                            "' repeated " + longestCount + " times"
            );
        }

        sc.close();
    }
}