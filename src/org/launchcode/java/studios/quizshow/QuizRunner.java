package org.launchcode.java.studios.quizshow;

public class QuizRunner {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        TrueFalse csm = new TrueFalse("Where is chainsaw man?", "true");
        csm.ask();
        csm.grade();
        //if it's true, happy days
        //if it's not, pissy potty
        String[] pissAnswers = {"No", "Actually I'm shitting", "No, you're pissing", "vriska"};
        MultipleChoice piss = new MultipleChoice("Am I pissing right now?", "Yes", pissAnswers);
        piss.ask();
        piss.grade();
        System.out.println(piss.points+ " piss points for ye. *bows verily* \n CONGRATULATIONS, MY LIEGE. YOU HAVE FINISHED THE EXAM. LEAVE OR SUFFER my wrath.");
    }
}
