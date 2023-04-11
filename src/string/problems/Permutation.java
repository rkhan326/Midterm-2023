package string.problems;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
      //  String s = "abb";

        System.out.println("Please enter a string: ");
        Scanner givenString = new Scanner(System.in);
        String string1 = givenString.nextLine();

        printPermutation(string1, "");


    }
    public static void printPermutation(String givenString, String ans)
    {

        if (givenString.length() == 0) {
              System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < givenString.length(); i++) {

            char charInGivenString = givenString.charAt(i);


            String ros = givenString.substring(0, i) +
                    givenString.substring(i + 1);


            printPermutation(ros, ans + charInGivenString);
        }
    }

}
