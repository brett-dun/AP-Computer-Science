//Use this class as a tester to a balloon class (Balloon.java)

//Implement the fields and the public interface to the Balloon class to make the 
//tester class work properly and according the the sample output.

//There is no .pdf write-up to accompany this class

//Submit your solution to the link provided on the calendar

public class BalloonTester 
{
	public static void main(String[] args)
	{
		Balloon bubble = new Balloon();
		Balloon bubble2 = new Balloon("blue", 2, "paper", false, 15);
	
		//Demonstrate the default constuctor and its corresponding values:
		System.out.println("Balloon [color=" + bubble.getColor() + 
						   ", volume=" + bubble.getVolume() + 
						   ", material="+ bubble.getMaterial() + 
						   ", cord=" + bubble.hasCord()  + 
						   ", altitude=" + bubble.getAltitude() + "]");
						  
		//Will print:
		//Balloon [color=red, volume=5.0, material=latex, cord=true, altitude=0]
		
		//Demonstrate the parameterized constuctor: 
		System.out.println("Balloon [color=" + bubble2.getColor() + 
				   ", volume=" + bubble2.getVolume() + 
				   ", material="+ bubble2.getMaterial() + 
				   ", cord=" + bubble2.hasCord()  + 
				   ", altitude=" + bubble2.getAltitude() + "]");
		//Will print:
		//Balloon [color=blue, volume=2.0, material=paper, cord=false, altitude=15]

		
		//Test the additional methods of the balloon:
		bubble.ascend(17);
		bubble2.descend(3);
		
		System.out.println("The first balloon, bubble, is at an altitude of " +
						   bubble.getAltitude() + " feet");
		
		//Will print:
		//The first balloon, bubble, is at an altitude of 17 feet
		
		
		System.out.println("The second balloon, bubble2, is at an altitude of " +
				   bubble2.getAltitude() + " feet");
		// second balloon, bubble2, is at an altitude of 12 feet
		
	}
	
}
