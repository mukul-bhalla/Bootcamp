import java.util.Scanner;

public class Java_Basic {
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(add(a, b));

    }
}