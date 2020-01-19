package javaBasics;

public class SwapString {

	public static void main(String[] args) {
		
		String firstname="Priya";
		String lastname="Biradar";
		
		//without using third variable
		firstname=firstname+lastname;
		lastname=firstname.substring(0, firstname.length()-lastname.length());
		firstname=firstname.substring(lastname.length());
		
		System.out.println("firstname = "+ firstname);
		System.out.println("lastname = "+ lastname);

	}

}
