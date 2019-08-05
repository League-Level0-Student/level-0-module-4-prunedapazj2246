package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
static String pet;

	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		 pet = JOptionPane.showInputDialog("What pet do you want to buy?");// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable


		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
	while(happinessLevel < 2) {	//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + pet +" happy?", "How to get you pet happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "groom", "water", "bath" }, null);
if(task == 2) {
	System.out.println(task);
	groom();
	 
	 
}
else if(task ==1) {
	System.out.println(task);
	food();// 5. Use user input to call the appropriate method created in step 4.
	
	System.out.println(task);
}
else if(task ==0) {
cuddle();			// 6. If you determine the happiness level is large enough, tell the
}
else if(task == 3) {
	water();//    user that he loves his pet and use break; to exit for loop.
}else {
	bath();
}
	}
	}

	static void groom() {
		JOptionPane.showMessageDialog(null, "Your " + pet  + " hates when you groom him");
		happinessLevel -= 1;
		JOptionPane.showMessageDialog(null, "Your " +pet+"'s happiness level is" +happinessLevel);// 4. Create methods to handle each of your user selections.
	}
	static void food() {
		JOptionPane.showMessageDialog(null, "Your " +pet+ " starts jumping up and down. He loves it when you feed him. ");
		happinessLevel += 2;
		JOptionPane.showMessageDialog(null, "Your " +pet+"'s happiness level is " +happinessLevel);
	}
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " goes to sleep and wakes up happier");
		happinessLevel +=2;
		JOptionPane.showMessageDialog(null, "Your " +pet+"'s happiness level is " +happinessLevel);
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "Your " +pet+" drinks the water happily");
		happinessLevel +=1;
		JOptionPane.showMessageDialog(null, "Your " +pet+"'s happiness level is " +happinessLevel);
	}
	static void bath() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" growls at you angrily");
		happinessLevel -=2;
		JOptionPane.showMessageDialog(null, "Your " +pet+"'s happiness level is " +happinessLevel);
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}