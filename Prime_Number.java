import java.util.Scanner;

public class Prime_Number {

	// taking userinput
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int x = scanner.nextInt();
		int count = 0;

		// loop to check reminder is o of input
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("Not a prime number");
		}

	}

}
