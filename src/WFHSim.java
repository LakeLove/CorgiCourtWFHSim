public class WFHSim {
	public static void main(String[] args) {
		System.out.println(introduction()); CorgiCourt typicalWeek = new CorgiCourt();
		for (int i = 0; i < CorgiCourt.DAYS_OF_WEEK.length; i++) {
			typicalWeek.printDay(); typicalWeek.updateCurrentDay();
		}
	}
	static String introduction() {return "Corgi Court: Work From Home Simulation by Lake Greene";}
}
