package com.company.ArraysAndStrings;


//Question
// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
public class IsUnique {

    public static void main(String[] args) {

        String test1 = "moonshine";
        String test2 = "letter";
        String test3 = "authorized";
        String test4 = "autopsying";
        String test5 = "background";
        String test6 = "backfields";

        isUnique(test1); //OutPut --> String is not Unique
        isUnique(test2); //OutPut --> String is not Unique
        isUnique(test3); //OutPut --> String is Unique
        isUnique(test4); //OutPut --> String is Unique
        isUnique(test5); //OutPut --> String is Unique
        isUnique(test6); //OutPut --> String is Unique
    }



    public static boolean isUnique(String str) {
        //Assuming that the string is an ASCII String

        //Since there can be only 128 unique combinations of an ASCII String
        //Return false if the string is longer that 128
        if (str.length() > 128) return false;

        //create a boolean array to track each unique character present in the string
        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            //gets the value of the particular character
            int val = str.charAt(i);

            //check if character has already appeared, return false if so
            if (charSet[val]) {
                System.out.println("False: String is not Unique");
                return false;
            }

            //Store true at that particular location if it is the first time coming across that character;
            charSet[val] = true;
        }

        System.out.println("True: String is Unique");
        //Return true is char is unique
        return true;
    }
}
