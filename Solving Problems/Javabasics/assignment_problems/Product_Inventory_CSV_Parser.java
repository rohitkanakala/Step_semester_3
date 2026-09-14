package _02_JavaBasics.assignment_problems;

import java.util.Scanner;

public class Library_Validator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String raw = sc.nextLine();

        String code = raw.trim();

        // Check length before using substring
        if (code.length() != 13) {
            System.out.println("Invalid: wrong length");
        } else {

            // Convert first 3 characters to uppercase
            String publisher = code.substring(0, 3).toUpperCase();

            // Keep remaining characters unchanged
            code = publisher + code.substring(3);

            boolean validPublisher = true;
            boolean validBody = true;

            // Check first 3 characters are letters
            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(code.charAt(i))) {
                    validPublisher = false;
                    break;
                }
            }

            // Check remaining 10 characters are digits
            for (int i = 3; i < 13; i++) {
                if (!Character.isDigit(code.charAt(i))) {
                    validBody = false;
                    break;
                }
            }

            if (!validPublisher) {
                System.out.println(
                        "Invalid: publisher code must be 3 letters"
                );
            } else if (!validBody) {
                System.out.println(
                        "Invalid: body must contain only digits"
                );
            } else {

                String year = code.substring(3, 7);
                String catalog = code.substring(7, 13);

                StringBuilder result = new StringBuilder();

                result.append("[");
                result.append(code.substring(0, 3));
                result.append("] YEAR: ");
                result.append(year);
                result.append(" | CATALOG: ");
                result.append(catalog);

                System.out.println(result);
            }
        }

        sc.close();
    }
}