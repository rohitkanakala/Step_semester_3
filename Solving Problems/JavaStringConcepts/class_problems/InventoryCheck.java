package _01_JavaFoundation.assignment_problems;

import java.util.Scanner;

public class InventoryCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < n; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        String status = (totalA == totalB)
                ? "Balanced"
                : "Not Balanced";

        int highest = sectionA[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "Section A";
                index = i;
            }

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println(
                "Section A Total: " + totalA +
                        " | Section B Total: " + totalB +
                        " | Status: " + status
        );

        System.out.println(
                "Highest Quantity: " + highest +
                        " (" + section + ", Item " + (index + 1) + ")"
        );

        sc.close();
    }
}