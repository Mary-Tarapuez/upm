/**
 * 
 */
package views;

import java.util.List;

/**
 * @author Mary
 *
 */
public class PrinterView {

	private static void printColors(List<String> printColors) {
		String stringColors = "";
		if (!printColors.isEmpty()) {
			for (String color : printColors) {
				stringColors = stringColors + color + " ";
			}
			System.out.print(stringColors.trim());
		}
	}

	public static void print(List<String> enteredColors, List<String> woundedColors, List<String> deadColors) {
		System.out.print("Colores Ingresados: ");
		printColors(enteredColors);
		System.out.println("");
		System.out.print("Colores heridos: ");
		printColors(woundedColors);
		System.out.println("");
		System.out.print("Colores Muertos: ");
		printColors(deadColors);
	}

	public static void print(List<String> listColors) {
		printColors(listColors);
	}
}
