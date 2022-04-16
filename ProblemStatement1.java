package week1.day1.assignments;

public class ProblemStatement1 {

	public static void main(String[] args) {
		// Program for converting a negative number to a positive number
		int number=-10;
		int positiveNumber;
		if (number < 0)
		{
			positiveNumber = number * (-1);
			System.out.println("Positive Number: "+positiveNumber);
		}
	}
}
