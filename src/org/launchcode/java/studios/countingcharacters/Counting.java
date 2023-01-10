package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Counting {

    public static void main(String[] args) {
        String heron = "i am a heron. i haev a long neck and i pick fish out of the water w/ my beak. if you dont repost this comment on 10 other pages i will fly into your kitchen tonight and make a mess of your pots and pans";

        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);

        String text = "";
        int choice;

        System.out.print("Welcome to the Character Counter! What text would you like me to count the characters of? Please type the number for your choice and press enter: " + '\n' +
                "1: i am a heron" + '\n' +
                "2: bee movie script" + '\n' +
                "3: custom prompt"+ '\n');

        choice = firstInput.nextInt();

        if (choice == 1) {
            text = heron;
        } else if (choice == 2) {
            text = "bee movie script";
        } else if (choice == 3) {
            System.out.print("What is your custom text prompt? Press enter when finished. ");
            text = secondInput.nextLine();
        } else {
            System.out.println("Oops, that wasn't valid! Please try again.");
            //TODO: Make it so user can try again without exiting out.
            //TODO: Make it so letters don't cause a program ending error.
        }

        HashMap<Character, Integer> countedCharacters = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (countedCharacters.containsKey(text.charAt(i))) {
                countedCharacters.put(text.charAt(i), (countedCharacters.get(text.charAt(i))) + 1);
            } else if (Character.toUpperCase(text.charAt(i)) == text.charAt(i)) {
                if (Character.toLowerCase(text.charAt(i)) == text.charAt(i)) {
                    continue;
                } else {
                    countedCharacters.put(text.charAt(i), 1);
                }
            } else {
                countedCharacters.put(text.charAt(i), 1);
            }
        }

        System.out.println(countedCharacters);
        firstInput.close();
        secondInput.close();

    }

}
