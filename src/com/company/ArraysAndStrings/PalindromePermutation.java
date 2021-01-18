package com.company.ArraysAndStrings;

//Question

// Given a string, write a function to check if it is a permutation of a palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangement of letters.
// The palindrome does not need to be limited to just dictionary words.

public class PalindromePermutation {
    public static void main(String[] args) {
        String[] palindromes = {
                "madam", "peace", "civic", "algorithm", "racecar", "radar",
                "hannah", "stats", "tenet", "Kayak", "level"
        };

        System.out.println(isPermutationPalindrome(palindromes[0]));
        System.out.println(isPermutationPalindrome(palindromes[1]));
        System.out.println(isPermutationPalindrome(palindromes[2]));
        System.out.println(isPermutationPalindrome(palindromes[3]));
        System.out.println(isPermutationPalindrome(palindromes[4]));
    }

    public static boolean isPermutationPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);

        return checkMaxOneOdd(table);
    }

    public static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }


    public static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }
}
