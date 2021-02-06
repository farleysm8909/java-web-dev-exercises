package org.launchcode.java.studios.quizfun;

public abstract class Question {

    private String prompt;
    private static int questionNumber = 0; //make static so all questions can access same variable

    public Question(String aPrompt) {
        this.prompt = aPrompt;
    }

    public String printPrompt() {
        questionNumber++;
        return "Question #" + questionNumber + ": " + this.prompt;
    }
}
