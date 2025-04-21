import java.util.Scanner;
public class Padd {
	public static void main(String [] args){
	  Scanner input = new Scanner(System.in);

	  System.out.print("Enter first integer: ");
	  int number1 = input.nextInt();
	  
	  System.out.print("Enter second integer: ");
	  int number2 = input.nextInt();

	 int sum = number1 + number2;
	 int product = number1 * number2;
	 int average = (number1 + number2)/2;
	 int difference = number1 - number2;
	
	if(number1 > number2){
	   System.out.printf("The max integer is %d%n", number1);
	}
	if(number1 < number2) {
	   System.out.printf("The max integer is %d%n", number2);
	}
	if (number2 > number1){
	    System.out.printf("The min integer is %d%n", number1);
	}
	if(number2 < number1){
	   System.out.printf("The min integer is %d%n", number2);
	}


	  System.out.printf("The sum of the intergers is %d%n", sum);
	  System.out.printf("The product of the intergers is %d%n", product);
	  System.out.printf("The average of the intergers is %d%n", average);
	  System.out.printf("The distance of the intergers is %d%n", difference);
   }

}