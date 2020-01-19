package javaBasics;

public class removeJunk {

	public static void main(String[] args) {

		String s3="#@$%#@$% String Value @$%^&**";
		String s4="@#$%^& Selenium @#$%^& expression @$%^^ 92184 ";
		
		//regular expression [^a-zA-Z0-9]
		s3=s3.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s3);
		
		//to remove numbers
		s4=s4.replaceAll("[^a-zA-Z]", "");
		System.out.println(s4);
	}

}
