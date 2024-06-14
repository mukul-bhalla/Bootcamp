package Searching;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateOrNot {
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

            HashMap<Integer, Integer> map = new HashMap<>();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (map.get(arr[i]) == null) {
                    map.put(arr[i], 1);
                } else {
                    System.out.println("Duplicate found " + arr[i]);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("No duplicates");
            }
        }
    }
}
