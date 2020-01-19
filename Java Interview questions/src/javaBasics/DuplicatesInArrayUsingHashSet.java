package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArrayUsingHashSet {

	public static void main(String[] args) {

		//Using HashSet: Java collection
		//Property: Stores unique value
		
		String names[]= {"Java","Javascript","Ruby","c","python","Java"};
		Set<String> store=new HashSet<String>(); //Set is an interface; HashSet is a class
		for(String name:names) {
			if(store.add(name)==false) //set stores unique values, if the value is already entered it returns false
			{
				System.out.println("Duplicate value" + name);
			}
		}
	}

}
