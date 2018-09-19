package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		String hell_animal = "";
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		while (!hell_animal.equalsIgnoreCase("free me")) {
			hell_animal = JOptionPane.showInputDialog("What hell animal would you like to suffer through today?");
			/* 2. Make it so that the user can keep entering new animals. */
			switch (hell_animal.toLowerCase()) {
				case "cow": playMoo(); break;
				case "duck": playQuack(); break;
				case "dog": playWoof(); break;
				case "cat": playMeow(); break;
				case "llama": playLlama(); break;
				case "free me": JOptionPane.showMessageDialog(null, "Goodbye... for now ;)"); break;
				default: JOptionPane.showMessageDialog(null, "That's not an animal... ỉ̶̛̲̝͕̳̦̦̖̪̍͂̒̌̍͋͟t̳̰̙͔̠̰̰̳̮̂́̐̀̐͊́̈́ ì̷̡̡̹͉͓̘̫̀͐́̿͑́̀͌͡ͅs̵͕͓̟̰̼̾̀̇̉͝͝ o̴̰̥̬͈̘̺͎͓̾̉͂͘͞ư̷̤̠̲̜̺̘̣̾͗̆̑̾̊̋̚͞r̵̗͎̠̝̬̘̿̑͂͂̉̚͟͠͠ ģ̛͉̺͓̟͑̊̚͡o̵̧̙͖͕̤͔͚̘̞̅͊̽͛͗͡d̤̩̖̯̜̀̃̒̽̏̀͛̊̽̚͟"); break;
			}
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playMeow() {
		playNoise(meowFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
