package test1;

import java.io.*;
import java.io.IOException;
import java.util.Observable;


public class ZooFoodServer extends Observable {
	private String name;
	private String type = "zoofoodserver";
	private String currentTask;


	public ZooFoodServer(String name) {
		this.name = name;
	}

	public void clean() throws IOException {
		//System.out.println("ZooFoodServer is cleaning");
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write("ZooFoodServer is cleaning");
		writer.close();
		setCurrentTask("cleaning");
	}

	public void make() throws IOException {
		//System.out.println("ZooFoodServer is making the food");
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write("ZooFoodServer is making the food");
		writer.close();
		setCurrentTask("making food");
	}

	public void serve() throws IOException{
		//System.out.println("ZooFoodServer is serving the food");
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write("ZooFoodServer is serving the food");
		writer.close();
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
