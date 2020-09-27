package test1;

public class Dog extends Canine{
	// This is delegating dog sleep behavior
	SleepBehavior sleepBehavior;
	
	public Dog(String name, SleepBehavior sleepBehavior){
		
		super(name,"dog");
		
		this.sleepBehavior = sleepBehavior;
	}
	
	@Override
	public void sleep() {
		sleepBehavior.sleep(name, type);
	}
}
