package test1;

import java.util.Observable;
import java.util.Random;
import java.io.*;
import java.io.IOException;

public class ZooKeeper extends Observable {
	private String name;
	private String type = "zookeeper";
	private String currentTask;
	// private FileWriter writer = new FileWriter("dayatthezoo.out",true);

	public ZooKeeper(String name) throws IOException {
		this.name = name;
	}

	public void wakeAnimal(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " wakes up " + animal.name + " the " + animal.type);
		writer.write("\n");
		animal.wakeUp();
		writer.close();
		setCurrentTask("wake the animals!");

	}

	public void callAnimal(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " roll calls " + animal.name + " the " + animal.type);
		writer.write("\n");
		animal.makeNoise();
		writer.close();
		setCurrentTask("call the animals!");
	}

	public void feedAnimal(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " feeds " + animal.name + " the " + animal.type);
		writer.write("\n");
		animal.eat();
		writer.close();
		setCurrentTask("feed the animals!");
	}

	public void exerciseAnimal(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " exercises " + animal.name + " the " + animal.type);
		writer.write("\n");
		animal.roam();
		writer.close();
		setCurrentTask("exercise the animals!");
	}

	public void sleepAnimal(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " sleeps " + animal.name + " the " + animal.type);
		writer.write("\n");
		animal.sleep();
		writer.close();
		setCurrentTask("sleep the animals!");
	}

	public void dig(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " tried to wakes up " + animal.name + " the " + animal.type + " but he dug instead.");
		writer.write("\n");
		writer.close();
	}

	public void charge(Animal animal) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(type + " tried to exercises " + animal.name + " the " + animal.type + " but he charged instead.");
		writer.write("\n");
		writer.close();
	}

	public void arrive(int d) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write("Zookeeper arrive at Zoo on Day " + d);
		writer.write("\n");
		writer.close();
		setCurrentTask("arrive at the zoo!");
	}

	public void leave(int d) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write("Zookeeper leaves at Zoo on Day " + d);
		writer.write("\n");
		writer.close();
		setCurrentTask("leave the zoo!");
	}

	public int rand() {
		Random rand = new Random();
		int random_1 = rand.nextInt(100);
		return random_1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "ZooKeeper [name=" + name + ", type=" + type + "]";
	}

}
