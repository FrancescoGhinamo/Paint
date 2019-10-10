package paint.frontend.components;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;

public class ThicknessLabel extends JLabel {

	
	private static final long serialVersionUID = -1451386147093276574L;
	
	private int currentThickness;
	
	public ThicknessLabel() {
		this.currentThickness = 10;
		this.setSize(new Dimension(20, 20));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(this.getWidth() / 2 - currentThickness / 2, this.getHeight() / 2 - currentThickness / 2, currentThickness, currentThickness);
	}

	public void setCurrentThickness(int currentThickness) {
		this.currentThickness = currentThickness;
		repaint();
	}
	
	

}
