package DSA_Array;

public class Average_generic {
    public static <T> double average(T[] array){
       double sum=0;
       for (int i=0;i<array.length;i++){
           double value = Double.parseDouble(array[i].toString());
                   sum+=value;
       }
       return sum/array.length;
    }

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("average:" + average(array));
    }
}
