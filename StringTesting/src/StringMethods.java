
public class StringMethods 
{

	public static String proper(String text)
	{
		//precondition: text.length() > 0
		//postcondition: returns the proper form of the name
		//   - first letter capitalized the rest of the name lower
		
		return text;
	}
		
	public static String emailGenerator(String first, String last, String organization) {
		String text;
		text = first.substring(0,1) + last;
		int random = (int) (Math.random() * 20 );
		text = text + random + "@" + organization + ".org";
		return text;
	}
	
	public static String letterRearranger(String text) {
		text = text.substring(text.length()) + text.substring(0,text.length());
		return text;
	}
	
	public static String letterReplace(String text, char one, char two) {
		text = text.replace(one, two);
		return text;
	}
	
	/*Other Methods:
		1. Create an email address: receive first name, last name and "@xxxxx.org"
	   		Ex.  first-> Bob  	last-> Smith	organization-> ipsd  
	        returns BSmith15@ipsd.org		Note: the 15 is a randomly generated int [1,20]
	
		2. Letter rearrranger that receives a name and returns the first letter last
			Ex.  name -> Fred
			returns Redf		Note the capitalization
			
		3. Letter replace will receive a string and two characters and replaces all occurrences
		   of the first character in the string with the second character
		   Ex.  text-> mystery 	character1 -> y		character2 -> k
		   returns mksterk		
	
	*/
	
}
