package _01_chuckle_clicker;

import java.awt.event.*;
import javax.swing.*;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}

	JFrame cc_frame;
	JPanel cc_panel;
	JButton cc_punchline_button;
	JButton cc_joke_button;

	public void makeButtons() {
		cc_frame = new JFrame();
		cc_panel = new JPanel();
		cc_punchline_button = new JButton();
		cc_joke_button = new JButton();
		cc_joke_button.addActionListener(this);
		cc_punchline_button.addActionListener(this);
		cc_joke_button.setText("joke");
		cc_punchline_button.setText("punchline");
		cc_panel.add(cc_joke_button);
		cc_panel.add(cc_punchline_button);
		cc_frame.add(cc_panel);
		cc_frame.pack();
		cc_frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == cc_joke_button) {
			JOptionPane.showMessageDialog(cc_frame, "wanna hear a short joke and a long joke?");
			cc_punchline_button.setText("no");
			cc_panel.remove(cc_joke_button);
			cc_frame.pack();
		}
		if (event.getSource() == cc_punchline_button) {
			JOptionPane.showMessageDialog(cc_frame, "joke joooooooooooooooke *pain*");
			cc_frame.setVisible(false);
			makeButtons();
		}
	}
}
