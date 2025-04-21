import java.util.Scanner;

public class TrueDis {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	System.out.print("Enter third integer: ");
	int number3 = input.nextInt();

	System.out.print(number2 > number1 && number3 > number2);
	


   }
}