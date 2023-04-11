package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int decrementBy = 0;
		int count =1;

		for(int i = 100; i>=0; i--) {
			if (i == 100) {
				System.out.print(i + ",");

			} else if (count % 10 != 0) {
				System.out.print(i + ",");
				i = i - decrementBy;
				count++;

			} else {
				decrementBy++;
				if(i==0)
					System.out.println(i);
				else{

				System.out.print(i + ",");
				i = i - decrementBy;
				count++;
				}
			}
		}
	}
}













