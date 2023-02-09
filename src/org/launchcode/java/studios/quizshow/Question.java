package org.launchcode.java.studios.quizshow;

import java.util.Scanner;

public abstract class Question {
    final String question;
    private final String correctAnswer;
    public String response;
    public static int points;
    public Question(String question, String correctAnswer) {
        super();
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public abstract void ask();

    public abstract void grade();
}
