package week1.day3;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicates {

	/*
	 * Pseudo code 

	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 

	 * g) Displaying the String without duplicate words	
	 */
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//int count = 1;
		String[] str = text.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equals(str[j]) == true) {
					str[j] = " ";
				}
			}
		}
		String join = String.join(" ",str);
		System.out.println(join);
	}
}




