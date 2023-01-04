// 1. Take 10 integers from keyboard using loop and print their average value on the
//screen.
package prctice_2;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number");
            sum = sum + sc.nextInt();
        }
        double average = sum / 10;
        System.out.println("Average is " + average);
    }
    }







