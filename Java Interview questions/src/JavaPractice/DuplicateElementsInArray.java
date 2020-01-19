package JavaPractice;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String names[]= {"Selenium", "Java", "Javascript", "Java", "python", "python"};
		for(int i=0; i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate string: "+ names[i]);
					
				}
			}
		}
	}

}
