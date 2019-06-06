package warbot.src;

import java.util.Random;

public class Actions{

	public static Random r = new Random();

	public static void conquest() {

		Integer modificador = r.nextInt(6);

		StatusCheck.dailyBriefing();

		// elegimos un indice aleatorio para la lista de bandas para seleccionar atacante.

		if (modificador != 2) {

			Integer atkIndx = r.nextInt(Mappings.gangs.size());

			Gang attacking = Mappings.gangs.get(atkIndx);

			// elegimos un indice aleatorio para la lista de bandas para seleccionar la victima.
			Integer vtmIndx = r.nextInt(Mappings.gangs.size());

			// repetimos el proceso si el mismo indice que el atacante es elegido para la victima .
			if (vtmIndx == atkIndx) {
				while (vtmIndx == atkIndx) {
					vtmIndx = r.nextInt(Mappings.gangs.size());
				}
			}

			Gang victim = Mappings.gangs.get(vtmIndx);

			/* TENEMOS QUE: 
        - Cambiar dueño del territorio
        - Quitar el id de territorio a la victima.
        - Añadir el id de territorio al atacante.
			 */
			//Elegimos un territorio de la victima al azar que entregara al atacante
			Integer indxTakenTerritory = r.nextInt(victim.getNumTerritories());

			// Cogemos el territorio seleccionado del Map Global de territorios y sando el indice previamente calculado.
			Integer aux1 = Mappings.territories.get(victim.getControlledTerritories().toArray()[indxTakenTerritory]).getId();

			//Quitamos el id de territorio a la victima.
			Mappings.gangs.get(vtmIndx).removeTerritory(aux1);

			//Añadimos el id del terrirorio al atacante.
			// Este metodo actualiza tambien el dueño del territorio.
			Mappings.gangs.get(atkIndx).addTerritory(aux1);

			combatResult(attacking, victim, aux1);

			if (checkIfAllLost(Mappings.gangs.get(vtmIndx))) {
				removeGang(Mappings.gangs.get(vtmIndx));
			}

		} else {
			Story.freeDay();
		}

	}

	public static Boolean checkIfAllLost(Gang g){
		Boolean res = false;

		if (g.getNumTerritories() == 0)
			res = true;

		return res;
	}

	public static void removeGang(Gang victim) {
		System.out.println("\nX "+victim+" han sido completamente derrotados. Queda(n) "+(Mappings.gangs.size() - 1)+" banda(s).\n");
		Mappings.gangs.remove(victim);

		if (Mappings.gangs.size() == 1) {
			System.out.println("\n"+Mappings.gangs.get(0)+" controlan Algeciras.\n SE ACABÓ LA GUERRA\n\n\n\n");
			System.exit(0);
		}
	}

	public static void combatResult(Gang atk, Gang vtm, Integer terrId) {
		System.out.println("\nResultado del combate:");
		System.out.println("___________________________________________________________\n");
		System.out.println("| "+atk+" han conquistado "+Mappings.territories.get(terrId)+", previamente controlado por "+vtm+".");
		System.out.println("___________________________________________________________\n");
	}

}