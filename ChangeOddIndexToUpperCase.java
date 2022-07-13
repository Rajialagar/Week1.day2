package week1.day3;

public class ChangeOddIndexToUpperCase {

	/*
	 Pseudo Code
	 * Declare String Input as Follow
	 * String test = "changeme";
	 * a) Convert the String to character array
	 * b) Traverse through each character (using loop)
	 * c)find the odd index within the loop (use mod operator)
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	 * [0] = c
	 * [1] = h = odd
	 * [2] = a
	 * [3] = n = odd
	 * [4] = g
	 * [5] = e = odd
	 * [6] = m
	 * [7] = e = odd
	 */

	public static void main(String[] args) {

		String str = "changeme";
		char[] str1 = str.toCharArray();
		int l = str1.length;
		for (int i = 0; i < l; i++) {
			if(i%2 != 0) {
				char ch = Character.toUpperCase(str1[i]);
				System.out.println(ch);
			}
		}
	}	
}

