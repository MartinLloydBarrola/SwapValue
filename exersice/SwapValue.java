/**
 * SwapValue
 */
public class SwapValue {

    public static void main(String[] args) {
        int[] original = {1,2};
        swap(original,0,1);

        System.out.println(original[0]);
        System.out.println(original[1]);
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}