package JavaPractice;

public class PrimeNumber {
	//number divisible by 1 or itself
	//13
	//13/2: 13/3: 13/4: 13/5......
	
	public static boolean isPrimeNumber(int num) {
		//edge/corner condition
		while(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void getPrimeNumber(int num1) {
		for(int i=2;i<=num1;i++) {
			if(isPrimeNumber(i))
				System.out.println(i);
		}
	}
	

	public static void main(String[] args) {

		System.out.println("Is Prime Number?: "+isPrimeNumber(2));
		System.out.println("Is Prime Number?: "+isPrimeNumber(3));
		System.out.println("Is Prime Number?: "+isPrimeNumber(10));
		System.out.println("Is Prime Number?: "+isPrimeNumber(-1));
		System.out.println("Is Prime Number?: "+isPrimeNumber(0));
		
		getPrimeNumber(20);
	}

}
