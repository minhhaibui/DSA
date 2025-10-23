package DSA_Generic;

import java.util.Hashtable;

public class Test {
    public static void main(String[] args) {
        Dictionary <String,String> dictionary = new Dictionary<>("Hello","xin chao");
        System.out.println(dictionary.toString());
        Dictionary<String,String> [] arrDictionary = new Dictionary[20];
        arrDictionary[0] =  new Dictionary<>("Hello","xin chao");
        arrDictionary[1] =  new Dictionary<>("Hello","xin chao");
        arrDictionary[2] =  new Dictionary<>("Hello","xin chao");
        arrDictionary[3] =  new Dictionary<>("Hello","xin chao");
        for (Dictionary<String, String> stringStringDictionary : arrDictionary) {
            System.out.println(stringStringDictionary.toString());
        }
    }
}
