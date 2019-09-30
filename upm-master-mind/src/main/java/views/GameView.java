/**
 * 
 */
package views;

import java.util.List;

import controllers.MasterMindController;
import controllers.SecretCodeController;
import utils.Constants;

/**
 * @author Mary
 *
 */
public class GameView {

	private MasterMindController masterMindController;
	private SecretCodeController secretCodeController;
	private ScannerView scannerView;
	private Object enteredOption;
	private List<String> enteredColors;

	public GameView() {
		masterMindController = new MasterMindController();
		scannerView = new ScannerView();
		secretCodeController = new SecretCodeController();
	}

	private void gameIterations() {
		Object enteredOption1 = null;
		int countTrys = 1;
		do {
			System.out.println("");
			System.out.println("INGRESE LOS COLORES PARA DESCIFRAR CODIGO");
			enteredColors = (List<String>) scannerView.readColors();
			masterMindController.seeWonderedAndDead(enteredColors, secretCodeController.getSecretColors());
			if ((countTrys == Constants.TOTAL_TRY)
					|| masterMindController.getDeadColors().size() == Constants.TOTAL_COLORS) {
				break;
			}
			System.out.println("");
			System.out.println("RESULTADO DE LA PARTIDA");
			PrinterView.print(enteredColors, masterMindController.getWoundedColors(),
					masterMindController.getDeadColors());
			System.out.println(" ");
			System.out.println("PARA CONTINUAR PRESIONE CUALQUIER TECLA, PARA TERMINAR PRESIONE LA TECLA (n)");
			enteredOption1 = scannerView.readColor();
			countTrys++;
		} while (!enteredOption1.toString().equalsIgnoreCase("n"));
	}

	public void startGame() {
		MenuView.showMenu();
		enteredOption = scannerView.readColor();
		if (enteredOption.equals("1")) {
			secretCodeController.generarCod();
			System.out.print("Colores secretos Automaticos: ****");

			gameIterations();

			System.out.println("");
			System.out.println("RESULTADO DEL JUEGO");
			System.out.println("Colores generados de forma automatica: ");
			PrinterView.print(secretCodeController.getSecretColors());
			System.out.println("");
			PrinterView.print(enteredColors, masterMindController.getWoundedColors(),
					masterMindController.getDeadColors());
			System.out.println("");
			System.out.println("JUEGO FINALIZADO");
		} else {
			System.out.println("JUEGO FINALIZADO");
		}
	}

}
