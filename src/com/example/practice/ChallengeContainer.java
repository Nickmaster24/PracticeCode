package com.example.practice;

/**
 * @author nickm_000
 * @since 12/3/2015.
 */
public class ChallengeContainer {

    //Reverse a string without String.Reverse()
    public static String reverseString(String input) {
        char[] inputCharacters = input.toCharArray();
        String result = "";
        for (int i = inputCharacters.length; i > 0; i--) {
            result = result.concat(Character.toString(inputCharacters[i - 1]));
        }
        return result;
    }
}
