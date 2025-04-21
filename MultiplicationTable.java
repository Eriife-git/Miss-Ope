import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter a positive integer: ");
	int number = input.nextInt();
	
	if(number > 0){

		int counter = 1; 
	
		while(counter <= 12){

			int answer = number * counter;

			System.out.println(number + " * " + counter + " = " + answer);

			counter = counter + 1;
	 
		}

	}
	else{
	System.out.print("GET OUT!");
	}



   }
}