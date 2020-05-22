package residents;
import interfaces.resident.Eater;
import interfaces.resident.Sleeper;
public abstract class Resident implements Sleeper, Eater {
	public String name;
	public Resident(String name) {
		this.name = name;
	}
}
