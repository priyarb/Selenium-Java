package JavaPractice;

public class StringReverse {
	//recursive method
	public static String reverse(String s2) {
		if(s2.length()<=1) {
			return s2;
		}
		else
		{
			return reverse(s2.substring(1, s2.length()))+s2.charAt(0);
		}
	}

	public static void main(String[] args) {

		String s="Selenium";
		String rev="";
		int len=s.length();
		for (int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//String Buffer
		String s1="java";
		StringBuffer sf=new StringBuffer(s1);
		System.out.println(sf.reverse());
		
		//Using recursion
		System.out.println(reverse("string"));
		
	}

}
