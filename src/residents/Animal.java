package residents;
import days.LeisureDay;
public class Animal extends Resident {
	LeisureDay everyday;
	public Animal(String name) {
		super(name); everyday = new LeisureDay(this); appetite = 0; energy = 4;
	}
	public void resetStatus() {
		appetite = 2; energy = 3; morale = 2; performance = 3; sleepiness = 0;
	}
	public void sleep() {
		System.out.println(name + " goes to sleep.");
	}
	public void nap() {
		System.out.println(name + " takes a nap.");
	}
	public void sleepIn() {
		System.out.println(name + " sleeps in.");
	}
	public void eat() {
		System.out.println(name + " eats a meal.");
	}
	public void snack() {
		System.out.println(name + " eats a snack.");
	}
}
