// 7.Take input of age of 3 people by user and determine oldest and youngest among
//them.

package prctice_2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First person Age");
        int age1 = sc.nextInt();
        System.out.println("Enter the Second person Age");
        int age2 = sc.nextInt();
        System.out.println("Enter the Third person Age");
        int age3 = sc.nextInt();

        int big = 0; // Declare big person
        int small = 0; // Declare small person

        if (age1 > age2 && age1 > age3) { big = age1; }
        if (age2 > age1 && age2 > age3) { big = age2; }
        if (age3 > age2 && age3 > age2) { big = age3; }

        if (age1 < age2 && age1 < age3) { small = age1; }
        if (age2 < age1 && age2 < age3) { small = age2; }
        if (age3 < age2 && age3 < age1) { small = age3; }

        //output the answer
        System.out.println("The youngest person's age is " + small + " year and the oldest person age is " + big + " years old.");




    }
}
