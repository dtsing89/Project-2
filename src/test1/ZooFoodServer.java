package test1;

import java.util.Observable;

public class ZooFoodServer extends Observable {
	private String name;
	private String type = "zoofoodserver";
	private String currentTask;

	public ZooFoodServer(String name) {
		this.name = name;
	}

	public void clean() {
		System.out.println("ZooFoodServer is cleaning");
		setCurrentTask("cleaning");
	}

	public void make() {
		System.out.println("ZooFoodServer is making the food");
		setCurrentTask("making food");
	}

	public void serve() {
		System.out.println("ZooFoodServer is serving the food");
		setCurrentTask("serving food");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getCurrentTask() {
		return currentTask;
	}

	private void setCurrentTask(String currentTask) {
		this.currentTask = currentTask;
		setChanged();
		notifyObservers();
	}

	@Override
	public String toString() {
		return "ZooFoodServer [name=" + name + ", type=" + type + "]";
	}
}