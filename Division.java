import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
    Scanner input = new  Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	if(number1 > number2) {
	System.out.printf("%d is the largest number %n", number1);
	}
	if(number2 > number1) {
	System.out.printf("%d is the largest number %n", number2);
	}
	
	if(number1 == number2 && number2 == number1) {
	System.out.printf("The result is 0");
	}

	if(number1 % 6 == number2 % 6) { 
	
	if(number1 < number2){
	System.out.printf("%d is the smallest number %n", number1);
	}
	if(number2 < number1) {
	System.out.printf("%d is the smallest number %n", number2);
	}
	}

	

   }
}