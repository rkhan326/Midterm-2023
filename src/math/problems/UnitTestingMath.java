package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class UnitTestingMath {
    public static void main(String[] args) {


        //Apply Unit testing into each classes and methods in this package.
    }

    @Test
    public void factorialTest1() {
        long expectedResult = 24;
        long actualResult = Factorial.factorial(4);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("factorial test1 passed ");
    }

    @Test
    public void factorialTest2() {
        long expectedResult = 1;
        long actualResult = Factorial.factorial(0);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("factorial test2 passed ");
    }

    @Test
    public void fibonacciTest1() {
        int expectedResult = 102334155;
        int actualResult = Fibonacci.fibonacci();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("fibonacci test1 passed ");
    }

    @Test
    public void fibonacciTest2() {
        int expectedResult = 63245986;
        int actualResult = Fibonacci.fibonacci();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("fibonacci test1 passed ");
    }

    @Test
    public void findLowestDiffTest1() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int expectedResult = 1;
        int actualResult = FindLowestDifference.lowestDiff();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find lowest difference test1 passed ");
    }

    @Test
    public void findLowestDiffTest2() {
        int[] array1 = {30, 14, 10, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int expectedResult = 0;
        int actualResult = FindLowestDifference.lowestDiff();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find lowest difference test2 passed ");
    }

    @Test
    public void findMissingNumberTest1() {
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 9;
        int actualResult = FindMissingNumber.findMissingNumber(array);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find missing number test1 passed ");
    }

    @Test
    public void findMissingNumberTest2() {
        int[] array = new int[]{10, 2, 1, 5, 3, 7, 8, 9, 6};
        int expectedResult = 4;
        int actualResult = FindMissingNumber.findMissingNumber(array);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find missing number test2 passed ");
    }

    @Test
    public void LowestNumberTest1() {
        int[] array = new int[]{10, 2, 1, 5, 3, 7, 8, 9, 6};
        int expectedResult = 1;
        int actualResult = LowestNumber.findLowest(array);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find lowest number test1 passed ");


    }

    @Test
    public void LowestNumberTest2() {
        int[] array = new int[]{10, 2, 1, 5, 3, 7, 8, 9, 6, 0, -4, -6};
        int expectedResult = -6;
        int actualResult = LowestNumber.findLowest(array);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find lowest number test2 passed ");
    }

    @Test
    public void PrimeNumberTest1() {
        boolean expectedResult = true;
        boolean actualResult = PrimeNumber.checkPrime(3);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find prime number test1 passed ");
    }
    @Test
    public void PrimeNumberTest2() {
        boolean expectedResult = true;
        boolean actualResult = PrimeNumber.checkPrime(5);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("find prime number test1 passed ");
    }



}





