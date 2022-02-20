import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// userinput
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt();

		// variable assigned
		int reverse = 0;

		// logic
		while (number != 0) {
			int remainder = number % 10; // 10/10=5
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		// output
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
