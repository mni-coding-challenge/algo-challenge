package mni.code.challenge;

import java.util.Scanner;

public class SumOfDiagonalArray {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[][] matrixElement = populateMatrixElement(input);
        
        int c = input-1;
        int sumTopRighToLeft  = 0;
        int sumTopLeftToRight = 0;
        for (int i=0; i<input; i++) {
            sumTopRighToLeft += matrixElement[i][c--];
            sumTopLeftToRight += matrixElement[i][i];
        }

        System.out.print(sumTopRighToLeft);
        System.out.print(sumTopLeftToRight);
        scan.close();
    }

    static private int[][] populateMatrixElement(int input){
        Scanner scanner = new Scanner(System.in);
        int[][] element = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                element[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        return element;
    }

}
