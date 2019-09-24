/**
 * 
 */
package es.upm.master.mastermind;

import java.util.List;

/**
 * @author Mary
 *
 */
public class Aplicacion {

	/**
	 * 
	 */

	public static void showMenu() {
		System.out.println("Master Mind - MASTER EN INGENIERIA WEB UPM");
		System.out.println("*****************************************************************************");
		System.out.println("Para jugar siga las siguientes intrucciones:");
		System.out.println("Presione 1 para generar codigo automatico y jugar");
		System.out.println("Presione cualquier tecla para salir");
		System.out.println("IMPORTANTE");
		System.out.println("   * El codigo automatico es generado desde el siguiente conjunto de datos:");
		System.out.println(" 	r->red, b->blue, y->yellow, g->green, o->orange, p->purple");
		System.out.println("   * Debe ingresar maximo 4 colores");
		System.out.println("   * Tiene 10 intentos para descifrar codigo automatico");
		System.out.println("*****************************************************************************");
		System.out.println("");
	}

	private static void print(MasterMind game) {
		System.out.print("Colores Ingresados: ");
		game.printColors(game.getEnteredColors());
		System.out.println("");
		System.out.print("Colores heridos: ");
		game.printColors(game.getWoundedColors());
		System.out.println("");
		System.out.print("Colores Muertos: ");
		game.printColors(game.getDeadColors());

	}

////////
	public static void main(String[] args) {
		showMenu();
		MasterMind game = new MasterMind();
		Object enteredColor = game.readColors(1);
		Object enteredColor1 = null;

		if (enteredColor.equals("1")) {
			game.generarCod();
			System.out.print("Colores secretos Automáticos: ****");
			int countTrys = 1;
			do {
				System.out.println("");
				System.out.println("INGRESE LOS COLORES PARA DESCIFRAR CODIGO");
				List<String> enteredColors = (List<String>) game.readColors(2);
				game.setEnteredColors(enteredColors);
				game.seeWonderedAndDead();
				if ((countTrys == game.getMaxTry()) || game.getDeadColors().size() == game.getMaxColors()) {
					break;
				}
				System.out.println("");
				System.out.println("RESULTADO DE LA PARTIDA");
				print(game);
				System.out.println(" ");
				System.out.println("PARA CONTINUAR PRESIONE CUALQUIER TECLA, PARA TERMINAR PRESIONE LA TECLA (n)");
				enteredColor1 = game.readColors(1);
				countTrys++;
			} while (!enteredColor1.toString().equalsIgnoreCase("n"));

			System.out.println("");
			System.out.println("RESULTADO DEL JUEGO");
			System.out.println("Colores generados de forma automática: ");
			game.printColors(game.getSecretColors());
			System.out.println("");
			print(game);
			System.out.println("");

			System.out.println("A GANADO");
		} else {
			System.out.println("JUEGO FINALIZADO");
		}
	}

}
