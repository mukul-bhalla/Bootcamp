package Day_1;

import java.util.Scanner;

public class Day_1 {

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int sumOfDigit(int n) {
        int temp = n, count = 0;
        while (temp > 0) {
            int r = temp % 10;
            count += r;
            temp /= 10;
        }
        return count;
    }

    public static int RecursiveSumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + RecursiveSumOfDigit(n / 10);
    }

    public static void RecursiveSumOfDigit2(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n % 10;
        RecursiveSumOfDigit2(n / 10, sum);
    }

    public static boolean palindromeOrNot(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end) ? true : false) && palindromeOrNot(str, start + 1, end - 1);
    }

    public static int armstrongOrNot(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) * (num % 10) * (num % 10) + armstrongOrNot(num / 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(palindromeOrNot(str, 0, str.length() - 1));

        // System.out.println(fact(5));

        // System.out.println(RecursiveSumOfDigit(13331));

        // RecursiveSumOfDigit2(13331, 0);

        int num = sc.nextInt();
        int temp = armstrongOrNot(num);
        if (num == temp) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
        }
    }

}
