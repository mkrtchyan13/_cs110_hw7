package utils;
import java.lang.reflect.array;

public class ArrayUtils {
    public static void reverse(int[] array) 
    {
        for(int i = 0; i < (array.length-1)/2; i++)
        {
            array[i] += array[array.length - i - 1];
            array[array.length - i - 1] = array[i] - array[array.length - i - 1];
            array[i] = array[i] - array[array.length - i - 1];
        }
    }
    public static String stringifyarray(Object array) {
        String result = "";
        for(int i = 0; i < array.getLength(array); i++)
        {
            result += array.get(array, i);
        }
        return result;
    }
}