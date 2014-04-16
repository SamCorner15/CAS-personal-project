

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MathPanel extends JPanel {
	int x;
	int size = 117;
	int height = 117 * 5;

	public MathPanel(int diffLevel) {
		super();
		//this.setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		repaint();
		System.out.println("running");
		setSize(400,400);
	}

	public void paintComponent(Graphics page) {
		super.paintComponents(page);
		for (int i = 0; i < 5; i++) {
			x += 60;
		}
		int side = (int) (Math.random() * 6);
		side += 1;
		if (side == 1 || side == 3 || side == 5)
			page.setColor(Color.red);
		page.fillOval(x, height / 2, size / 5, size / 5);
		if (side == 2 || side == 3 || side == 4 || side == 5 || side == 6) {
			page.setColor(Color.red);
			page.fillOval(x - size / 4, height / 2 - size / 4, size / 5,
					size / 5);
			page.setColor(Color.red);
			page.fillOval(x + size / 4, height / 2 + size / 4, size / 5,
					size / 5);
		}
		if (side == 4 || side == 5 || side == 6) {
			page.setColor(Color.red);
			page.fillOval(x - size / 4, height / 2 + size / 4, size / 5,
					size / 5);
			page.setColor(Color.red);
			page.fillOval(x + size / 4, height / 2 - size / 4, size / 5,
					size / 5);
		}
		if (side == 6) {
			page.setColor(Color.red);
			page.fillOval(x, height / 2 - size / 4, size / 5, size / 5);
			page.setColor(Color.red);
			page.fillOval(x, height / 2 + size / 4, size / 5, size / 5);

		}
	}
}