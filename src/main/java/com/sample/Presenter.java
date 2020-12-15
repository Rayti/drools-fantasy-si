package com.sample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Presenter {
	static
	{
		jFrame = new JFrame("FANTASY");
	}
	
	private static JFrame jFrame;
	
	public static String askQuestion(String question, String options[]) {
		jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
		int answerPosition = JOptionPane.showOptionDialog(jFrame, question, "Guide to Fantasy books.",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		jFrame.setVisible(false);
		return options[answerPosition];
	}
	
	public static void giveAnswer(String answer) {
		jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
		JOptionPane.showMessageDialog(jFrame, "The book for You:\n" + answer);
		jFrame.setVisible(false);
		jFrame.dispose();
	}
	
}
