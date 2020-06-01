import court.CorgiCourt;
import court.DayOfTheWeek;
public class WFHSim {
	public static void main(String[] args) {
		System.out.println(introduction()); CorgiCourt typicalWeek = new CorgiCourt();
		for (int i = 0; i < DayOfTheWeek.values().length; i++) {typicalWeek.executeDay();}
	}
	static String introduction() {return "Corgi Court: Work From Home Simulation by Lake Greene";}
}
