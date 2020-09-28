package test1;

import java.util.Observable;
import java.util.Observer;

public class ZooAnnouncer implements Observer {
	
	private ZooKeeper zooKeeper;

	@Override
	public void update(Observable observable, Object arg) {
		zooKeeper = (ZooKeeper) observable;
		System.out.println("Hi this is the zoo announcer. Zookeeper is about to " + zooKeeper.getCurrentTask());
	}
}
