package _01_JavaFoundation.practice_problems;

import java.util.*;

public class VIPCustomer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        String Id = in.nextLine();

        String result = validateCustomerId(Id);
        System.out.println(result);
    }

    static String validateCustomerId(String Id) {

        if (Id.startsWith("VIP")) {
            return "VIP Customer";
        }
        return "Regular Customer";
    }
}