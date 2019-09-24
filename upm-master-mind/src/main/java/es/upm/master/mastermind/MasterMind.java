/**
 * 
 */
package es.upm.master.mastermind;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mary
 *
 */
public class MasterMind {

	private static final int TOTAL_TRY = 10;
	private static final int TOTAL_COLORS = 4;
	private List<String> woundedColors;
	private List<String> deadColors;
	private List<String> secretColors;
	private List<String> enteredColors;
	private int maxTry;
	private int maxColors;
	private MasterMindView objPrint;
	private MasterMindScanner objRead;

	/**     
	 * 
	 */
	public MasterMind() {

		this.setSecretColors(new ArrayList<String>());
		this.setMaxTry(TOTAL_TRY);
		this.setMaxColors(TOTAL_COLORS);
	}

	public void generarCod() {

		while (this.getSecretColors().size() < this.getMaxColors()) {

			int rand = 1 + (int) (Math.random() * 6);
			String color = convertToChar(rand);
			boolean exist = this.getSecretColors().stream().anyMatch(n -> n.equals(color));
			if (!exist) {
				this.getSecretColors().add(color);
			}
		}
	}

	private static String convertToChar(int randomNumber) {
		switch (randomNumber) {
		// red
		case 1:
			return "r";
		// orange
		case 2:
			return "o";
		// yellow
		case 3:
			return "y";
		// green
		case 4:
			return "g";
		// blue
		case 5:
			return "b";
		// purple
		case 6:
			return "p";
		default:
			return "x";
		}
	}

	public void seeWonderedAndDead() {
		this.setWoundedColors(new ArrayList<String>());
		this.setDeadColors(new ArrayList<String>());
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

	public void printColors(List<String> printColors) {
		objPrint = new MasterMindView();
		objPrint.setPrintColors(printColors);
		objPrint.printColors();
	}

	public Object readColors(int indice) {

		objRead = new MasterMindScanner();

		switch (indice) {
		case 1:
			return objRead.readColors();

		case 2:
			return objRead.readColors(this.getMaxColors());

		default:
			return null;
		}

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

	public int getMaxTry() {
		return maxTry;
	}

	public void setMaxTry(int maxTry) {
		this.maxTry = maxTry;
	}

	public int getMaxColors() {
		return maxColors;
	}

	public void setMaxColors(int maxColors) {
		this.maxColors = maxColors;
	}

	public MasterMindView getObjPrint() {
		return objPrint;
	}

	public void setObjPrint(MasterMindView objPrint) {
		this.objPrint = objPrint;
	}

	public MasterMindScanner getObjRead() {
		return objRead;
	}

	public void setObjRead(MasterMindScanner objRead) {
		this.objRead = objRead;
	}

	public static int getTotalTry() {
		return TOTAL_TRY;
	}

	public static int getTotalColors() {
		return TOTAL_COLORS;
	}

}
