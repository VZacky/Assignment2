import java.util.Scanner;

/**
 * Class Task3
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 24, 2021
 */

public class Task3 {
	
	public static double calcFutureSalary(double currentSalary, int years) {
		
		if ( years < 3 )
			return currentSalary*Math.pow(1.03, years);
		else if ( years < 10 )
			return (currentSalary*Math.pow(1.03, 2)*Math.pow(1.05, years-2));
		else
			return ((currentSalary*Math.pow(1.03, 2)*Math.pow(1.05, 7)*Math.pow(1.08, years-9))); 
	}

	public static void main(String[] args) {
		
		Scanner myInfo = new Scanner(System.in);
		
		System.out.print("Please input your current salary: ");
		double currentSalary = myInfo.nextDouble();
		
		System.out.print("Please input the number of years: ");
		int years = myInfo.nextInt();
		
		myInfo.close();
		
		System.out.printf("Your future salary will be %.2f$.\n",
				calcFutureSalary(currentSalary, years));

	}

}