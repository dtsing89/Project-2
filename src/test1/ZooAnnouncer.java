package test1;

import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

public class ZooAnnouncer implements Observer {
	
	private ZooKeeper zooKeeper;
	private ZooFoodServer zooFoodServer;
	

	@Override
	public void update(Observable observable, Object arg) {
		zooKeeper = (ZooKeeper) observable;
		System.out.println("Hi this is the zoo announcer. Zookeeper is about to " + zooKeeper.getCurrentTask());
		//System.out.println("ZooFoodServer is serving food");
		
		zooFoodServer = (ZooFoodServer) observable;
		System.out.println("Hi this is the zoo announcer. ZooFoodServer is about to serve food" + zooFoodServer.getCurrentTask());

	}
	
	
//	public void update2(Observable observable, Object arg) {
//		zooFoodServer = (ZooFoodServer) observable;
//		System.out.println("Hi this is the zoo announcer. ZooFoodServer is about to serve food" + zooFoodServer.getCurrentTask());
//	}
	
//	public void update(Observable o, Object arg) {
//		try {
//			Method update = getClass().getCurrentTask(o.getClass(), Object.class);
//			update.invoke(this, o, arg);
//			
//		} catch (Exception e) {
//			//exception
//		}
//	}
	
	
}
