import java.util.Scanner;

public class HighestScore {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	
	String highestScoreName = " "; 
	int largestNumber = -23456678;


	System.out.print("Enter the number of students: ");
	int number = input.nextInt();
			

	for(int counter = 1; counter <= number; counter = counter + 1) {
		
		
		System.out.print("Enter the another name: ");
		String name = input.next();
		System.out.print("Score: ");
		int score = input.nextInt();

		if (score > largestNumber) {
			
				largestNumber = score;
				highestScoreName = name;
		}
		else
		if(score == largestNumber) {
			 largestNumber = score;
			 highestScoreName = highestScoreName + " and " + name;
		}
		
	}

	if(number <= 0) {
	System.out.print("Invalid input, Enter a valid input!");
	}	
	else{
		System.out.println("The highest score is: " + largestNumber);

		System.out.println("Student with the highest score is:  "+ highestScoreName);

	}



   }
}