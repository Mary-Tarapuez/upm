/**
 * 
 */
package es.upm.master.mastermind;

import java.util.List;

/**
 * @author Mary
 *
 */
public class MasterMindView {

	private List<String> printColors;

	public MasterMindView() {
		
	}

	public void printColors() {
		String enteredColors = "";
		if (!this.getPrintColors().isEmpty()) {
			for (String color : this.getPrintColors()) {
				enteredColors = enteredColors + color + " ";
			}
			System.out.print(enteredColors);
		}
	}

	public List<String> getPrintColors() {
		return printColors;
	}

	public void setPrintColors(List<String> printColors) {
		this.printColors = printColors;
	}
}
