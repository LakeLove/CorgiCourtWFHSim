import days.Day;
import days.LeisureDay;
import days.WorkDay;
import residents.Animal;
import residents.Human;
import residents.Resident;

import java.util.HashMap;

public class CorgiCourt {
	int currentDay;
	public static final String[] DAYS_OF_WEEK = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday", "Sunday"};
	HashMap<String, Day> week;
	Resident Lake = new Human();
	Resident Ellie = new Human();
	Resident Cory = new Human();
	Resident Ada = new Animal();
	Resident Babbage = new Animal();
	Resident Pumpkin = new Animal();
	public CorgiCourt() {
		currentDay = 0; week = new HashMap<>(); week.put("Monday", new WorkDay()); week.put("Tuesday", new WorkDay());
		week.put("Wednesday", new WorkDay()); week.put("Thursday", new WorkDay()); week.put("Friday", new WorkDay());
		week.put("Saturday", new LeisureDay()); week.put("Sunday", new LeisureDay());
	}
	void printDay() {
		System.out.println("Current day: " + DAYS_OF_WEEK[currentDay]);
	}
	void executeDay() {
		printDay(); switch (DAYS_OF_WEEK[currentDay]) {
			case "Monday": executeMonday(); break;
			case "Tuesday": executeTuesday(); break;
			case "Wednesday": executeWednesday(); break;
			case "Thursday": executeThursday(); break;
			case "Friday": executeFriday(); break;
			case "Saturday": executeSaturday(); break;
			case "Sunday": executeSunday(); break;
		} updateCurrentDay();
	}
	void executeMonday() {}
	void executeTuesday() {}
	void executeWednesday() {}
	void executeThursday() {}
	void executeFriday() {}
	void executeSaturday() {}
	void executeSunday() {}
	void updateCurrentDay() {currentDay += 1;}
}
