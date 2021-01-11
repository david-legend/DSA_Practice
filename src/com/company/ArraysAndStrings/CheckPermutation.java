package com.company.ArraysAndStrings;

//Question

import java.util.Arrays;

//Given two strings,write a method to decide if one is a permutation of the other.
public class CheckPermutation {
    public static void main(String[] args) {
        // write your code here

        String[] test1 = {"bare", "rabe"};
        String[] test2 = {"jam", "mam"};
        String[] test3 = {"chaining", "haincing"};
        String[] test4 = {"farming", "farting"};
        String[] test5 = {"beast", "seabt"};


        //Solution 1
        checkPermutation(test1[0], test1[1]);
        checkPermutation(test2[0], test2[1]);
        checkPermutation(test3[0], test3[1]);

        //Solution2
        checkPermutation2(test4[0], test4[1]);
        checkPermutation2(test5[0], test5[1]);
    }


    //Solution 1
    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int str1AsciiSum = 0;
        int str2AsciiSum = 0;

        for (int i = 0; i < str1.length(); i++) {
            str1AsciiSum += str1.charAt(i);
            str2AsciiSum += str2.charAt(i);
        }

        if (str1AsciiSum == str2AsciiSum) {
            System.out.println("Is a permutation");
            return true;
        } else {
            System.out.println("Not a permutation");
            return false;
        }
    }


    //Solution 2
    public static String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkPermutation2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Not a permutation");
            return false;
        }

        if (sort(str1).equals(sort(str2))) {
            System.out.println("Is a permutation");
        } else {
            System.out.println("Not a permutation");
        }

        return sort(str1).equals(sort(str2));
    }
}
