package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        System.out.println(fibonacci());
    }

        public static int fibonacci(){
            int firstNumber = 0;
            int secondNumber = 1;
            int sumOfTwoPrecedingNumbers = 0;
            int lastNumber = 0;

            for (int i = 0; i < 39; i++) {
                sumOfTwoPrecedingNumbers = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sumOfTwoPrecedingNumbers;

                System.out.println(sumOfTwoPrecedingNumbers);
                lastNumber = sumOfTwoPrecedingNumbers;



            }
            return lastNumber;
        }
    }