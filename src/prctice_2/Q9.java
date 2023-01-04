// 9. Modify the above question to allow student to sit if he/she has medical cause. Ask
//user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

package prctice_2;


import java.util.Scanner;


public class Q9 {
    public static void main(String[] args) {

        int a = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held" + a);

        //int a = sc.nextInt();
        System.out.println("Number of classes attended by Student");
        int b = sc.nextInt();
        float sa;
        sa = ((b * 100) / a);
        System.out.println("Student Attendence is: " + sa + "%");

        if (sa >= 75) {
            System.out.println("Student allowed to sit in exam");
        } else {
            System.out.println("Student not allowed to sit in exam");
        }
        if (sa < 75) {
            System.out.println("Ask Student have any medical cause");
            System.out.println("Enter medical cause y or n");
            char mc = sc.next().charAt(0);
            switch (mc) {
                case 'y':
                    System.out.println("Student allowed to sit in Exam:");
                    break;
                case 'n':
                    System.out.println("Student is not allowed to sit in Exam:");
                    break;
                default:
            }
        }
    }

}











