//Application:   Program 2
//Name:			 Kendall Chandler
//Github User:   kendallchandler
//Date: 		 Sep 22, 2022
//Version:       1.0
//Description:   Second program practicing conditionals


//initialize scanner to be used later
	import java.util.Scanner;


public class chandlerProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use the scanner to ask the user for their numbers
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your first number?  ");
		int number = keyboard.nextInt();
		System.out.print("What is your second number?  ");
		int second = keyboard.nextInt();
		System.out.print("What is your third number?  ");
		int third = keyboard.nextInt();
		int operation = 0;
		
		
		//add a menu of choices for the user to select from
		
		System.out.println("Menu of Actions: \n\t1.) Add \n\t2.) Subtract \n\t3.) Multiply \n\t4.) Divide");
		
		System.out.print("Menu Choice?   ");
		int choice = keyboard.nextInt();
		
		
		
		//use a switch statement to perform the actions picked by the user
		
		
		switch(choice){
			case 1:
				operation = number + second;
				System.out.println("Your numbers added together equal: " + operation);
				break;
			case 2:
				operation = number - second;
				System.out.println("Your numbers subtracted together equal: " + operation);
				break;
			case 3:
				operation = number * second;
				System.out.println("Your numbers multiplied together equal: " + operation);
				break;
			case 4:
				operation = number / second;
				System.out.println("Your numbers divided together equal: " + operation);
				break;
		}
			
		
		
		
		//use if statements to determine if the number made by the user is greater than or less than the third number
		
		if (operation > third)
			System.out.println(operation + " is greater than " + third);
		
		
		
		
		if (operation < third)
			System.out.println(operation + " is not greater than " +third);
		
		
		
	}

}
