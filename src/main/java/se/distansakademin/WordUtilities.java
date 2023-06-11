package se.distansakademin;

import java.util.Arrays;

import static java.util.Collections.sort;

public class WordUtilities {
    public static boolean isPalindrome(String word) {
        var reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static boolean isAnagram(String word1, String word2) {
        // return true if woerd1 and word2 are anagrams
        if (word1.length() != word2.length()) {
            return false;
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        var word1Array = word1.toCharArray();
        var word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }

    public static String lower(String input) {
        return input.toLowerCase();
    }

    public static String upper(String input) {
        return input.toUpperCase();
    }

    public static String repeat(String input, int repetitions) {
        StringBuilder result = new StringBuilder();

        var res = input.repeat(repetitions);

        return res;
    }

    public static String repeatDelimiter(String input, int repetitions, String delimiter) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < repetitions; i++) {
            result.append(input);
            if (i < repetitions - 1) {
                result.append(delimiter);
            }
        }

        return result.toString();
    }
}
