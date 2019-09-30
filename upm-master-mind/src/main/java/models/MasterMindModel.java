/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mary
 *
 */
public class MasterMindModel extends DomainModel {

	public void seeWonderedAndDead(List<String> enteredColors, List<String> secretColors) {
		this.setEnteredColors(enteredColors);
		this.setSecretColors(secretColors);
		this.setWoundedColors(new ArrayList<String>());
		this.setDeadColors(new ArrayList<String>());
		for (String enteredColor : this.getEnteredColors()) {
			for (String secretColor : this.getSecretColors()) {
				if (enteredColor.equalsIgnoreCase(secretColor)) {
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

}
