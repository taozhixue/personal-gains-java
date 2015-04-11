package gains.java;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;



public class Array {

public static void main(String[] args) {
        int[] intArray={1,2,3,4,5};
        String intArrayString=Arrays.toString(intArray);
        System.out.println(intArray);
        System.out.println(intArrayString);
        String[] stringArray={"a","b","c","d","e","f"};
        ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);
        boolean b = Arrays.asList(stringArray).contains("a");
        int[] intArray1 = { 1, 2, 3, 4, 5 };
        int[] intArray2 = { 6, 7, 8, 9, 10 };
        // Apache Commons Lang library
        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
        System.out.println(b);
    }
}
