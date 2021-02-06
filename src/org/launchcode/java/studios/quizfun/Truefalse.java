package org.launchcode.java.studios.quizfun;

public class Truefalse extends Question {

    private boolean answer;

    public Truefalse(String aPrompt, boolean theAnswer) {
        super(aPrompt);
        this.answer = theAnswer;
    }

    public boolean isCorrect(String theirAnswer) {
        return (Boolean.parseBoolean(theirAnswer) == this.answer);
    }
}
