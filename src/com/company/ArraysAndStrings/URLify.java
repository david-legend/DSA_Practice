package com.company.ArraysAndStrings;

//Question

//Write a method to replace all spaces in a string with '%20'.
// You may assume that the string has sufficient space at the end to
// hold the additional characters,and that you are given the "true" length of the string.
// (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)

//EXAMPLE
//Input: "Mr John Smith    ", 13
// Output: "Mr%20John%20Smith"

//TODO:: Understand solution for the question very well
public class URLify {

    public static void main(String[] args) {
        // write your code here
        String[] test1 = {"Mr John Smith    ", "13"};
        String[] test2 = {"We can walk home      ", "16"};
        System.out.println(solution(test1[0], Integer.parseInt(test1[1])));
        System.out.println(solution(test2[0], Integer.parseInt(test2[1])));

//        replaceSpaces(test1[0].toCharArray(), Integer.parseInt(test1[1]));
//        replaceSpaces(test2[0].toCharArray(), Integer.parseInt(test2[1]));
    }


    //My Solution
    public static String solution(String input, int length) {
        String actual = input.substring(0, length);
        String val = actual.replace(" ", "%20");
        return val;

    }

    //Solution from book
    static void replaceSpaces(char[] str, int trueLength) {

        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0';

        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';

            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        System.out.println(new String(str));
    }
}
