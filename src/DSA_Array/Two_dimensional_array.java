package DSA_Array;

import java.util.Random;
import java.util.Scanner;

public class Two_dimensional_array {
        public static void main(String[] args) {
            Random rd = new Random();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap n: ");
            int n = sc.nextInt();
            System.out.println("nhap m: ");
            int m=sc.nextInt();

            int [][] arr=new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                   arr[i][j]= rd.nextInt(1000);
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]);
                    if (j < m - 1) System.out.print(", ");
                }
                System.out.println();
            }

        }

}
