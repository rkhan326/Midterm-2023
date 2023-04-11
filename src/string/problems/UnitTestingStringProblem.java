package string.problems;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//import static org.junit.jupiter.api.Assertions.*;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    }

    @Test
    public void anagramTest1() {
        String stringA = "cat";
        String stringB = "act";
        boolean actualResult = Anagram.compare(stringA, stringB);
        Assert.assertTrue(actualResult);
        System.out.println("anagram test1 passed");

    }

    @Test
    public void anagramTest2() {
        String stringA = "cat";
        String stringB = "tac";
        boolean actualResult = Anagram.compare(stringA, stringB);
        Assert.assertTrue(actualResult);
        System.out.println("anagram test2 passed");

    }

    @Test
    public void determineLargestTest1() {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> currentMap = string.problems.DetermineLargestWord.findTheLargestWord(s);
        Map<Integer, String> Expected = new HashMap<Integer, String>();
        Expected.put(10, "biological");
        boolean key = currentMap.equals(Expected);
        Assert.assertTrue(key);
        System.out.println("test determine largest passed ");


    }

    @Test
    public void determineLargestTest2() {
        String s = "Human brain is a biological learning machine. HELLLLLLLLooooooo";
        Map<Integer, String> currentMap = string.problems.DetermineLargestWord.findTheLargestWord(s);
        Map<Integer, String> Expected = new HashMap<Integer, String>();
        Expected.put(17, "HELLLLLLLLooooooo");
        boolean key = currentMap.equals(Expected);
        Assert.assertTrue(key);
        System.out.println("test determine largest passed ");
    }

    @Test
    public void palindromeTest1() {
        String string1 = "jalaj";
        Assert.assertTrue(string.problems.Palindrome.findPalindrome(string1));
        System.out.println("palindrome test 1 passed ");

    }

    @Test
    public void palindromeTest2() {
        String string1 = "badldab";
        Assert.assertTrue(string.problems.Palindrome.findPalindrome(string1));
        System.out.println("palindrome test 2 passed ");

    }
}


