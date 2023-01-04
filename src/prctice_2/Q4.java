// Take values of length and breadth of a rectangle from user and check if it is square or not.

package prctice_2;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");

        int l=sc.nextInt();

        System.out.println("enter the breadth");

        int b=sc.nextInt();

        if(l==b)

            System.out.println("It is square");

        else

            System.out.println("It is not the square");

    }

}
