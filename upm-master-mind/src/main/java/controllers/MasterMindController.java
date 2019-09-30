/**
 * 
 */
package controllers;

import java.util.List;

/**
 * @author Mary
 *
 */
public class MasterMindController extends BaseController {

	public void seeWonderedAndDead(List<String> enteredColors, List<String> secretColors) {
		masterMindModel.seeWonderedAndDead(enteredColors, secretColors);
	}

	public List<String> getDeadColors() {
		return masterMindModel.getDeadColors();
	}

	public List<String> getWoundedColors() {
		return masterMindModel.getWoundedColors();
	}
}
