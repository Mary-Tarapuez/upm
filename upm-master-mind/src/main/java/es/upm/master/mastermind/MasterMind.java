/**
 * 
 */
package es.upm.master.mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mary
 *
 */
public class MasterMind {

	private List<String> woundedColors;
	private List<String> deadColors;
	private List<String> secretColors;
	private List<String> enteredColors;
	private int maxTry;

	/**
	 * 
	 */
	public MasterMind() {

		this.setEnteredColors(new ArrayList<String>());
		this.setWoundedColors(new ArrayList<String>());
		this.setDeadColors(new ArrayList<String>());

	}

	public void generarCod() {

		List<String> secretColors = Arrays.asList("o", "r", "y", "b");
		this.setSecretColors(secretColors);

	}

	public void seeWonderedAndDead() {
		for (String enteredColor : this.getEnteredColors()) {
			for (String secretColor : this.getSecretColors()) {
				if (enteredColor.equals(secretColor)) {

					int i = this.getEnteredColors().indexOf(enteredColor);
					int j = this.getSecretColors().indexOf(secretColor);
					if (i == j) {
						this.getDeadColors().add(enteredColor);
					} else {
						this.getWoundedColors().add(enteredColor);
					}
				}
			}
		}
	}

	public void print(List<String> printColors) {
		MasterMindView objPrint = new MasterMindView();
		objPrint.setPrintColors(printColors);
		objPrint.printColors();
	}

	public int getMaxTry() {
		return maxTry;
	}

	public void setMaxTry(int maxTry) {
		this.maxTry = maxTry;
	}

	public List<String> getWoundedColors() {
		return woundedColors;
	}

	public void setWoundedColors(List<String> woundedColors) {
		this.woundedColors = woundedColors;
	}

	public List<String> getDeadColors() {
		return deadColors;
	}

	public void setDeadColors(List<String> deadColors) {
		this.deadColors = deadColors;
	}

	public List<String> getSecretColors() {
		return secretColors;
	}

	public void setSecretColors(List<String> secretColors) {
		this.secretColors = secretColors;
	}

	public List<String> getEnteredColors() {
		return enteredColors;
	}

	public void setEnteredColors(List<String> enteredColors) {
		this.enteredColors = enteredColors;
	}

}
