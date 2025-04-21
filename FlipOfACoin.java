import java.util.Scanner;
import java.util.Random;

public class FlipOfACoin {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	Random random = new Random();
 	
	System.out.print("Head (0) or Tail (1): ");
	double choice = input.nextDouble();

	int sideOfCoin = random.nextInt(2);

	
	if(choice == 0 && sideOfCoin == 0) {
	System.out.print("Yes,it landed on Heads");
	}
	else 
	if(choice == 1 && sideOfCoin == 1){
	System.out.print("Yes, it landed on tails");
	}
	else 
	if(choice == 0 && sideOfCoin == 1){
	System.out.print("No, it landed on tails");
	}
	else 
	if(choice == 1 && sideOfCoin == 0){
	System.out.print("No, it landed on Heads");
	}
	else {
	System.out.print("Ode its not possible");
	
	}


   }
}