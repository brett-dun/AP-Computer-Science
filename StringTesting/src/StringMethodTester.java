import java.util.Scanner;		// Make the Scanner library available to use
//import javax.swing.JOptionPane; // Make the JOptionPane library available to use

public class StringMethodTester {

	public static void main(String[] args) 

	{
		// Declare variables
		String firstName = "";
		@SuppressWarnings("unused")
		String middleName = "";
		@SuppressWarnings("unused")
		String lastName = "";
		@SuppressWarnings("unused")
		String fullName = "";
		String text = "";

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	// Create a Scanner object
		//Quick note about the Scanner class...
		//sc.next();		reads in a String value from the keyboard
		//sc.nextInt();		reads in an int value from the keyboard
		//sc.nextDouble();	reads in a double value from the keyboard
		//sc.nextLine();	reads in an entire line of text from the keyboard

		// Get the user's name
		System.out.print("Enter your first name: ");
		firstName = sc.next();
		text = StringMethods.proper(firstName);
		System.out.print("The proper name is " + text);
		//and so on to read from keyboard

		// Display full name to console window

		//********  Use this for alternative input/output **********************
		
		//Syntax for reading user input using a JOptionPane
		//firstName = JOptionPane.showInputDialog("Enter your first name");
		//text = StringMethods.proper(firstName);
		//Syntax for displaying output using a JOptionPane
		//JOptionPane.showMessageDialog(null, text); 


	}

}
