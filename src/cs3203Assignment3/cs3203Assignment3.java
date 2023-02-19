package cs3203Assignment3;

import java.util.Scanner;

public class cs3203Assignment3 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your list");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		makeList(array);
		
		System.out.print("The list is " + makeList(array) + " after adding everything.");
		
	}
	
	static int makeList(int[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
}
