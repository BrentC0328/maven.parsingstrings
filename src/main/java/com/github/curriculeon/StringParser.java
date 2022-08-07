package com.github.curriculeon;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if (input == null) {
            return null;
        }
        char[] splitInput = input.toCharArray();
        Character[] result = new Character[splitInput.length];

        for (int i = 0; i < splitInput.length; i++) {
            result[i] = splitInput[i];
        }
        return result;
    }

    public static Integer[] parseIntegers(String input) {
        if (input == null) {
            return null;
        }

        input = input.replace(" ","");
        char[] splitInput = input.toCharArray();


        Integer[] result = new Integer[splitInput.length];

        for (int i = 0; i < splitInput.length; i++) {
           Character currentCharacter = splitInput[i];
           result[i] = Integer.parseInt(currentCharacter.toString());

        }
        return result;

    }

    public static List<String> toList(String[] input) {
        ;
        return Arrays.asList(input);
    }

    public static String[] parseStrings(String input) {
        if (input == null) {
            return null;
        } else {
            char[] splitInput = input.toCharArray(); // split input into characters
            String[] result = new String[splitInput.length]; //make empty String Array

            for (int i = 0; i < splitInput.length; i++) // for loop to place each character into the array in order
                result[i] = String.valueOf(splitInput[i]);

            return result;
        }
    }
}
