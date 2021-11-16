package Others;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JGradientButton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color color1 = Color.orange;
	Color color2 = Color.red;

	public JGradientButton(String name) {
		setText(name);
		setContentAreaFilled(false);
		setFocusPainted(false); // used for demonstration
		
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				color2 = (color2 == Color.PINK) ? Color.GREEN : Color.PINK;
				// System.out.println(button.isSelected());
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setPaint(new GradientPaint(new Point(0, 0), color1, new Point(0, getHeight()), color2));
		g2.fillRect(0, 0, getWidth(), getHeight());
		g2.dispose();

		super.paintComponent(g);
	}

}
