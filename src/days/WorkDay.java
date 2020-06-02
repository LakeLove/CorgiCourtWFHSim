package days;

import days.tasks.interfaces.Worker;
import residents.Human;

import static court.CorgiCourt.dailyRecap;

public class WorkDay extends Day implements Worker {
	Human worker;
	public WorkDay(Human worker) {
		this.worker = worker;
	}
	public void workFromHome(int hours) {
		if (hours < 5) {worker.appetite -= 2; worker.energy -= 2; worker.sleepiness += 1;}
		else {worker.appetite -= 4; worker.energy -= 3; worker.sleepiness += 2;}
		dailyRecap.add(worker.name + " worked from home");
	}
}