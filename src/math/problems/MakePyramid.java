package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        int numberOfRows = 6;

        for(int i = 0; i <= numberOfRows; i++){

            for(int j = numberOfRows - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++){
               System.out.print("* ");
            }

            System.out.println();
        }
    }
}



