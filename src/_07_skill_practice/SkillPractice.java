package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		
			SkillPractice skills = new SkillPractice();
			           skills.skill1();
			           skills.skill2();
			           skills.skill3();
			           skills.skill4();
			           skills.skill5();
			}

			void skill1() {
			// Use pop-ups for the following.
			// Ask the user how many dimes they have

				//String eee = JOptionPane.showInputDialog("how many dimes u have?");


			// Tell them how many cents they have (hint multiply by 10)
				//int eeee = Integer.parseInt(eee);
				//int ee = eeee * 10;
				//JOptionPane.showMessageDialog(null, "you have " + ee + " cents");


			// Ask the user how tall they are (inches)
				//String e = JOptionPane.showInputDialog("how tall r u?");



			// If they are shorter than 36 inches, tell them to eat their Wheaties
				//int bruh = Integer.parseInt(e);
				//if(bruh < 36) {
					//JOptionPane.showMessageDialog(null, "eat ur wheaies bruh");
				//}



			}

			void skill2() { // Write a loop to print every third number between 1 and 30 to the console
				//int b = 3;
				//for(int i = 0; i < 10; i++) {
					//System.out.println(b);
					//b = b + 3;
				//}






			}

			void skill3() { // Get a random number that is less than 20 and print it to the console
//				Random mom = new Random();
//				int ree = mom.nextInt(20);
//				System.out.println(ree);
			// Get another random number that is less than 10 and print it to the console
//				Random mo = new Random();
//				int re = mo.nextInt(10);
//				System.out.println(re);


			// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
//				int momo = ree - re;
//				JOptionPane.showMessageDialog(null, momo);

			}

			void skill4() { // In a pop-up, ask the user for the city they live in
				String gru = JOptionPane.showInputDialog("wat city u live in(no capital letters)");


			// If they answered "San Diego", tell them they live in America's Finest City
				if(gru .equals("san diego")) {
					JOptionPane.showMessageDialog(null, "u live in murica epicest city");
				}


			// Otherwise, tell them to move to San Diego
				else {
					JOptionPane.showMessageDialog(null, "move to san diego u bruh");
				}


			// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."



			// If there is 1 car, use a pop-up to display the make/model of the car



			// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



			}

			void skill5() { // In a pop-up, ask the user for the name of their school



			// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



			}
			

		
		
		
		
		
		
		
		
	}


