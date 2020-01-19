package JavaPractice;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,6,7};
		int sum1=0;
		int sum2=0;
		//sum1=1+2+3+4+6+7
		//sum2=1+2+3+4+5+6+7
		//sum2-sum1
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		
		for(int j=1;j<=7;j++) {
			sum2=sum2+j;
		}
		System.out.println("Missing Number:" +(sum2-sum1));
	}

}
