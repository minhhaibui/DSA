package DSA_Array;

import java.sql.Array;
import java.util.Scanner;

public class Sum_odd_even_number {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        long[] numberArr =new long[n];

        for (int i = 0; i < n; i++) {
            numberArr[i] = sc.nextInt();
        }
        long oddSum=0;
        long evenSum=0;
        for (int i = 0; i < n; i++) {
           if (i%2!=0){
               oddSum=oddSum+numberArr[i];
           }else {
               evenSum=evenSum+numberArr[i];
           }
        }
        long result= oddSum-evenSum;
        System.out.println(result);
    }
}
