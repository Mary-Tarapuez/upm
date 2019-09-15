/**
 * 
 */
package es.upm.master.mastermind;

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

	public static void main(String[] args) {
		showMenu();
		MasterMind game = new MasterMind();
		MasterMindScanner scanner = new MasterMindScanner();
		boolean generarcod = scanner.readGenerarCod();

		if (generarcod) {
			game.generarCod();
			System.out.println("Codigo secreto generado con exito ****");
			game.setEnteredColors(scanner.readEnteredColors(4));
			System.out.println("");
			System.out.println("RESULTADO DEL JUEGO");
			System.out.println("Colores generados de forma automática: ");


			System.out.println("");
			System.out.print("Colores ingresados por el jugador: ");
			game.print(game.getEnteredColors());
			System.out.println("");
			game.seeWonderedAndDead();
			System.out.print("Colores Heridos: ");
			for (String wondedColor : game.getWoundedColors()) {
				System.out.print(wondedColor + " ");
			}
			System.out.println("");
			System.out.print("Colores Muertos: ");
			for (String deadColor : game.getDeadColors()) {
				System.out.print(deadColor + "");
			}
			System.out.println("");
			System.out.println("JUEGO FINALIZADO");
		} else {
			System.out.println("JUEGO FINALIZADO");
		}
	}

}
