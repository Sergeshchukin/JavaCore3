package Fruits;
import java.util.Arrays;


public class Swaper {
    public static void swap(Object[] array, int n1, int n2) {
        System.out.println("Result in box: " + Arrays.toString(array));
        Object swaper = array[n1];
        array[n1] = array[n2];
        array[n2] = swaper;
        System.out.println("Result swap box: " + Arrays.toString(array) + "\n");
    }
}
