package Searching;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println("Missing number is ");
        System.out.println(missingNumber(arr.length + 1, arr));
    }

    static int missingNumber(int n, int arr[]) {
        int x = 0;
        int y = 0;
        for (int i = 1; i <= n; i++) {
            x = x ^ i;
        }
        for (int val : arr) {
            y = y ^ val;
        }
        return x ^ y;
    }
}
