package DSA_Array;

import java.util.Arrays;
import java.util.Scanner;

public class DSA_Array {
    Scanner sc = new Scanner(System.in);
    int n;
    float arr[];

    public DSA_Array() {
        System.out.println("enter number of array");
        n=sc.nextInt();
        arr=new float[n];
    }
    public void setNumberArr(float[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the number" + i);
            arr[i]= sc.nextFloat();
        }
    }

    public void printArray(float[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("number of element " + i + " = " + arr[i]);
        }
    }

    public void sumTwoFist(float[] arr){
        float sum= arr[0]+arr[1];

        System.out.println("The sum is: " + sum);
    }

    public void sumNumberArr(float[] arr){
        float sum =0;
        for (float num : arr) {
            sum += num;
        }
        System.out.println("The sum is: " + sum);
    }
    public void minOfArr(float[] arr){
        float min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The min is: " + min);
    }
    public void addX(float[] arr ,float x){
       float[] newArr=new float[n+1];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[n]=x;
        arr=newArr;
        n++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSA_Array arr = new DSA_Array();
        arr.setNumberArr(arr.arr);
        arr.printArray(arr.arr);
        System.out.println("enter the add number :");
        float addNumber = sc.nextFloat();
        arr.addX(arr.arr, addNumber);
        arr.printArray(arr.arr);

    }
}
