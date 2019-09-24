/**
 * 
 */
package es.upm.master.mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Mary
 *
 */
public class MasterMindScanner {
	public static final List<String> COLORES_PERMITIDOS = Arrays.asList("r", "b", "y", "g", "o", "p");

	private Scanner keyboard;
	private String input;

	public MasterMindScanner() {
		keyboard = new Scanner(System.in);
	}

	private void readkeyboard() {
		System.out.println("Ingrese el valor: ");
		input = keyboard.nextLine();
	}

	public String readColors() {
		readkeyboard();
		return this.input;
	}

	public List<String> readColors(int max) {
		List<String> enteredColors = new ArrayList<String>();
		do {
			readkeyboard();
			boolean validColor = COLORES_PERMITIDOS.stream().anyMatch(n -> n.equalsIgnoreCase(this.input));

			if (validColor) {
				boolean existColor = enteredColors.stream().anyMatch(n -> n.equalsIgnoreCase(this.input));

				if (!existColor) {
					enteredColors.add(input);
				} else {
					System.out.println("ERROR -> No puede ingresar colores repetidos");
				}

			} else {
				System.out.println("ERROR -> Color ingresado incorrecto");
			}
		} while (enteredColors.size() < max);
		return enteredColors;
	}
}
