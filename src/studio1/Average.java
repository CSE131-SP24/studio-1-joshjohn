package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The first of two integers to be averaged?");
		int n1 = scan.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int n2 = scan.nextInt();
		
		double average = (n1 + n2)/2.0;
		System.out.println("Average of " + n1 + " and " + n2 +  " is " +  average + ".");
		
		// TODO Auto-generated method stub

		
	}

}
