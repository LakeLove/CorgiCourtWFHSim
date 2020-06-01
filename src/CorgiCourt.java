import days.Day;
import days.LeisureDay;
import days.WorkDay;
import residents.Animal;
import residents.Human;
import residents.Resident;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CorgiCourt {
	int currentDay;
	List<String> dailyRecap = new ArrayList<>();
	HashMap<String, Day> week;
	Resident lake = new Human("Lake");
	Resident ellie = new Human("Ellie");
	Resident cory = new Human("Cory");
	Resident ada = new Animal("Ada");
	Resident babbage = new Animal("Babbage");
	Resident pumpkin = new Animal("Pumpkin");
	public CorgiCourt() {
		currentDay = 0; week = new HashMap<>(); week.put("Monday", new WorkDay()); week.put("Tuesday", new WorkDay());
		week.put("Wednesday", new WorkDay()); week.put("Thursday", new WorkDay()); week.put("Friday", new WorkDay());
		week.put("Saturday", new LeisureDay()); week.put("Sunday", new LeisureDay());
	}
	void printDay() {
		switch (DayOfTheWeek.values()[currentDay]) {
			case MONDAY: System.out.println("Current day: Monday"); break;
			case TUESDAY: System.out.println("Current day: Tuesday"); break;
			case WEDNESDAY: System.out.println("Current day: Wednesday"); break;
			case THURSDAY: System.out.println("Current day: Thursday"); break;
			case FRIDAY: System.out.println("Current day: Friday"); break;
			case SATURDAY: System.out.println("Current day: Saturday"); break;
			case SUNDAY: System.out.println("Current day: Sunday"); break;
		}
	}
	void executeDay() {
		resetDay(); switch (DayOfTheWeek.values()[currentDay]) {
			case MONDAY: executeMonday(); break;
			case TUESDAY: executeTuesday(); break;
			case WEDNESDAY: executeWednesday(); break;
			case THURSDAY: executeThursday(); break;
			case FRIDAY: executeFriday(); break;
			case SATURDAY: executeSaturday(); break;
			case SUNDAY: executeSunday(); break;
		} updateCurrentDay();
	}
	void executeMonday() {
	}
	void executeTuesday() {
	}
	void executeWednesday() {
	}
	void executeThursday() {
	}
	void executeFriday() {
	}
	void executeSaturday() {
	}
	void executeSunday() {
	}
	void printDailyRecap() {
		String recap = String.join(", ", dailyRecap); System.out.println(recap);
	}
	void clearDailyRecap() {
		dailyRecap.clear();
	}
	void updateCurrentDay() {
		currentDay += 1;
	}
	void resetDay() {
		printDailyRecap(); clearDailyRecap(); printDay();
	}
}
