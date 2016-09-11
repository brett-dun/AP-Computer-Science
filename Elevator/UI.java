/*		x # of years
 * 		 life Length
 * 			Natural Selection Factor (physical trait and disease)
 * 		
 * 		
 * 
 * 
 * 
 */
import java.util.Scanner;
public class UI {
	public int x;
	
	
		public UI(){
				
			
		}
		
		public void setYear(){
			
			System.out.println("Number of years:");
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
		}	
		
		public int getYear(){
			return x;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
