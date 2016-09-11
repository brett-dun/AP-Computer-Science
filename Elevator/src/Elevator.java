
public class Elevator {
	private int myMaximumPassengers, myFloor;
	private boolean isGoingUp;
	
	public Elevator() {
		myMaximumPassengers = 10;
		myFloor = 1;
		isGoingUp = true;
	}
	public Elevator(int maximumPassengers, int floor, boolean goingUp) {
		myMaximumPassengers = maximumPassengers;
		myFloor = floor;
		isGoingUp = goingUp;
	}
	
	public void goUp(int floor) {
		myFloor = myFloor + floor;
	}
	public void setMaxPassengers(int maxPassengers) {
		myMaximumPassengers = maxPassengers;
	}
	public void setMyGoingUp(boolean goingUp) {
		isGoingUp = goingUp;
	}
}
