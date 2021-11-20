import java.util.Scanner;

/**
 * Class Task4
 * @autor 2175056 - Sonia Vetra
 * Date: Oct. 24, 2021
 */

public class Task4 {
	
	public static char toLetterScore(double digitScore) {
		
		if ( 90 <= digitScore && digitScore <= 100 )
			return 'A';
		else if ( 80 <= digitScore && digitScore < 90 )
			return 'B';
		else if ( 70 <= digitScore && digitScore < 80 )
			return 'C';
		else if ( 60 <= digitScore && digitScore < 70 )
			return 'D';
		else
			return 'F';
		
	}
	
	public static void printMessage1(char letterScore) {
		
		if ( letterScore == 'A' )
			System.out.println("printMessage1: Excellent");
		else if ( letterScore == 'B' || letterScore == 'C' )
			System.out.println("printMessage1: Well done");
		else if ( letterScore == 'D')
			System.out.println("printMessage1: Passed");
		else
			System.out.println("printMessage1: Better try again");
		
	}
	
	public static void printMessage2(char letterScore) {
		
		switch(letterScore) {
		case 'A':
			System.out.println("printMessage2: Excellent"); break;
		case 'B', 'C':
			System.out.println("printMessage2: Well done"); break;
		case 'D':
			System.out.println("printMessage2: Passed"); break;
		default:
			System.out.println("printMessage2: Better try again");
	    }
		
	}

	public static void main(String[] args) {
		
		Scanner myInfo = new Scanner(System.in);
		System.out.print("Please enter your score: ");
		
		double digitScore = myInfo.nextDouble();
		char letterScore = toLetterScore(digitScore);
		
		myInfo.close();
		
		printMessage1(letterScore);
		printMessage2(letterScore);
		

	}

}