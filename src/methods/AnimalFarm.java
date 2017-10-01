package methods;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
String A = JOptionPane.showInputDialog("which animal");
		/* 2. Make it so that the user can keep entering new animals. */
	if(A.equals("Dog")) {
		playWoof();
}
	else if(A.equals("Cat")) {
		playMeow();
}
	else if(A.equals("cat")) {
		playMeow();
}
	else if(A.equals("dog")) {
		playWoof();
}

	else if(A.equals("duck")) {
		playQuack();
}
	
	else if(A.equals("Duck")) {
		playQuack();
}
	
	else if(A.equals("Cow")) {
		playMoo();
}
	else if(A.equals("cow")) {
	playMoo();
}	
	else if(A.equals("Llama")) {
	playllama();
}
	else if(A.equals("llama")) {
	playllama();
}
	
	
	
	
	
	
	
	}

	void playMoo() {
		playNoise(mooFile);
	}
	
	void playllama() {
		playNoise(llamaFile);
	}
	
	void playQuack() {
		playNoise(quackFile);
	}
	
	void playMeow() {
		playNoise(meowFile);
	}
	
	void playWoof() {
		playNoise(woofFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


