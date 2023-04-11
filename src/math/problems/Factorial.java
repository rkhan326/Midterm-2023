package math.problems;

public class Factorial {
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //Factorial Using Iteration
        long givenNumber = 5;
        long factorialOfANumber = 1;

        for (int i = 1; i <= givenNumber; i++) {
            factorialOfANumber = factorialOfANumber * i;
        }

        //Calling Recursive Method
        long factorial = factorial(5);
        System.out.println("Factorial of the number provider is: "  + factorial);


        System.out.println(givenNumber + "! = " + factorialOfANumber);
    }


    //Factorial Using Recursion
    public static long factorial(int givenNumber1) {
        if (givenNumber1 > 0) {
            return givenNumber1 * factorial(givenNumber1-1);
        }else {
            return 1;
        }
    }

}
