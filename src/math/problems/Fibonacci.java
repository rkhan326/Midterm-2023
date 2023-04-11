package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int firstNumber = 0;
        int secondNumber = 1;
        int sumOfTwoPrecedingNumbers = 0;

        for (int i = 0; i < 39; i++) {
            sumOfTwoPrecedingNumbers = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumOfTwoPrecedingNumbers;

            System.out.println(sumOfTwoPrecedingNumbers);

        }

    }
}