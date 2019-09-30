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
public class DomainModel {

	private List<String> woundedColors;
	private List<String> deadColors;
	private List<String> enteredColors;
	private List<String> secretColors;

	public DomainModel() {
		this.setWoundedColors(new ArrayList<String>());
		this.setDeadColors(new ArrayList<String>());
		this.setEnteredColors(new ArrayList<String>());
		this.setSecretColors(new ArrayList<String>());
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
