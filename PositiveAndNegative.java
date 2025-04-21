import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	int product = number1 * number2;
	int sum = number1 + number2;
	
	if(number1 > 0 && number2 > 0) {
	System.out.println("The product is " + product);
	} 
	else if(number1 <  0 && number2 < 0) {
	System.out.print("The product is " + product); 
	}
	else {
	System.out.print("The sum is " + sum);
	}	


   }
}