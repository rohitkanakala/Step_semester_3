package _04_Arrays.assignment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ProductExceptSelf {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 1;

        for (int i = 0; i < n; i++) {
            result[i] = left;
            left = left * nums[i];
        }

        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        System.out.println("Result: " + Arrays.toString(result));

        sc.close();
    }
}