package what_eat;

import java.util.Scanner;

public class wat_2_eat {
	private static Scanner scnr;

	public static void main(String[] args) {

		scnr = new Scanner(System.in);

		// declare variables
		String eventType;
		int partySize;
		String result;
		String mealSuggestion;
		String prepSuggestion;

		// get user input
		System.out.println("What type of event is this?\nCasual, Semi-formal or formal? ");
		eventType = scnr.next();

		System.out.println("How big is your party? ");
		partySize = scnr.nextInt();

		// check input
		if (partySize <= 0) {
			System.out.println("Enter a number greater than  0");
			partySize = scnr.nextInt();
		}

		// conditional statements

		if (eventType.equalsIgnoreCase("casual")) {
			mealSuggestion = "sandwiches";
			switch (partySize) {
			case 1:
				prepSuggestion = "in the microwave";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				prepSuggestion = "in your kitchen";
				break;
			default:
				prepSuggestion = "by a caterer";
				break;

			}
		} else if (eventType.equalsIgnoreCase("semi-formal")) {
			mealSuggestion = "fried chicken";
			switch (partySize) {
			case 1:
				prepSuggestion = "in the microwave";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				prepSuggestion = "in your kitchen";
				break;
			default:
				prepSuggestion = "by a caterer";
				break;
			}
		} else if (eventType.equalsIgnoreCase("formal")) {
			mealSuggestion = "chicken parmesan";
			switch (partySize) {
			case 1:
				prepSuggestion = "in the microwave";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				prepSuggestion = "in your kitchen";
				break;
			default:
				prepSuggestion = "by a caterer";
				break;
			}
		} else {
			return;
		}

		result = ("Since you're hosting a " + eventType.toLowerCase() + " event for " + partySize + " participant(s), "
				+ "you should serve " + mealSuggestion + " prepared " + prepSuggestion + ".");

		System.out.println(result);

	}
}
