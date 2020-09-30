package test1;

public class ZooClock {
	int clockStatus;
	
	public ZooClock(int clockStatus) {
		this.clockStatus = clockStatus;
	}
	
	public void iterateClock() {
		clockStatus++;
	}
	
	public void resetClock() {
		clockStatus = 8;
	}
	
	public int getClockStatus() {
		return clockStatus;
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 3f2eae37f8a91066543ffb761b34eac5a1206973
