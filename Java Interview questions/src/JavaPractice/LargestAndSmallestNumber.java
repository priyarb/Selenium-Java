package JavaPractice;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {

	int num[]= {104860,9486,96,0,-1,-8274};
	int largest=num[0];
	int smallest=num[0];
	for(int i=1;i<num.length;i++) {
		if(num[i]>largest)
			largest=num[i];
		else if(num[i]<smallest)
			smallest=num[i];
		
	}
	System.out.println("Largest: "+ largest);
	System.out.println("Smallest: "+ smallest);
	}

}
