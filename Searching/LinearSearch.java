package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total number of elements");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements one by one");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter elements to find");
            int element = sc.nextInt();
            int idx = linearSearch(arr, element);
            if (idx != -1) {
                System.out.println("Element found at " + idx + " index");
            } else {
                System.out.println("Element not found");

            }
        }

    }
}
