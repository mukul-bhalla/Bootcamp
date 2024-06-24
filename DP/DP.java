package DP;

public class DP {
    public static int fibo(int num, int ans[]) {
        // Memorization
        if (num <= 1) {
            ans[num] = num;
            return num;
        }
        if (ans[num] != 0) {
            return ans[num];
        }
        ans[num] = fibo(num - 1, ans) + fibo(num - 2, ans);
        return ans[num];

    }

    public static int tabulationFibo(int num) {
        // Tabulation
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[num];
    }

    public static void main(String[] args) {
        int n = 5;
        // int ans[] = new int[n + 1];
        // System.out.println(fibo(n, ans));

        System.out.println(tabulationFibo(n));

    }
}
