package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        Scanner givenString = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String stringA = givenString.nextLine();

        System.out.println("Please enter the second string: ");
        String stringB = givenString.nextLine();

        boolean ans = compare(stringA, stringB);
        System.out.println(ans);
    }
    public static boolean compare(String stringA, String stringB) {

        if (stringA.length() == stringB.length()) {

            char[] arrayA = (stringA.toLowerCase()).toCharArray();
            char[] arrayB = (stringB.toLowerCase()).toCharArray();

            Arrays.sort(arrayA);
            Arrays.sort(arrayB);

            if (Arrays.equals(arrayA, arrayB)) {
                System.out.println(stringA + " and " + stringB + " are anagrams!");
                return true;

            } else {
                System.out.println(stringA + " and " + stringB + " are NOT anagrams!");
            }
        }
        return false;
    }
}





