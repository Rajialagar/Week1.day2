package week1.day3;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseEvenWords {

	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	/* Pseudo Code:

	 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)

	d)split the words and have it in an array

	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

	 */

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] sp = test.split(" ");
		String rev = " ";
		String[] arr= new String[sp.length];

		for (int i = 0; i < sp.length; i++) {
			if ((i % 2) == 0) {
				arr[i] = sp[i];

			}				
			if ((i % 2) != 0) {
				char[] ch = sp[i].toCharArray();
				for (int j = ch.length-1; j >= 0; j--) {
					rev = rev + ch[j];
				}
				arr[i] = rev;
			}
			String string1 = arr[i].toString();
			String s1 = string1.concat(" ");
			rev = " ";
			System.out.print(s1);
		}

	}
}

