import java.util.Scanner;

public class Main {
    /* In fibonacci series, next number is the sum of previous two numbers
     for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
     The first two numbers of fibonacci series are 0 and 1.
     */
    public static void main(String[] args) {

        int a = 1, b = 1, n, fibon = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms you want : ");
        n = sc.nextInt();
        System.out.print(fibon);
        while (n > 1) {
            System.out.print(" " + fibon);
            fibon = a + b;
            a = b;
            b = fibon;
            n--;
        }
        System.out.println("");
    }
}