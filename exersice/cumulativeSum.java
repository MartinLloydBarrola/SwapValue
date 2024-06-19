/**
 * cumulativeSum
 */
public class cumulativeSum {

    public static void main(String[] args) {


        int[] numbers = {4,5,10};
        int[] cumulativeSum = cumulativeSum(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Cumulative sum for " + numbers[i] + " is: " + cumulativeSum[i]);
        }



    }


    public static int[] cumulativeSum(int... numbers){

        int[] cumulativeSums = new int[numbers.length];
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum+= numbers[i];
            cumulativeSums[i] =sum;
        }
        return cumulativeSums;
    }
}