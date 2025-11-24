package DSA_Array;

import java.util.Scanner;

public class squareShape {
    public static void main(String[] args) {
        int t,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-- > 0) {
            n=sc.nextInt();
            System.out.println(" n" + n);
            if(n==0)
                break;
            long a = (long)Math.sqrt(n);
            System.out.println("a 1--------------" + a);
            while (n % a != 0) {
                a--;
                System.out.println("a--" + a);
            }

            long b = n / a;
            System.out.println(a + " " + b);

        }

    }
}
