package Day_3;

// import java.util.*;

public class Day_3 {

    public static void print(int[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void reverse(int[] matrix) {
        int i, j;
        i = 0;
        j = matrix.length - 1;
        while (i < j) {
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        // Method 1 MAX ELEMENT
        // int arr[] = { 5, 6, 2, 4, 80, 900, 90, 3 };

        // Arrays.sort(arr);
        // System.out.println(arr[arr.length - 1]);

        // Method 2 MAX ELEMENT

        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }

        // Ques - Second max

        // int second_max = arr[0], max = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        // if (max < arr[i]) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }

        // }
        // if (arr[i] > second_max && arr[i] < max) {
        // second_max = arr[i];
        // }
        // }

        // System.out.println(max);
        // System.out.println(second_max);

        // Mirror Image LEETCODE
        int matrix[][] = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
        print(matrix);

    }
}
