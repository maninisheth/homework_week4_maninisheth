package homework_week4_maninisheth;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 *       For eg.
 *  Input number of rows: 10
 */
public class TrianglePatternWithNumber {
   //main method
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Input number of rows : ");
        //declare scanner
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        scan.close();

    }
}
