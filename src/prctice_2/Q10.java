// 10. Write a program to print the sum of two numbers entered by user by defining your
//own method.

package prctice_2;
import java.util.Scanner;
public class Q10 {

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        int a, b, sum2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        a = sc.nextInt();
        System.out.println("Enter second value");
        b = sc.nextInt();
        sum2 = sum(a, b);
        System.out.println("Sum of two value is :" + sum2);
    }
    }



