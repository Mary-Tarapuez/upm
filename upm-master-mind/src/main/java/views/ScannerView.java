/**
 * 
 */
package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utils.Constants;

/**
 * @author Mary
 *
 */
public class ScannerView {

	private Scanner keyboard;
	private String input;

	public ScannerView() {
		keyboard = new Scanner(System.in);
	}

	public String readColor() {
		readkeyboard();
		return this.input;
	}

	public List<String> readColors() {
		List<String> enteredColors = new ArrayList<String>();
		do {
			readkeyboard();
			boolean validColor = Constants.COLORES_PERMITIDOS.stream().anyMatch(n -> n.equalsIgnoreCase(this.input));
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
		} while (enteredColors.size() < Constants.TOTAL_COLORS);
		return enteredColors;
	}

	private void readkeyboard() {
		System.out.println("Ingrese el valor: ");
		input = keyboard.nextLine();
	}
}
