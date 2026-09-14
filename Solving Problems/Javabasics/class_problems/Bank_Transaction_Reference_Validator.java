package _02_JavaBasics.practice_problems;

import java.util.Scanner;

public class Bank_Transaction_Reference_Validator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String raw = sc.nextLine();

        // Remove leading and trailing spaces
        String reference = raw.trim();

        // Check length
        if (reference.length() != 14) {

            System.out.println("Invalid: wrong length");

        } else {

            // Convert first 3 characters to uppercase
            String bankCode =
                    reference.substring(0, 3).toUpperCase();

            // Keep remaining characters unchanged
            reference =
                    bankCode + reference.substring(3);

            boolean validBankCode = true;
            boolean validBody = true;

            // Check first 3 characters are letters
            for (int i = 0; i < 3; i++) {

                if (!Character.isLetter(reference.charAt(i))) {
                    validBankCode = false;
                    break;
                }
            }

            // Check remaining 11 characters are digits
            for (int i = 3; i < 14; i++) {

                if (!Character.isDigit(reference.charAt(i))) {
                    validBody = false;
                    break;
                }
            }

            if (!validBankCode) {

                System.out.println(
                        "Invalid: bank code must be 3 letters"
                );

            } else if (!validBody) {

                System.out.println(
                        "Invalid: body must contain only digits"
                );

            } else {

                String date = reference.substring(3, 9);
                String sequence = reference.substring(9, 14);

                StringBuilder result = new StringBuilder();

                result.append("[");
                result.append(reference.substring(0, 3));
                result.append("] DATE: ");

                // ddMMyy → dd/MM/yy
                result.append(date.substring(0, 2));
                result.append("/");
                result.append(date.substring(2, 4));
                result.append("/");
                result.append(date.substring(4, 6));

                result.append(" | SEQ: ");
                result.append(sequence);

                System.out.println(result);
            }
        }

        sc.close();
    }
}