import Days.Day;
import Days.LeisureDay;
import Days.WorkDay;

import java.util.HashMap;

public class CorgiCourt {
	int currentDay;
	public static final String[] DAYS_OF_WEEK = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday", "Sunday"};
	HashMap<String, Day> week;
	public CorgiCourt() {
		currentDay = 0; week = new HashMap<>(); week.put("Monday", new WorkDay()); week.put("Tuesday", new WorkDay());
		week.put("Wednesday", new WorkDay()); week.put("Thursday", new WorkDay()); week.put("Friday", new WorkDay());
		week.put("Saturday", new LeisureDay()); week.put("Sunday", new LeisureDay());
	}
	void printDay() {System.out.println("Current day: " + DAYS_OF_WEEK[currentDay]);}
	int updateCurrentDay() {return currentDay += 1;}

}
