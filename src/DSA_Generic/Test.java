package DSA_Generic;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap n");
            int N = sc.nextInt();
            System.out.println("nhap x");
            int X =sc.nextInt() ;
            int[] a = new int[N];
            int count = 0;

            for (int i = 0; i < N; i++) a[i] = sc.nextInt();

            for (int i = 0; i < N; i++) System.out.print(a[i] + " ");

            for (int i = 0; i < N; i++){
                for (int j = i; j < N; j++){
                    if(a[i] * a[i] + a[j] == X){
                        count++;
                    }
                }
            };

            int s=0;
            int i=1;
            int n=5;
            while(i < n){
                int j= n-i;
                while(j >= i){
                    s=s+1;
                    j=j-i;
                }
                i=j+1;
            }


            System.out.println(count);
        }

}
