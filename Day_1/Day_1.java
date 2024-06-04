package Day_1;

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

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        System.out.println(fact(5));
        // System.out.println(sumOfDigit(12345));
        System.out.println(RecursiveSumOfDigit(13331));

        // int num = 1234;
        // String str = Integer.toString(num);
        // char charArr[] = str.toCharArray();
        // char temp = charArr[0];
        // charArr[0] = charArr[str.length() - 1];
        // charArr[str.length() - 1] = temp;

        // String ans = new String(charArr);

        // int res = Integer.parseInt(ans);

        // System.out.println(res);

    }

}
