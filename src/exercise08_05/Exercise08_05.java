package exercise08_05;

import java.util.Scanner;

public class Exercise08_05 {

    public static void main(String[] args) {
        //Establish scanner
        Scanner s = new Scanner(System.in);

        //Establish both matrix arrays
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        double[][] sum = new double[3][3];

        //Prompt matrix 1 to be entered
        System.out.print("Enter matrix 1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = s.nextDouble();
            }
        }
        //Prompt matrix 2 to be entered
        System.out.print("Enter matrix 2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = s.nextDouble();
            }
        }
        sum = addMatrix(m1, m2);

        //Print the output
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < m1.length; i++) {
            int countM1 = 0;
            int countM2 = 0;

            for (int j = 0; j < m1[0].length; j++) {
                countM1++;
                if (countM1 == 3) {
                    if (j == 2 ) {
                        System.out.print(m1[i][j] + "  +  ");
                    } else {
                        System.out.print(m1[i][j] + "     ");
                    }
                } else {
                    System.out.print(m1[i][j] + " ");
                }
            }
            for (int j = 0; j < m2[0].length; j++) {
                countM2++;
                if (countM2 == 3) {
                    System.out.print(m2[i][j] + "  =  ");
                } else {
                    System.out.print(m2[i][j] + " ");
                }
            }
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        //Create variable to be sent back to main method after addition
        double[][] sum = new double[3][3];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
