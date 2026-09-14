package _02_JavaBasics.practice_problems;

import java.util.Scanner;

public class Masked_Phone_Number_Formatter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        boolean valid = true;

        // Check length
        if (phone.length() != 10) {
            valid = false;
        }

        // Check whether all characters are digits
        if (valid) {

            for (int i = 0; i < phone.length(); i++) {

                if (!Character.isDigit(phone.charAt(i))) {
                    valid = false;
                    break;
                }
            }
        }

        if (!valid) {

            System.out.println("Invalid phone number");

        } else {

            String lastFour = phone.substring(6);

            StringBuilder result = new StringBuilder("XXXXXX");

            result.insert(6, "-");
            result.append(lastFour);

            System.out.println(result);
        }

        sc.close();
    }
}