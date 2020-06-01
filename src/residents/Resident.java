package residents;
import residents.interfaces.Eater;
import residents.interfaces.Sleeper;
public abstract class Resident implements Sleeper, Eater {
	public int appetite, energy, morale, performance, sleepiness;
	public String name;
	public Resident(String name) {
		this.name = name; morale = 2; performance = 3; sleepiness = 0;
	}
	public abstract void resetStatus();
}
