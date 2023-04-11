package math.problems;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		boolean isPrime;//to check if a number is prime or not

		File resultFile = new File("PrimeNumbers.dat");

			FileWriter fileStream = new FileWriter(resultFile);
			Scanner inputFile = new Scanner(resultFile);

			try
			{
				for (int n = 2; n < 1000000; n++) {
					isPrime = checkPrime(n);
					if (isPrime) {
						fileStream.write(n+"\n");
						System.out.println(n);
					}
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			inputFile.close();
			fileStream.close();
		}


	public static boolean checkPrime(int n) {

		for (int i = 2; i < n; i++) {

			if (n % i == 0)

				return false;
		}
		return true;

	}
}
