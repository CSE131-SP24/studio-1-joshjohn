package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */


public class HiFour {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("What is the first name?\t");
		String s0 = in.nextLine();
		System.out.print("What is the next person's name?\t");
		String s1 = in.nextLine();
		System.out.print("What is the next person's name?\t");
		String s2 = in.nextLine();
		System.out.print("What is the last person's name?\t");
		String s3 = in.nextLine();
		
		System.out.println("Hello " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + "!");

		
		
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
