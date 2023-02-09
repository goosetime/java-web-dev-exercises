package org.launchcode.java.studios.quizshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MultipleChoice extends Question {

    HashMap<String, Boolean> possibleAnswers = new HashMap<String, Boolean>();
    HashMap<Integer, Boolean> answerCeption = new HashMap<Integer, Boolean>();
    public MultipleChoice(String question, String correctAnswer, String[] wrongAnswers) {
        super(question, correctAnswer);
        possibleAnswers.put(correctAnswer, true);
        for (String i: wrongAnswers) {
            possibleAnswers.put(i, false);
        }
    }

    @Override
    public void ask() {
        int nextAnswerNum = 1;

        Scanner input = new Scanner(System.in);
        System.out.println(this.question);
        for (String i: possibleAnswers.keySet()) {
            System.out.println(nextAnswerNum + ") " + i);
            //i = String.valueOf(nextAnswerNum); // THE EASY WAY NEVER WORKS :<
            //HashMap<String, Boolean> HASHBROWN = new HashMap<String, Boolean>();
            //HASHBROWN.put(i, possibleAnswers.get(i)); // THE HARD WAY NEVER WORKS EITHER

            answerCeption.put(nextAnswerNum, possibleAnswers.get(i)); // THE STUPIDLY COMPLEX WAY IS THE ONLY WAY. FUCK YOU.

            nextAnswerNum++;
        }
        response = input.nextLine();
    }

    @Override
    public void grade() {
        if (answerCeption.get(Integer.parseInt(response))) {
            points++;
            System.out.println("Fuck yeah, great job. You got da point. (That was in goblin voice.)");
        }
        else {
            System.out.println("Fuck you idiot. You got it wrong. No points. No points for you. I'm not telling you the right answer. Fuck you idiot. No. No points for you. Oh my god. Fuck you.");
        }
    }

}
