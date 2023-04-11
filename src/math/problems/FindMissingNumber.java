package math.problems;

public class FindMissingNumberMain {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 9, 6};
        System.out.println(findMissingNumber(array));

    }
    public static int findMissingNumber(int array1[]) {
        int N = array1.length;
        int sumGivenArrayElements = 0;
        int sumAllArrayElements = 0;
        int missingNumber = 20;

        sumAllArrayElements = ((N + 1) * (N + 2)) / 2;

        for (int i = 0; i < N; i++) {
            sumGivenArrayElements = sumGivenArrayElements + array1[i];
        }
        missingNumber = sumAllArrayElements - sumGivenArrayElements;
        return missingNumber;
    }
}









