package warbot.src;

import java.util.HashSet;
import java.util.Set;

/* Ideas para bandas:
- Eventos aleatorios que hacen que dos bandas se hagan aliadas o enemigas durante x turnos. Esto hara que no puedan atacar territorios del otro si son amigas y tengan predisposicion a atacar territorios de bandas enemigas antes que a los de otras bandas. Esto estaria en dos listas: amigos y enemigos. Se podria crear una funcion auxiliar que tomando dos bandas de argumentos te devuelva si son amigas, enemigas o neutrales para facilitar esta comprobacion.

- Relacionado con la idea de los objetos especiales por banda explicado en la clase Territory.java: Se deberia de declarar una variable ObjetoEspecial. Los efectos y tal se decidirian mas adelante.

- Podriamos añadir bastantes atributos que no afecten a la funcionalidad pero que añadan contenido al lore. Ej: Lideres de banda (para la banda "moros" posibles lideres: El Abuelo.)

 */

public class Gang {

	private String name;
	private Integer numTerritories = 0;
	private Set<Integer> controlledTerritories = new HashSet<Integer>();

	public Gang(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String showControlledTerritories() {
		String res = " controlan";

		for (Integer i: controlledTerritories) {
			res += ", "+Mappings.territories.get(i).getName();
		}

		return res +".";
	}

	public Set<Integer> getControlledTerritories() {
		return controlledTerritories;
	}

	public void addTerritory(Integer terrIndx) {
		controlledTerritories.add(terrIndx);
		Mappings.territories.get(terrIndx).newController(this);
		numTerritories++;
	}

	public void removeTerritory(Integer terrIndx) {
		controlledTerritories.remove(terrIndx);
		numTerritories--;
	}

	public Integer getNumTerritories() {
		return controlledTerritories.size();
	}

	public String toString() {
		return getName();
	}
}