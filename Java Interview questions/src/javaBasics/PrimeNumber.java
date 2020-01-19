package javaBasics;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		// Corner/edge cases
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		// Prime Number: Num which can be divided by 1 or itself

		System.out.println("2 is prime num: " + isPrimeNumber(2));
		System.out.println("3 is prime num: " + isPrimeNumber(3));
		System.out.println("12 is prime num: " + isPrimeNumber(12));
		System.out.println("13 is prime num: " + isPrimeNumber(13));
		System.out.println("0 is prime num: " + isPrimeNumber(0));
		System.out.println("-1 is prime num: " + isPrimeNumber(-1));
		System.out.println("1 is prime num: " + isPrimeNumber(1));

		getPrimeNumber(13);
	}

}
