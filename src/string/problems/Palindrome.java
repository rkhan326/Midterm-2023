package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String reverseString = "";
        System.out.println("Please enter a string: ");
        Scanner givenString = new Scanner(System.in);
        String string1 = givenString.nextLine();

        char [] givenStringLowerCase = (string1.toLowerCase()).toCharArray();
        int stringLength = givenStringLowerCase.length;
        for ( int i = stringLength - 1; i >= 0; i-- )
            reverseString = reverseString + string1.charAt(i);


        if (string1.equals(reverseString))
            System.out.println(string1+" is a palindrome");
        else
            System.out.println(string1+" is not a palindrome");

    }
}




