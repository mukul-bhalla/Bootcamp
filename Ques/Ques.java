package Ques;

import java.util.Scanner;
import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size ");
            int num = sc.nextInt();
            int arr[] = new int[num];
            int i;
            for (i = 0; i < num; i++) {
                System.out.println("Enter element " + (i + 1));
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[0];
            System.out.println("Smallest Number is " + min);
            System.out.println("Numbers divisible by " + min + " are : ");
            for (i = 1; i < num; i++) {
                if (arr[i] % min == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
