package org.launchcode.java.studios.quizfun;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Truefalse firstQ = new Truefalse("True or False: The Earth is round.", true);
        System.out.println(firstQ.printPrompt());
        String theirAnswer = input.nextLine();
        System.out.println(firstQ.isCorrect(theirAnswer));

        Truefalse secondQ = new Truefalse("True or False: Coding is not fun.", false);
        System.out.println(secondQ.printPrompt());
        theirAnswer = input.nextLine();
        System.out.println(firstQ.isCorrect(theirAnswer));
    }
}
