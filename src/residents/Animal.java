package residents;
public class Animal extends Resident {
	public Animal(String name) {
		super(name);
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
