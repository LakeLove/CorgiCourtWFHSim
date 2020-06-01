package residents;
import days.LeisureDay;
import days.WorkDay;
import residents.interfaces.Coder;
public class Human extends Resident implements Coder {
	public LeisureDay weekend;
	public WorkDay weekday;
	public Human(String name) {
		super(name); weekday = new WorkDay(this); weekend = new LeisureDay(this); appetite = 2; energy = 3;
	}
	public void resetStatus() {
		appetite = 2; energy = 3; morale = 2; performance = 3; sleepiness = 0;
	}
	public void sleep() {
	}
	public void nap() {
	}
	public void sleepIn() {
	}
	public void eat() {
	}
	public void snack() {
	}
	public void codeForFun() {
	}
}
