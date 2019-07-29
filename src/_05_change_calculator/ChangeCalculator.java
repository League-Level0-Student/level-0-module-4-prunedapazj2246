package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

	String nickels = JOptionPane.showInputDialog("How many nickels do you have?");	// Ask the user how many nickels they have

	int nickle = Integer.parseInt(nickels);	// Convert their answer to an int using Integer.parseInt()

String dimes =	JOptionPane.showInputDialog("how many dimes do you have");	// Ask the user how many dimes they have, and convert their answer
int dime = Integer.parseInt(dimes);
String quarters =	JOptionPane.showInputDialog("how many quarters do you have");	
int quarter = Integer.parseInt(quarters);		// Ask the user how many quarters they have, and convert their answer

quarter= quarter * 25;// Calculate how much money the user has and save it in a double variable 
dime = dime * 10;
nickle = nickle * 5;
double yourMoney = quarter + dime+ nickle;
yourMoney = yourMoney/100;// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have" + yourMoney + "dollars");
	}
}

