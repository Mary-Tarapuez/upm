/**
 * 
 */
package utils;

/**
 * @author Mary
 *
 */
public class Util {

	public static String convertNumberToChar(int randomNumber) {
		switch (randomNumber) {
		case 1:
			return Constants.RED;
		case 2:
			return Constants.ORANGE;
		case 3:
			return Constants.YELLOW;
		case 4:
			return Constants.GREEN;
		case 5:
			return Constants.BLUE;
		case 6:
			return Constants.PURPLE;
		default:
			return "";
		}
	}

}
