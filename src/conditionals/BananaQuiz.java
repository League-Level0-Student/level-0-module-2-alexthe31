//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String a = JOptionPane.showInputDialog("bannanas?");
	
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(a.equals("no")) {
	JOptionPane.showMessageDialog(null, "you are crazy");
		}
		else
		{
	
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	 String b = JOptionPane.showInputDialog("hobby?");
	 JOptionPane.showMessageDialog(null, b + " is much better with bananas!");
	// if(b.equals(yes))
		 
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	
		}

	}
}
