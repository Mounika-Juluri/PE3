

import java.util.Scanner;

public class MatrixAdditions {
    public static void main(String[] args){
        int rows;
        int columns;

        Scanner input=new Scanner(System.in);
        System.out.println("enter rows");
        rows=input.nextInt();

        System.out.println("enter columns");
        columns=input.nextInt();
        int matrixA[][]=new int[rows][columns];
        int matrixB[][]=new int[rows][columns];
        int matrixC[][]=new int[rows][columns];

        System.out.println("enter matrix A elements");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrixA[i][j]=input.nextInt();
            }
        }
        System.out.println("enter matrix B elements");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrixB[i][j]=input.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.println(matrixC[i][j]);
            }
        }



    }



}
