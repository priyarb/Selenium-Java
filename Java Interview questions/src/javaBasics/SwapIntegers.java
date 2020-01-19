package javaBasics;

public class SwapIntegers {

	public static void main(String[] args) {
//without using third variable : + operator
		int a=12;
		int b=20;
		a=a+b;//32
		b=a-b;//32-20=12
		a=a-b;//32-12=20
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		
//without using third variable : * operator	
		
		int c= 1;
		int d= 20;
		c=c*d;//1*20=20
		d=c/d;//20/20=1
		c=c/d;//20/1=20
		
		System.out.println("c= "+ c);
		System.out.println("d= "+ d);
		
//without using third variable : ^ XOR operator		
		c=c^d;
		d=c^d;
		c=c^d;
		System.out.println("c= "+ c);
		System.out.println("d= "+ d);
		
		//using third variable
		
		int x= 11;
		int y= 22;
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
	}

}
