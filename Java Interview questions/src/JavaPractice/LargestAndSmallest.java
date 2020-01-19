package JavaPractice;

public class LargestAndSmallest {

	public static void main(String[] args) {

		int arr[]= {-1,23,45976,92,0};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
			else if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest num: "+ largest);
		System.out.println("Smallest num: "+ smallest);
	}

}
