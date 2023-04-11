package string.problems;

import java.util.Scanner;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */


        String st = "Java is a programming Language Java is also an Island of Indonesia. Java is widely used language";

        int count = 0;
        int countNumDuplicateWords = 0;
        int totalLength = 0;

        System.out.println("Please enter a string: ");
        Scanner givenString = new Scanner(System.in);
        String string1 = givenString.nextLine();

        String givenStringLowerCase =string1.toLowerCase();
        //System.out.println(givenStringLowerCase);

        String[] wordsInSentence = givenStringLowerCase.split("[!._,'@? ]");

        for (int i = 0; i < wordsInSentence.length; i++) {
            count = 1;
            for (int j = i + 1; j < wordsInSentence.length; j++) {
                if (wordsInSentence[i].equals(wordsInSentence[j])) {
                    count++;
                    wordsInSentence[j] = "0";
                }
            }
            if (count > 1 && wordsInSentence[i] != "0") {
                countNumDuplicateWords++;
                System.out.println(wordsInSentence[i] + " appears " + count + " times!");

                char[] charInDuplicateWords = wordsInSentence[i].toCharArray();
                int length = charInDuplicateWords.length;
                totalLength = totalLength + length;
            }
        }
        System.out.println("The total number of letters in the " + countNumDuplicateWords + " duplicate words are: " + totalLength);
        System.out.println("Average of the " + countNumDuplicateWords+" duplicate words are: " + (double)totalLength/countNumDuplicateWords);
    }
}



