import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	Random random1 = new Random();
 	
	System.out.print("Scissors (0) Rock (1) Paper (2): ");
	int choice = input.nextInt();
	int comGuess = random1.nextInt(3);
	


	if(choice < 0 || choice > 2) {
	System.out.print("INVALID INPUT NIGGA");
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
	System.out.print("It's a draw");
	}

	if(choice == 0 && comGuess == 1) {
	System.out.print("Computer won");
	}
	if(choice == 1 && comGuess == 0) {
	System.out.print("You won");
	}
	if(choice == 0 && comGuess == 2) {
	System.out.print("You won");
	}
	if(choice == 2 && comGuess == 0) {
	System.out.print("Computer won");
	}
	if(choice == 1 && comGuess == 2) {
	System.out.print("Computer won");
	}
	if(choice == 2 && comGuess == 1) {
	System.out.print("You won");
	}



	}
   }
}