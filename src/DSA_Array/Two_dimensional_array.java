package DSA_Array;

import java.util.Random;

public class Two_dimensional_array {
    int n;
    int [][] matrixA;
    int [][] matrixB;
    public Two_dimensional_array(int n) {
        this.n = n;
        matrixA = new int [n][n];
        matrixB = new int [n][n];
        initMatrix();
    }
    public void initMatrix(){
        Random rd = new Random();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrixA[i][j]=rd.nextInt(10);
                matrixB[i][j]=rd.nextInt(10);
            }
        }
    }
    public void printMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void printMatrixA(){
        printMatrix(matrixA);
    }
    public void printMatrixB(){
        printMatrix(matrixB);
    }

    public int[][] sumMatrix(){
        int [][]sumMatrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
       return sumMatrix;
    }

    public int[][] multiplyMatrix(){
        int [][]multiMatrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                multiMatrix[i][j]=0;
                for(int k=0;k<n;k++){
                    multiMatrix[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
            }
        }
        return multiMatrix;
    }


        public static void main(String[] args) {
            Two_dimensional_array matrix = new Two_dimensional_array(5);
            System.out.println("matrix A:");
            matrix.printMatrixA();
            System.out.println("matrix B:");
            matrix.printMatrixB();
            int [][] sumMatrix = matrix.sumMatrix();
            System.out.println("sum matrix:");
            matrix.printMatrix(sumMatrix);
        }

}
