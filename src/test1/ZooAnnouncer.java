package test1;

import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

public class ZooAnnouncer implements Observer {
	private ZooFoodServer zooFoodServer;
	private ZooKeeper zooKeeper;
	private ZooFoodServer zooFoodServer;
	

	@Override
	public void update(Observable observable, Object arg) {
<<<<<<< HEAD
		if (observable instanceof ZooKeeper)
		{
			zooKeeper = (ZooKeeper) observable;
			System.out.println("Hi this is the zoo announcer. Zookeeper is about to " + zooKeeper.getCurrentTask());
		}
		// it's a ZooFoodServer
		else
		{
			zooFoodServer = (ZooFoodServer) observable;
			System.out.println("Hi this is the zoo announcer. Zoofoodserver is about to " + zooFoodServer.getCurrentTask());
		}
=======
		zooKeeper = (ZooKeeper) observable;
		System.out.println("Hi this is the zoo announcer. Zookeeper is about to " + zooKeeper.getCurrentTask());
		//System.out.println("ZooFoodServer is serving food");
		
		zooFoodServer = (ZooFoodServer) observable;
		System.out.println("Hi this is the zoo announcer. ZooFoodServer is about to serve food" + zooFoodServer.getCurrentTask());

>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
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
