/**
 * 
 */
package controllers;

import models.MasterMindModel;
import models.SecretCodeModel;

/**
 * @author Mary
 *
 */
public class BaseController {

	protected MasterMindModel masterMindModel;
	protected SecretCodeModel secretCodeModel;

	public BaseController() {
		masterMindModel = new MasterMindModel();
		secretCodeModel = new SecretCodeModel();
	}
}
