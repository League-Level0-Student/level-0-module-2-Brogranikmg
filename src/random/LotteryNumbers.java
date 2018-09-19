package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random uhhhhh = new Random();
		String wow = "";
		for (int i = 0; i < 5; i++) {
			wow += (uhhhhh.nextInt(100) + 1);
			wow += " ";
		}
		JOptionPane.showMessageDialog(null, "Your lottery numbers are: " + wow);
	}
}
