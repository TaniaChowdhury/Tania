import java.util.Scanner;

/*      write a number that reads  three whole numbers and display the average 
 of the three numbers          
 */

public class average {
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter three numbers: ");
		float num1 = keyboard.nextInt();
		float num2 = keyboard.nextInt();
		float num3 = keyboard.nextInt();
		
		float average = num1+num2+num3;
		
		System.out.println("the average of the numbers is :" + average );
		
		
	}
	

}
