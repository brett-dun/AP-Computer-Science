public class AddressTester
{
   public static void main(String[] args)
   {
   
	   // Create a new address
      Address firstAddress = new Address();
      Address secondAddress = new Address();
      //Address secondAddress = new Address("2350 95th St", "Aurora", "IL", 60564);
   
      // Display the first address info.
      System.out.println("Street: " + firstAddress.getStreet());
      //System.out.println("City: " + firstAddress.getCity());
      System.out.println("State: " + firstAddress.getState());
      System.out.println("Zip: " + firstAddress.getZip());

      // Display the first address info using toString()
      System.out.println(firstAddress);

      // Display the second address info.
      System.out.println("Street: " + secondAddress.getStreet());
      //System.out.println("City: " + secondAddress.getCity());
      System.out.println("State: " + secondAddress.getState());
      System.out.println("Zip: " + secondAddress.getZip());

      //Modify some of the object fields   
      secondAddress.setStreet("2360 95th St");
      //secondAddress.setCity("Naperville");
      
   }
}  
