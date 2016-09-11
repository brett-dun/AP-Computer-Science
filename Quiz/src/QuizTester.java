
public class QuizTester 
{
	public static void main(String[] args)
	{
		//Demonstrate the default constructor and its corresponding values:
		Quiz firstQuiz = new Quiz();
		
		System.out.println("Quiz [Name=" + firstQuiz.getName() + ", " + 
						   "myRetake=" + firstQuiz.isRetake() + 
						   ", PointsAvailable=" + firstQuiz.getPointsAvailable() + 
						   ", PointsEarned=" + firstQuiz.getPointsEarned()+ 
						   ", NumQuestions=" + firstQuiz.getNumQuestions() + 
						   ", TimeAllowed=" + firstQuiz.getTimeAllowed() + 
						   ", Period=" + firstQuiz.getPeriod() + "]");
		//Will print:
		//Quiz [Name=Untitled, myRetake=false, PointsAvailable=30.0, PointsEarned=30.0, 
		//		NumQuestions=10, TimeAllowed=42, Period=1]
		
		//Demonstrate the parameterized constructor: 
		Quiz secondQuiz = new Quiz("Chapter 3", true, 50, 40, 25, 30, 4);
		
		System.out.println("Quiz [Name=" + secondQuiz.getName() + ", " + 
						   "Retake=" + secondQuiz.isRetake() + 
						   ", PointsAvailable=" + secondQuiz.getPointsAvailable() + 
						   ", PointsEarned=" + secondQuiz.getPointsEarned()+ 
						   ", NumQuestions=" + secondQuiz.getNumQuestions() + 
						   ", TimeAllowed=" + secondQuiz.getTimeAllowed() + 
						   ", Period=" + secondQuiz.getPeriod() + "]");
		//Will print:
		//Quiz [Name=Chapter 3, Retake=true, PointsAvailable=50.0, PointsEarned=40.0, 
		//		NumQuestions=25, TimeAllowed=30, Period=4]
		
		//Test additional methods
		secondQuiz.changeTimeAllowed(28);
		System.out.println("This quiz will now have " + secondQuiz.getTimeAllowed() +
						   " minutes allowed for students to complete.");
		
		//Will print:
		//This quiz will now have 28 minutes allowed for students to complete.
		
		secondQuiz.setRetake(false);
		System.out.println("This quiz can be retaken: " + secondQuiz.isRetake());

		//Will print:
		//This quiz can be retaken: false
		
	}
}
