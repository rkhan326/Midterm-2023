package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
      /*
       Implement to Find the length and longest word in the given sentence below.
       Should return "10 biological".
       */

        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        for (String largestWord : wordNLength.values()) {
             s = largestWord.length() + " " + largestWord;

        }
        System.out.print(s);
    }
    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String individualWords[]= wordGiven.split(" ");
        String largestWord = individualWords[0];

        for(int i = 1; i < individualWords.length; i++){
            if(individualWords[i].length() > largestWord.length()){
                    largestWord = individualWords[i];
            }
        }
        map.put(largestWord.length(),largestWord);
        return map;
    }
}


