import java.util.Scanner;

public class Fabonacci_Series {

	public static void main(String[] args) {

		// user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Display Fibonacci series Upto Nth number :");
		int n = scanner.nextInt();
		System.out.println("Enter the First Term :");
		int firstTerm = scanner.nextInt();
		System.out.println("Enter the Second term:");
		int secondTerm = scanner.nextInt();

		// for addition of last 2numbers
		while (firstTerm <= n) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

		System.out.println("Fibonacci Series Upto " + n + ": ");
	}
}
