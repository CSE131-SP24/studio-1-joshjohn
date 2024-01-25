package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Name a year.");
		int year = scan.nextInt();
		boolean leapyear;
		leapyear = (((year % 4 == 0) && (year % 100 != 0) || (year  % 400 == 0)));
		System.out.println(year + " is a leap year: " + leapyear);
		
		
		// TODO Auto-generated method stub

	}

}
