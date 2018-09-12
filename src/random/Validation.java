//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber;
		String cOmPlImEnTs = "dort";

		// 1. Use each value of randomNumber to give the user a random compliment.
			String complimentsInAirQuotes[] = {"There are approximately 38,000 known species of spiders.", "Spiders eat more insects than birds and bats combined—and so do I!", "Spiders have blue blood. In humans, oxygen is bound to hemoglobin, a molecule that contains iron and gives blood its red color.\nIn spiders, oxygen is bound to hemocyanin, a molecule that contains copper rather than iron.", "iant trapdoor spiders are considered living fossils because they are similar to spiders that lived over 300 million years ago.\nThey are found in southeastern Asia, China, and Japan and are over 4 inches across, including their legs.", "While humans have muscles on the outside of their skeleton, spiders have muscles on the inside.", "Some spiders, such as house spiders, are able to run up walls because their feet are covered in tiny hairs that grip the surface.", "While most spiders build a new web every day, the web of the gold orb can last several years and can even catch birds.", "Wolf spiders can run at speeds of up to 2 feet per second.", "Some male spiders give dead flies to the females as presents—and so do I!", "The Darwin bark spider creates the strongest material made by a living organism.\nTheir giant webs can span rivers, streams, and even lakes and is 10 times stronger than Kevlar."};
		// 2. Repeat all the code above 10 times
			JOptionPane.showMessageDialog(null, "Are you feeling down in the dumps? Here are some compliments to brighten your day!");
			while (!cOmPlImEnTs.replaceFirst("[0-9]+", "").equals("")) {
				cOmPlImEnTs = JOptionPane.showInputDialog("How many compliments do you want?");
			}
			int thingo = Integer.parseInt(cOmPlImEnTs);
			for (int i = 0; i < thingo; i++) {
				randomNumber = randomMaker.nextInt(10);
				JOptionPane.showMessageDialog(null, complimentsInAirQuotes[randomNumber]);
			}
		// 3. Find someone to test out your program. They will like it :)
	}
}
