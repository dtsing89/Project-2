package test1;

public class DogSleepBehavior implements SleepBehavior {

	@Override
	public void sleep(String name, String type) {
		System.out.println(name + "  the " + type + " sleeps.");

	}

}
