package _02_JavaBasics.assignment_problems;

import java.util.Scanner;

public class ATM_PIN_Length_Validator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        String pin = sc.nextLine();

        if (pin.length() != 4) {
            System.out.println("Invalid PIN - must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }

        sc.close();
    }
}