import java.util.Scanner;
import java.util.Random;

public class RpsModified{
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	Random random1 = new Random();
	int choiceWinCounter = 0;
	int comWinsCounter = 0; 	

	while(Math.abs(comWinsCounter - choiceWinCounter) < 3){

		System.out.print("Scissors (0) Rock (1) Paper (2): ");
		int choice = input.nextInt();
		int comGuess = random1.nextInt(3);
	

		if(choice < 0 || choice > 2) {
			System.out.println("INVALID INPUT NIGGA");
		}
		else{
	
 		if(comGuess == 0){
			System.out.print("The computer is Scissors. ");
		} 

		if(comGuess == 1) {
			System.out.print("THe computer is Rock. ");
		}
	
		if(comGuess == 2) {
			System.out.print("The computer is Paper. ");
		}
	
		if(choice == 0) {
			System.out.print("You are Scissors. ");
		}
	
		if(choice == 1) {
			System.out.print("You are Rock. ");
		}
	
		if(choice == 2) {
			System.out.print("You are Paper. ");
		}


	
		if(choice == comGuess) {
			System.out.println("It's a draw");
		}

		if(choice == 0 && comGuess == 1) {
			System.out.println("Computer won");
			comWinsCounter = comWinsCounter + 1;
		}
		if(choice == 2 && comGuess == 0) {
			System.out.println("Computer won");
			comWinsCounter = comWinsCounter + 1;
		}
		if(choice == 1 && comGuess == 2) {
			System.out.println("Computer won");
			comWinsCounter = comWinsCounter + 1;
		}

		if(choice == 1 && comGuess == 0) {
			System.out.println("You won");
			choiceWinCounter = choiceWinCounter + 1;
		}
		if(choice == 0 && comGuess == 2) {
			System.out.println("You won");
			choiceWinCounter = choiceWinCounter + 1;
		}
		if(choice == 2 && comGuess == 1) {
			System.out.println("You won");
			choiceWinCounter = choiceWinCounter + 1;
		}
		
		}


  	 }
	System.out.println("The Computer Won: " + comWinsCounter + " times " + " You Won: " + choiceWinCounter + " times ");
	System.out.println("GAME OVER NIGGA");





   }

}