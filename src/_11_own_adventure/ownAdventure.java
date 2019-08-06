package _11_own_adventure;

import javax.swing.JOptionPane;

public class ownAdventure {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "You are an explorer searching for the lost treasure of pylos. Your search leads you deep in the forests on the islands of Greece.  ");
		JOptionPane.showMessageDialog(null, "Other explorers looking to keep the treasure for themselves could come get you. You must ivade them");
		JOptionPane.showMessageDialog(null, "As your search begins you see a canyon with an old bridge. There are two choices. You can either take your chances with the bridge or loop around to see if there is another way. Your Choice!");
		
int bridgeLoop = JOptionPane.showOptionDialog(null, "What will you do now?", "explorers descision", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {" bridge", "loop"}, null);
if(bridgeLoop == 0) {
	bridge();
	int attackWalk = JOptionPane.showOptionDialog(null, "What will you do now?", "explorers descision", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"attack", "walk"}, null);
	if(attackWalk==0) {
		attack();
	}else if(attackWalk == 1) {
		walk();
	}
}else if(bridgeLoop==1) {
	loop();
	int runHide	= JOptionPane.showOptionDialog(null, "What will you do now?", "explorers descision", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"run", "hide"}, null);
	if(runHide == 0) {
	run();	
	}else if(runHide == 1) {
		hide();
	}
}


	}

static void bridge() {
	JOptionPane.showMessageDialog(null, "Great Job! Your risk payed off and you are safely on your way to treasure. Nothing more can happen to you right?");
JOptionPane.showMessageDialog(null, "On your way you see a jaguar. It eyes you anxiously.You take out your machete. What will you do attack or slowly walk around.");

}
static void loop() {
	JOptionPane.showMessageDialog(null, "You managed to find a way across the canyon, but you wasted valuable time. Other explorers could come for you");
	JOptionPane.showMessageDialog(null, "You hear voices as your on your way and you start running. They hear your footsteps and follow you. What should you do keep running or hide? Quickly choose!");

}
static void run() {
	JOptionPane.showMessageDialog(null, "You start running and at first you are ahead because of your strong legs,but they start catching up to you. The explorers catch and beat you up for information.They leave you there and eventually you die.The End!");
}
static void hide() {
	JOptionPane.showMessageDialog(null, "You hide and hear as they pass you and you stay there in the trunk of the tree for a while.When your about to set off again something slithers next to you and you feel a jolt of pain. you scream and someone hears you but that's the end of the exploration for you and you go home.The End!");
}
static void attack(){
	JOptionPane.showMessageDialog(null, "You attack the jaguar and it yowls and runs away,but not before getting a massive scratch on your arm.You have to call in a helicoptor and go home.The End!");
}
static void walk() {
	JOptionPane.showMessageDialog(null, "You slowly walk around the jaguar and it ignores you.Great!You keep and see a huge pyramid. It's the treasure of pylos I am going to be rich!!");
}
	
}
