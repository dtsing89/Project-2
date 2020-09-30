package test1;

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class Zoo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of days");
		String dayString = input.nextLine();
		int days = Integer.parseInt(dayString);
		
		ZooClock clock = new ZooClock(8); //starts at 8

		ZooKeeper zookeeper = new ZooKeeper("David");
		ZooAnnouncer zooAnnouncer = new ZooAnnouncer();
		zookeeper.addObserver(zooAnnouncer);
<<<<<<< HEAD
		ZooFoodServer zoofoodserver = new ZooFoodServer("Frank");
		zoofoodserver.addObserver(zooAnnouncer);
=======
		ZooFoodServer server = new ZooFoodServer("Frank");
		server.addObserver(zooAnnouncer);
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973

		Cat cat = new Cat("Charlie");
		Tiger tiger = new Tiger("Tom");
		Dog dog = new Dog("Dug",new DogSleepBehavior());
		Wolf wolf = new Wolf("Wendy");
		Lizard lizard = new Lizard("Lilly");
		Snake snake = new Snake("Sam");
		Hippo hippo = new Hippo("Harry");
		Rhino rhino = new Rhino("Rick");

		for (int i = 0; i < days; i++) {
			System.out.println("Zookeeper arrives at Zoo on Day " + days);
			int random = zookeeper.rand();

			zookeeper.arrive(i+1);
			
			System.out.println("The zookeeper has arrived at " + clock.getClockStatus() + ":00 hours");
			clock.iterateClock();
			
			System.out.println("The animals are starting to wake at " + clock.getClockStatus() + ":00 hours");
			
			zookeeper.wakeAnimal(cat);
			zookeeper.wakeAnimal(tiger);
			zookeeper.wakeAnimal(dog);
			zookeeper.wakeAnimal(wolf);
			zookeeper.wakeAnimal(lizard);
			zookeeper.wakeAnimal(snake);
			zookeeper.wakeAnimal(hippo);
			zookeeper.wakeAnimal(rhino);
			
			clock.iterateClock();
			clock.iterateClock();
			System.out.println("The animals are being called at " + clock.getClockStatus() + ":00 hours");


			zookeeper.callAnimal(cat);
			zookeeper.callAnimal(tiger);
			zookeeper.callAnimal(dog);
			zookeeper.callAnimal(wolf);
			zookeeper.callAnimal(lizard);
			zookeeper.callAnimal(snake);
			zookeeper.callAnimal(hippo);
			zookeeper.callAnimal(rhino);
			
			clock.iterateClock();
			
<<<<<<< HEAD
			zoofoodserver.make();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			zoofoodserver.serve();
=======
			server.make();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			server.serve();
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			
			clock.iterateClock();
			System.out.println("The animals are being fed at " + clock.getClockStatus() + ":00 hours");

			zookeeper.feedAnimal(cat);
			zookeeper.feedAnimal(tiger);
			zookeeper.feedAnimal(dog);
			zookeeper.feedAnimal(wolf);
			zookeeper.feedAnimal(lizard);
			zookeeper.feedAnimal(snake);
			zookeeper.feedAnimal(hippo);
			zookeeper.feedAnimal(rhino);
			
			
			clock.iterateClock();
			clock.iterateClock();
<<<<<<< HEAD
			System.out.println("The animals are exercising at" + clock.getClockStatus() + ":00 hours");
=======
			System.out.println("The animals are being exercised " + clock.getClockStatus() + ":00 hours");
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973

			zookeeper.exerciseAnimal(cat);
			zookeeper.exerciseAnimal(tiger);
			if (random > 25) {
				zookeeper.exerciseAnimal(dog);
			} else {
				zookeeper.dig(dog);
			}
			zookeeper.exerciseAnimal(wolf);
			zookeeper.exerciseAnimal(lizard);
			zookeeper.exerciseAnimal(snake);

			if (random > 25) {
				zookeeper.exerciseAnimal(hippo);
			} else {
				zookeeper.charge(hippo);
			}

			if (random > 25) {
				zookeeper.exerciseAnimal(rhino);
			} else {
				zookeeper.charge(rhino);
			}

			//////

			random = zookeeper.rand();

			if (random <= 30) {
				zookeeper.exerciseAnimal(cat);
			} else if (random > 30 && random <= 60) {
				zookeeper.callAnimal(cat);
			} else {
				zookeeper.sleepAnimal(cat);
			}

			//////
<<<<<<< HEAD
			zoofoodserver.clean();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			zoofoodserver.make();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			zoofoodserver.serve();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			zoofoodserver.clean();
=======
			server.clean();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			server.make();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			server.serve();
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");
			server.clean();
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
			System.out.println(" at " + clock.getClockStatus() + ":00 hours");

			random = zookeeper.rand();

			if (random <= 30) {
				zookeeper.exerciseAnimal(tiger);
			} else if (random > 30 && random <= 60) {
				zookeeper.callAnimal(tiger);
			} else {
				zookeeper.sleepAnimal(tiger);
			}
			
			clock.iterateClock();
			clock.iterateClock();
			
			///////////
			
<<<<<<< HEAD
			System.out.println("The animals are being put to sleep " + clock.getClockStatus() + ":00 hours");
=======
			System.out.println("The animals are being put to sleep " + clock.getClockStatus() + " hours");
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973

			zookeeper.sleepAnimal(dog);
			zookeeper.sleepAnimal(wolf);
			zookeeper.sleepAnimal(lizard);
			zookeeper.sleepAnimal(snake);
			zookeeper.sleepAnimal(hippo);
			zookeeper.sleepAnimal(rhino);
			
			clock.iterateClock();
			clock.iterateClock();
			clock.iterateClock();
<<<<<<< HEAD
			System.out.println("The zookeeper is leaving for the day at " + clock.getClockStatus() + ":00 hours");
=======
			System.out.println("The zookeeper is leaving for the day at " + clock.getClockStatus() + " hours");
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
			
			zookeeper.leave(i+1);
			
			clock.resetClock();
<<<<<<< HEAD
=======

>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
		}
	}
}