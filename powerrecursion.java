import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Enter the exponent of number ");
        int pow = sc.nextInt();
        System.out.println("The result is " + Recursion(num, pow));
    }
    static long Recursion(int x, int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return x * Recursion(x, n - 1);
        }
    }
}
