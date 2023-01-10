package exercises;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] exampleArray = {1, 1, 2, 3, 5, 8};

        //first loop: print all numbers
        for(int i = 0; i < exampleArray.length; i++) {
            System.out.println(exampleArray[i]);
        }

        //second loop: print only odd numbers
        for(int i = 0; i < exampleArray.length; i++) {
            if (exampleArray[i] % 2 == 1)
            System.out.println(exampleArray[i]);
        }

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //first split: using a space
        String[] hamArray = greenEggs.split(" ");
        System.out.println(Arrays.toString(hamArray));

        //second split: using periods
        String[] samArray = greenEggs.split("\\.");
        System.out.println(Arrays.toString(samArray));

    }
}
