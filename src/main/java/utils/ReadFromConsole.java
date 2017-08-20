package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {

	public static int reading() {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		System.out.println("\nPlease give an option and press ENTER! I will read this value:\n");
		try {
			switch (scanner.nextInt()) {
			case 1:
				result = 1;
				break;
			case 2:
				result = 2;
				break;
			case 3:
				result = 3;
				break;
			case 4:
				result = 4;
				break;
			}
		} catch (InputMismatchException ex) {
			System.err.println("Please give a correct value. " + ex.toString());
		}
		return result;
	}

}
