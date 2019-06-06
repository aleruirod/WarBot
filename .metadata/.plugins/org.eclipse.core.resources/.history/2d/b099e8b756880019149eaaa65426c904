package warbot.src;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;


public class Mappings {

  public static List<Gang> gangs = new LinkedList<Gang>();
  public static Map<Integer, Territory> territories = new HashMap<Integer, Territory>();
  public static Integer dayCounter = 0;

  public static void initializeGangs() {
    gangs.add(0, new Gang("Los moros"));
    gangs.add(1, new Gang("Los canis"));
    gangs.add(2, new Gang("Los nedarras"));
    gangs.add(3, new Gang("Los gitanos"));
    gangs.add(4, new Gang("Los flipaos del parkour"));
    gangs.add(5, new Gang("Los chavales del Isla"));
    gangs.add(6, new Gang("El Abuelo y sus nietos"));
    gangs.add(7, new Gang("Landaluce y sus secuaces"));
    gangs.add(8, new Gang("Los RRPP"));
    gangs.add(9, new Gang("Los moritos jugando al furbo"));
    gangs.add(10, new Gang("6 niños bolivianos bailando bachata"));
  }

  public static Set<Integer> setTerrId = new HashSet<Integer>();
 
  public static void initializeTerritories() {
    territories.put(0, new Territory("El Puerto", 0, setTerrId));
    territories.put(1, new Territory("La Bajadilla", 1, setTerrId));
    territories.put(2, new Territory("Plaza Neda", 2, setTerrId));
    territories.put(3, new Territory("El Saladillo", 3, setTerrId));
    territories.put(4, new Territory("El Ambulatorio", 4, setTerrId));
    territories.put(5, new Territory("La Isla Kebabs", 5, setTerrId));
    territories.put(6, new Territory("Kebabs El Abuelo", 6, setTerrId));
    territories.put(7, new Territory("El Ayuntamiento", 7, setTerrId));
    territories.put(8, new Territory("Calle Trafalgar", 8, setTerrId));
    territories.put(9, new Territory("El Llano Amarillo", 9, setTerrId));
    territories.put(10, new Territory("Plaza Andalucía", 10, setTerrId));
  }

  public static void assignInitialTerritories() {

    for (int i = 0; i < gangs.size(); i++) {
      gangs.get(i).addTerritory(i);
    }
  }

}