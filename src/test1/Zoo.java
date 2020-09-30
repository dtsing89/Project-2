package test1;

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class Zoo {

	public static void main(String[] args) throws IOException {
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of days");
		String dayString = input.nextLine();
		int days = Integer.parseInt(dayString);
		
		
		//creating ZooEmployee objects
		ZooClock clock = new ZooClock(8); //starts at 8
		ZooKeeper zookeeper = new ZooKeeper("David");
		ZooAnnouncer zooAnnouncer = new ZooAnnouncer();
		zookeeper.addObserver(zooAnnouncer);
		ZooFoodServer server = new ZooFoodServer("Frank");
		server.addObserver(zooAnnouncer);

		
		//creating animals
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
			
			
			printWords("The zookeeper has arrived at " + clock.getClockStatus() + ":00 hours");
			
			
			clock.iterateClock(); //9 o'clock
			
			
			printWords("The animals are starting to wake at " + clock.getClockStatus() + ":00 hours");
			
			
			//wake animal calls
			zookeeper.wakeAnimal(cat);
			zookeeper.wakeAnimal(tiger);
			zookeeper.wakeAnimal(dog);
			zookeeper.wakeAnimal(wolf);
			zookeeper.wakeAnimal(lizard);
			zookeeper.wakeAnimal(snake);
			zookeeper.wakeAnimal(hippo);
			zookeeper.wakeAnimal(rhino);
			

			clock.iterateClock(); //10 o'clock
			clock.iterateClock(); //11 o'clock
			

			//System.out.println("The animals are being called at " + clock.getClockStatus() + ":00 hours");
			printWords("The animals are being called at " + clock.getClockStatus() + ":00 hours");


			//call animal calls
			zookeeper.callAnimal(cat);
			zookeeper.callAnimal(tiger);
			zookeeper.callAnimal(dog);
			zookeeper.callAnimal(wolf);
			zookeeper.callAnimal(lizard);
			zookeeper.callAnimal(snake);
			zookeeper.callAnimal(hippo);
			zookeeper.callAnimal(rhino);
			
			
			clock.iterateClock(); //12 o'clock
			
			
			//food server calls
			server.make();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.serve();
			server.make();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.serve();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			
			
			clock.iterateClock(); //1 o'clock
			printWords("The animals are being fed at " + clock.getClockStatus() + ":00 hours");

			
			//feed animal calls
			zookeeper.feedAnimal(cat);
			zookeeper.feedAnimal(tiger);
			zookeeper.feedAnimal(dog);
			zookeeper.feedAnimal(wolf);
			zookeeper.feedAnimal(lizard);
			zookeeper.feedAnimal(snake);
			zookeeper.feedAnimal(hippo);
			zookeeper.feedAnimal(rhino);
			
			
			clock.iterateClock(); //2 o'clock
			clock.iterateClock(); //3 o'clock
			
			
			printWords("The animals are exercising at " + clock.getClockStatus() + ":00 hours");
			printWords("The animals are being exercised " + clock.getClockStatus() + ":00 hours");

			
			//exercise animal calls
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

			random = zookeeper.rand();

			if (random <= 30) {
				zookeeper.exerciseAnimal(cat);
			} else if (random > 30 && random <= 60) {
				zookeeper.callAnimal(cat);
			} else {
				zookeeper.sleepAnimal(cat);
			}


			//food server calls
			server.clean();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.make();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.serve();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.clean();

			server.clean();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.make();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.serve();
			printWords(" at " + clock.getClockStatus() + ":00 hours");
			server.clean();

			printWords(" at " + clock.getClockStatus() + ":00 hours");

			random = zookeeper.rand();

			if (random <= 30) {
				zookeeper.exerciseAnimal(tiger);
			} else if (random > 30 && random <= 60) {
				zookeeper.callAnimal(tiger);
			} else {
				zookeeper.sleepAnimal(tiger);
			}
			
			
			clock.iterateClock(); //4 o'clock
			clock.iterateClock(); //5 o'clock
			

			printWords("The animals are being put to sleep " + clock.getClockStatus() + ":00 hours");

			
			//sleep animal calls
			zookeeper.sleepAnimal(dog);
			zookeeper.sleepAnimal(wolf);
			zookeeper.sleepAnimal(lizard);
			zookeeper.sleepAnimal(snake);
			zookeeper.sleepAnimal(hippo);
			zookeeper.sleepAnimal(rhino);
			
			clock.iterateClock(); //6 o'clock
			clock.iterateClock(); //7 o'clock
			clock.iterateClock(); //8 o'clock

			
			printWords("The zookeeper is leaving for the day at " + clock.getClockStatus() + ":00 hours");
			
			zookeeper.leave(i+1);
			
			clock.resetClock();
		}
		
	}
	
	
	public static void printWords(String words) throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out", true);
		writer.write(words);
		writer.write("\n");
		writer.close();
	}
}