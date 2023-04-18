
// -------------------------------------------------------------------------------
// Test project - Multitool
// Written by: Noah Shoebridge ID: 40226459
// For testing purposes - Jan 21st 2021
// ---------------------------------------------------------------------------------

/* This program is meant to practice a couple of things. Firstly, it practices using the Scanner module more, but also uses the new Math module.
 * What differs about this program is the implementation of if statements, for loops and additional functions. I think I now understand some of the basics around for loops
 * functions, and defining different variables. For this program, I'd like to revisit and allow the area calculator to separate unit from the # of units.
 * EX: 100cm would turn into 100 and "cm". */

import java.util.Scanner;

import static java.lang.Math.*;

public class CalculateCircles {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Multitool :)"
				+ "\n\n-------------------------------------"
				+ "\n\nPlease Enter What you would like to do:"
				+ "\n1 = Area Calculator" 
				+ "\n2 = For Loop Example"
				);
		
		
		int first_choice = input.nextInt(); 

		//Decides which part of the tool you want to use.
		
		if(first_choice == 1) { // Area tool
			
			System.out.println("-- You have Chosen the Area Calculator --"
					+ "\nPlease Choose what shape area you'd like to calculate:"
					+ "\n 1: Circle"
					+ "\n 2: Square"
					);
			
			int shape_choice = input.nextInt();
			
			if (shape_choice == 1 ) { // Decides which shape area you would like to calculate.
				
				System.out.println("~~~ CIRCLE AREA CALCULATOR ~~~"
						+ "\nEnter the radius of the Circle:" ); // I should allow the program to identify unit entered and be able to parse out the number and also unit.
				
				int circle_radius = input.nextInt();
				area_calc(circle_radius,1);
				
			} else if (shape_choice == 2) {
				
				System.out.println("~~~ SQUARE AREA CALCULATOR ~~~"
						+ "\nEnter the side length of your Square:");
				
				int square_side = input.nextInt();
				area_calc(square_side,2);
				
			} 

		} else if (first_choice == 2) { // For Loop Example
			
			System.out.println("-- You have chosen the For Loop Example --"
					+ "\n How many layers should your triangle have?");
					int layers = input.nextInt();
			
					String layer_symbols = "";
					System.out.print("\n");
					for (int i = 0; i<layers; i++) {
						System.out.println(layer_symbols += "I");
					}
				
		} else { // Error Response
			
			System.out.println("This is not a valid choice, Terminating program.");
			
		}
	}

	static void area_calc(int user_input,int shape_choice) { // Function to calculate Areas
		
		if (shape_choice == 1) {
		
			double calc = Math.PI * (user_input * user_input);
			System.out.println("\nThe Area of your circle is: " + calc);
			
		} else if (shape_choice == 2) {
			double calc_2 = (user_input * user_input);
			System.out.println("\nThe Area of your Square is: " + calc_2);
			
		} 
	}
	
}
