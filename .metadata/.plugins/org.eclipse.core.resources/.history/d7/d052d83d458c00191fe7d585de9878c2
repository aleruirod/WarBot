package warbot.src;

public class StatusCheck {

	public static void showAllGangsAndTerritories() {
		for(Gang g: Mappings.gangs) {
			System.out.println("- "+g+g.showControlledTerritories()+" En total: "+g.getNumTerritories()+" territorio(s).\n");
		}
	}

	public static void showAllTerritories() {
		for(Territory t: Mappings.territories.values()) {
			System.out.println(t+"\n");
		}
	}

	public static void dailyBriefing() {
		Mappings.dayCounter++;

		System.out.println("======================================================== \nDía "+Mappings.dayCounter+":");

		System.out.println("\n Bandas: \n");

		StatusCheck.showAllGangsAndTerritories();

		Tools.delay(5);
	}
}