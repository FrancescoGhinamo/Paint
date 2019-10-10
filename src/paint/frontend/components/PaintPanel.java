package paint.frontend.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel implements MouseMotionListener {

	
	private static final long serialVersionUID = 4414133012207354491L;
	
	private int currentThickness;
	private Color currentColor;
	private ArrayList<ColoredSizedPoint> points;
	
	public PaintPanel() {
		this.addMouseMotionListener(this);
		points = new ArrayList<ColoredSizedPoint>();
		this.currentThickness = 10;
		currentColor = Color.BLACK;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(ColoredSizedPoint p: points) {
			g.setColor(p.getColor());
			g.fillOval(p.x, p.y, p.getSize(), p.getSize());
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		points.add(new ColoredSizedPoint(e.getPoint(), currentColor, currentThickness));
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	public int getCurrentThickness() {
		return currentThickness;
	}

	public void setCurrentThickness(int thickness) {
		this.currentThickness = thickness;
	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	
	
}
