package court;

import residents.Animal;
import residents.Human;

import java.util.ArrayList;

public class CorgiCourt {
	int currentDay;
	public static ArrayList<String> dailyRecap = new ArrayList<>();
	Human lake = new Human("Lake");
	Human ellie = new Human("Ellie");
	Human cory = new Human("Cory");
	Animal ada = new Animal("Ada");
	Animal babbage = new Animal("Babbage");
	Animal pumpkin = new Animal("Pumpkin");
	public CorgiCourt() {
		currentDay = 0;
	}
	void printDay() {
		String day = DayOfTheWeek.DAY[currentDay]; System.out.println("Current day: " + day);
	}
	public void executeDay() {
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
		lake.weekday.workFromHome(8); ellie.weekday.workFromHome(10);
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
	void resetAllResidentStatuses() {
		lake.resetStatus(); ellie.resetStatus(); cory.resetStatus(); ada.resetStatus(); babbage.resetStatus();
		pumpkin.resetStatus();
	}
	void resetDay() {
		printDailyRecap(); clearDailyRecap(); resetAllResidentStatuses(); printDay();
	}
}
