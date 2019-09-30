/**
 * 
 */
package controllers;

import java.util.List;

/**
 * @author Mary
 *
 */
public class SecretCodeController extends BaseController {

	public void generarCod() {
		secretCodeModel.generarCod();
	}

	public List<String> getSecretColors() {
		return secretCodeModel.getSecretColors();
	}
}
