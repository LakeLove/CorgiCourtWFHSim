package residents;
import residents.interfaces.Eater;
import residents.interfaces.Sleeper;
public abstract class Resident implements Sleeper, Eater {
	public String name;
	public Resident(String name) {
		this.name = name;
	}
}
