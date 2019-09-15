/**
 * 
 */
package es.upm.master.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Mary
 *
 */
public class MasterMindScanner {

	private Scanner keyboard;
	private String input;

	public MasterMindScanner() {
		keyboard = new Scanner(System.in);
	}

	public boolean readGenerarCod() {
		boolean statusEnteredColors = Boolean.FALSE;
		System.out.println("Ingrese la opción:");
		input = keyboard.nextLine();

		if (input.equalsIgnoreCase("1")) {
			statusEnteredColors = Boolean.TRUE;
		}
		return statusEnteredColors;

	}

	public List<String> readEnteredColors(int max) {

		List<String> enteredColors = new ArrayList<String>();
		do {
			System.out.println("Ingrese el color:");
			input = keyboard.nextLine();
			enteredColors.add(input);
		} while (enteredColors.size() < max);

		return enteredColors;

	}
}
