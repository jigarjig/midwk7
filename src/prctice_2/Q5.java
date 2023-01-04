// 5. Take two int values from user and print greatest among them.

package prctice_2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args)
    {
        int numberOne, numberTwo, largest;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        numberOne = scan.nextInt();
        System.out.print("Enter the Second Number: ");
        numberTwo = scan.nextInt();

        if(numberOne>numberTwo)
            largest = numberOne;
        else
            largest = numberTwo;

        System.out.println("\nLargest = " +largest);
    }
}
