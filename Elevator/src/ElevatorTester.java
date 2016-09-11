
public class ElevatorTester {

	public static void main(String[] args)
	{
		System.out.println("Code only the methods you that are invoked!");
		System.out.println("*** Do NOT put line numbers in your code ***");
		
		Elevator car1 = new Elevator();
		System.out.println("Car1 info: " + car1);
		
		Elevator car2 = new Elevator(2, 8, false);
		System.out.println("Car2 info: " + car2);
		
		car1.goUp(5);
		System.out.println("Car1 info: " + car1);
		
		car2.setMaxPassengers(5);
		System.out.println("Car2 info: " + car2);
		
		car2.setMyGoingUp(true);
		System.out.println("Car2 info: " + car2);
		
	}

}


/*
 * Your output will match the output shown below


Code only the methods you that are invoked!
*** Do NOT put line numbers in your code ***
Car1 info: Elevator [maximum passengers=10, floor=1, elevator is going up=true]
Car2 info: Elevator [maximum passengers=2, floor=8, elevator is going up=false]
Car1 info: Elevator [maximum passengers=10, floor=6, elevator is going up=true]
Car2 info: Elevator [maximum passengers=5, floor=8, elevator is going up=false]
Car2 info: Elevator [maximum passengers=5, floor=8, elevator is going up=true]

*/