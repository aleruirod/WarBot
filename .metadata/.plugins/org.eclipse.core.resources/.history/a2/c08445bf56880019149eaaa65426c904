package warbot.src;

import java.util.Set;
import java.util.HashSet;

/* 
Ideas para territorios:

- Que haya objetos que se vayan farmeando en cada territorio dependiendo quien lo controle (Ej: Cada turno que la banda "moros" controle este territorio 1 unidad del objeto "Kebab" se añade. Este objeto podria dar alguna especie de boost al territorio a la banda que lo controle.)

*/

public class Territory {
  private String name;
  private Integer id;
  private Set<Integer> neighbouringTerritories;//no utilizado aun.
  private Gang currentHolder = null;


  public Territory(String name, Integer id, Set<Integer> neighbouringTerritories) {
    this.name = name;
    this.id = id;
    this.neighbouringTerritories = new HashSet<Integer>(neighbouringTerritories);
  }

  public String getName() {
    return this.name;
  }

  public Integer getId() {
    return id;
  }

  public Set<Integer> getNeighbouringTerritories() {
    return this.neighbouringTerritories;
  }

  public Gang getCurrentHolder() {
    return currentHolder;
  }

  public void newController(Gang g) {
    this.currentHolder = g;
  }

  public String toString() {
    return this.name;
  }

}