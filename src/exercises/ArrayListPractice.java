package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Part 1
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        randomNumbers.add(1);
        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(3);
        randomNumbers.add(5);
        randomNumbers.add(8);
        randomNumbers.add(13);
        randomNumbers.add(21);
        randomNumbers.add(34);
        randomNumbers.add(55);
        randomNumbers.add(89);
        randomNumbers.add(144);

        System.out.println(sumEven(randomNumbers));

        //Parts 2 and 3
        Scanner input = new Scanner(System.in);
        ArrayList<String> randomWords = new ArrayList<>();

        randomWords.add("butts");
        randomWords.add("chainsawman");
        randomWords.add("psycho");
        randomWords.add("denji");
        randomWords.add("melon");
        randomWords.add("prybar");
        randomWords.add("fives");

        System.out.println("What term would you like to attempt to add to the Fives? ");
        randomWords.add(input.nextLine());

        System.out.println(printFive(randomWords));

        input.close();

        //BONUS: Part 4
        String eggRhyme = ArrayPractice.greenEggs();
        String[] eggScramble = eggRhyme.split(" ");
        ArrayList<String> eggHamWords = new ArrayList<>(Arrays.asList(eggScramble));

        System.out.println(printFive(eggHamWords));

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
        }
        return total;
    }

    public static ArrayList printFive(ArrayList<String> arr) {
        ArrayList<String> theFives = new ArrayList<>();

        for (String word : arr) {
            if (word.length() == 5) {
                theFives.add(word);
                continue;
            }
        }
        return theFives;
    }
}
