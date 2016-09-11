
public class Quiz {
	private String myName;
	private boolean myRetake;
	private double myPointsAvailable, myPointsEarned;
	private int myQuestions, myTimeAllowed, myPeriod;
	
	public Quiz() {
		myName = "Untitled";
		myRetake = false;
		myPointsAvailable = 30.0;
		myPointsEarned = 30.0;
		myQuestions = 10;
		myTimeAllowed = 42;
		myPeriod = 1;
	}
	public Quiz(String name, boolean retake, double pointsAvailable, double pointsEarned, int questions, int time, int period) {
		myName = name;
		myRetake = retake;
		myPointsAvailable = pointsAvailable;
		myPointsEarned = pointsEarned;
		myQuestions = questions;
		myTimeAllowed = time;
		myPeriod = period;
	}
	
	public String getName() {
		return myName;
	}
	public boolean isRetake() {
		return myRetake;
	}
	public double getPointsAvailable() {
		return myPointsAvailable;
	}
	public double getPointsEarned() {
		return myPointsEarned;
	}
	public int getNumQuestions() {
		return myQuestions;
	}
	public int getTimeAllowed() {
		return myTimeAllowed;
	}
	public int getPeriod() {
		 return myPeriod;
	}
	
	public void changeName(String Name) {
		myName = Name;
	}
	public void setRetake(boolean Retake) {
		myRetake = Retake;
	}
	public void changePointsAvailable(double pointsAvailable) {
		myPointsAvailable = pointsAvailable;
	}
	public void changePointsEarned(double pointsEarned) {
		myPointsEarned = pointsEarned;
	}
	public void changeTimeAllowed(int time) {
		myTimeAllowed = time;
	}
	public void changePeriod(int period) {
		myPeriod = period;
	}
}
