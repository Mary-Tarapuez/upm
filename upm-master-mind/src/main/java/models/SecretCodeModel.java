/**
 * 
 */
package models;

import utils.Constants;
import utils.Util;

/**
 * @author Mary
 *
 */
public class SecretCodeModel extends DomainModel {

	public void generarCod() {
		while (this.getSecretColors().size() < Constants.TOTAL_COLORS) {
			int rand = 1 + (int) (Math.random() * 6);
			String color = Util.convertNumberToChar(rand);
			boolean exist = this.getSecretColors().stream().anyMatch(n -> n.equals(color));
			if (!exist) {
				this.getSecretColors().add(color);
			}
		}
	}
}
