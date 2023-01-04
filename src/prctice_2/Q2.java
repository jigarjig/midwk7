// 2. Print multiplication table of 24, 50 and 29 using loop.
package prctice_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 50;
        int num3 = 29;

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(num2 + " x " + (i + 1) + " = " + (num2 * (i + 1)));
        }
        for (int i = 0; i <= 10; i++) {
            //System.out.println(num3 + " x " + (i+1) + " = "  + (num3 * (i+1)));}
            System.out.printf("%d * %d = %d \n", num3, i, num3 * i);
        }
    }}


