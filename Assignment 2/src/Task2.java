import java.util.Random;
import java.util.Scanner;

/**
 * Class Task2
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 24, 2021
 */

public class Task2 {
	
	public static double calcAverageScore(int num) {
		
		int sum = 0;
		int a = 0;
		
		for ( int i = 0; i < num; i++ ) {
			Random rand = new Random();
			a = rand.nextInt(101);
			if ( a > 40 ) {
				sum += a;
			}
		}
		
		double average = sum/num;
		
		return average;
		
	}

	public static void main(String[] args) {
		
		Scanner info = new Scanner(System.in);
		System.out.print("How many numbers are they?");
		int num = info.nextInt();
		
		info.close();
		
		System.out.println("The average is " + calcAverageScore(num) );
		
	}

}