package test1;
<<<<<<< HEAD

=======
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
import java.util.Observable;

public class ZooFoodServer extends Observable {
	private String name;
	private String type = "zoofoodserver";
	private String currentTask;
<<<<<<< HEAD

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

=======
	
	public ZooFoodServer(String name) {
		this.name = name;
	}
	
	public void clean() {
		System.out.print("ZooFoodServer is cleaning");
		setCurrentTask("cleaning");
	}
	
	public void make() {
		System.out.print("ZooFoodServer is making the food");
		setCurrentTask("making food");
	}
	
	public void serve() {
		System.out.print("ZooFoodServer is serving the food");
		setCurrentTask("serving food");
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
	public String getCurrentTask() {
		return currentTask;
	}

<<<<<<< HEAD
	private void setCurrentTask(String currentTask) {
		this.currentTask = currentTask;
		setChanged();
		notifyObservers();
	}

=======
	private void setCurrentTask(String currentTask)
	{
		this.currentTask = currentTask;
		setChanged();
        notifyObservers();
	}

	
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
	@Override
	public String toString() {
		return "ZooFoodServer [name=" + name + ", type=" + type + "]";
	}
}
