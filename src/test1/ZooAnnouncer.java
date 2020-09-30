package test1;

import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

public class ZooAnnouncer implements Observer {
	private ZooFoodServer zooFoodServer;
	private ZooKeeper zooKeeper;

	

	@Override
	public void update(Observable observable, Object arg) {

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
	}
}
