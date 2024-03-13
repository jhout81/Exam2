//Question 6 I have this one all screwed up

import java.util.Arrays;

public class ArrayKnowledge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateArrayWithBounds(5, 10, 2)));

    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {

        int count = 0;
        for (int i = start; i < end; i += step) {
            count += 1;
            //numArray = Arrays.copyOf(numArray, numArray.length + 1);
        }
        System.out.println(count);
        int[] numArray = new int[1];
        System.out.println(Arrays.toString(numArray));
        numArray = Arrays.copyOf(numArray, numArray.length + 10);
        for (int j = start; j < end; j += step) {
            if (j != 0) {
                numArray[j] = j;
            }


        }

        return numArray;
    }
}
