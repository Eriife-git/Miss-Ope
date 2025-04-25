import java.util.Scanner;

public class SecondHighestScore {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	
	String highestScoreName = " "; 

	int  largestNumber = -23456678;

	String secondHighestScoreName = " ";
	int secondLargestNumber = -23456678;
	 


	System.out.print("Enter the number of students: ");
	int number = input.nextInt();
			

	for(int counter = 1; counter <= number; counter = counter + 1) {
		
		
		System.out.print("Enter the student's name: ");
		String name = input.next();

		System.out.print("Score: ");
		int score = input.nextInt();

		if (score > largestNumber) {

			secondLargestNumber = largestNumber;
			secondHighestScoreName = highestScoreName;

			largestNumber = score;
			highestScoreName = name;
		}
		else
		if(score == largestNumber) {
			 largestNumber = score;
			 highestScoreName = highestScoreName + " and " + name;

		}
		else
		if(score > secondLargestNumber) {
			secondLargestNumber = score;
			secondHighestScoreName = name; 
		}
		else
		if(score == secondLargestNumber){
			 secondLargestNumber = score;
			 secondHighestScoreName = secondHighestScoreName + " and " + name;
		}
			
	}

	if(number <= 0) {
	System.out.print("Invalid input, Enter a valid input!");
	}	
	else{
		System.out.println("The student with the highest score is " + highestScoreName + " with the score " + largestNumber);
		System.out.println("The student with the second highest score is " + secondHighestScoreName + " with the score " + secondLargestNumber);

	}



   }
}