package pullNames;

import java.util.InputMismatchException;
import java.util.*;

public class PullNames {
	static Scanner s = new Scanner(System.in);
	static String[] names = { "", "Danielle", "John", "Eric", "Joe", "Ava" };
	static String[] hometown = { "", "Detroit", "Chicago", "Cleveland", "Lima", "Brooklyn" };
	static String[] favFood = { "", "pizza", "cheese", "grapes", "chips", "peanuts" };

	// static String knowWhat = s.nextLine();
	public static void main(String[] args) {
		
System.out.println("Which student would you like to learn more about? Enter a number between 1 and 5:");


	 int studentNumber = getValidNumberInRange(1,5);
	
	System.out.println("Student number " +studentNumber + " is " +names[studentNumber]+".");
	System.out.println("");
	System.out.println("What would you like to know about "+names[studentNumber]+"?");
	String knowWhat = s.nextLine();
	


	if (knowWhat.equalsIgnoreCase("hometown")) 
			System.out.println(names[studentNumber] + "'s hometown is " +hometown[studentNumber]+".");
	if (knowWhat.equalsIgnoreCase("favorite food")) 
		System.out.println(names[studentNumber] + "'s favorite food is " +favFood[studentNumber]+".");
	
	validateInfo(knowWhat);
	
}


	/**
	 * @param knowWhat
	 */
	public static void validateInfo(String knowWhat) {
		while (!knowWhat.equalsIgnoreCase("hometown")&&!knowWhat.equalsIgnoreCase("favorite food")) {
			System.out.println("You must enter 'hometown' or 'favorite food'!");
			s.nextLine();
		}
	}


	public static int getValidNumberInRange(int min, int max) {

		int input = s.nextInt();
		s.nextLine();
		while (input < min || input > max) {
			System.out.println("Please put a number within range!");
			input = s.nextInt();
			s.nextLine();
		}

		return input;
	}
	public static int readValidIntegerNoExp()
{
	while (true){
		if (s.hasNextInt())
			break;
		s.nextLine();
	}
	int x = s.nextInt();
	s.nextLine();
		return x;
	
}
}
