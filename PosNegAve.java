import java.util.Scanner;

public class PosNegAve {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


	int positiveCounter = 0;
	int negativeCounter = 0;
	int total = 0;
	int counter = 0;
	int number = 0;


	do{
		System.out.print("Enter a positive or negative integer and enter 0 to end: ");
		number = input.nextInt();

		if(number > 0){
			positiveCounter++;
		}

		if(number < 0){
			negativeCounter++;
			 
		}
		if(number != 0){
		counter++;
		}
		total = total + number;

	}
	while(number != 0);
	
	double sum = (double) total;	
	double average = (double) total / counter;
	
if(counter == 0) System.out.println("No numbers are entered except 0");
else{


System.out.println("The number of Positive integer is: " + positiveCounter);
System.out.println("The number of Negative integer is: " + negativeCounter);
System.out.println("The total number of integer is: " + sum);
System.out.println("The average of the integer is: " + average);

}
	

   }
}