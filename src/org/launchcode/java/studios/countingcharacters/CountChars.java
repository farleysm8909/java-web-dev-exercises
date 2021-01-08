package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = input.nextLine();
        char[] charsInString = str.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character : charsInString) {
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1); //.get() method not in textbook, but returns value for given key
            } else {
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> pair : charCount.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
