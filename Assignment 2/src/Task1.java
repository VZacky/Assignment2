import java.util.Scanner;

/**
 * Class Task1
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 24, 2021
 */

public class Task1 {
	
	public static boolean isLeapYear(int year) {
		
		return ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) ? true : false;
		
	}
	
	public static int calcDays1(int month, int year) {
		
		if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
			return 31;
		else if ( month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else
			return ( isLeapYear(year) ) ? 29 : 28;
		
	}	
	
	public static int calcDays2(int month, int year) {
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			default:
				return ( isLeapYear(year) ) ? 29 : 28;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.print("Please imput a numerical month: ");
		int month = data.nextInt();
		
		System.out.print("Please imput a year: ");
		int year = data.nextInt();
		
		data.close();
		
		System.out.println("CalcDays 1: The number of days in that month are " + calcDays1(month,year) + ".");
		System.out.println("CalcDays 2: The number of days in that month are " + calcDays2(month,year) + ".");
		
	}
	
}