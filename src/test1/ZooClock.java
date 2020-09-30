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
	
}