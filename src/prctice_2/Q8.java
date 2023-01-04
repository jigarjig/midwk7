// 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

package prctice_2;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held by Student His/Her");
        int a = sc.nextInt();
        System.out.println("Number of classes attended by Student His/Her");
        int b = sc.nextInt();
        float sa;
         sa = ((b * 100) / a);
        System.out.println(sa);
        if (sa >= 75)
            System.out.println("Student His/Her are allowed to sit in Exam:" + sa);
        else
            System.out.println("Student His/Her are not allowed to sit in Exam:" + sa);
    }
    }







