package cs3203Assignment3;

import java.util.Scanner;

public class cs3203Assignment3 {

	public static void main(String[] args) {
		//String prompt = new String();
		
		int answer = -1;
		//	This is here just for Number 3
		
		int[] array = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your list");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		System.out.print("Enter '1' for Addition. Enter '2' for Multiplication.");
		
		
		
		while (answer == -1 || answer != 1 || answer != 2) {
			answer = in.nextInt();
			if (answer == 1) {
				System.out.print("The list is " + makeListAdd(array) + " after adding everything.");
			}
			else if (answer == 2) {
				System.out.print("The list is " + makeListMult(array) + " after multipling everything.");
			}
			else {
				System.out.print("Try again, idiot.");
			}
			
		}
		
		
		
		
		
		
	}
	
	static int makeListAdd(int[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	static int makeListMult(int[] array) {
		int total = array[0];
		for(int i = 0; i < array.length - 1; i++) {
			total = total * array[i+1];
		}
		return total;
	}
}
