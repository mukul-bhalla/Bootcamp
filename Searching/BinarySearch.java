package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                return binarySearch(nums, 0, middle - 1, target);
            } else {
                return binarySearch(nums, middle + 1, high, target);
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
            int idx = binarySearch(arr, 0, arr.length - 1, element);
            if (idx != -1) {
                System.out.println("Element found at " + idx + " index");
            } else {
                System.out.println("Element not found");

            }
        }

    }
}
