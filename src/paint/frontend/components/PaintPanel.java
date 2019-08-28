package paint.frontend.components;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel implements MouseMotionListener {

	
	private static final long serialVersionUID = 4414133012207354491L;
	
	private int thickness;
	
	private ArrayList<Point> points;
	
	public PaintPanel() {
		this.addMouseMotionListener(this);
		points = new ArrayList<Point>();
		this.thickness = 10;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Point p: points) {
			g.fillOval(p.x, p.y, thickness, thickness);
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		points.add(e.getPoint());
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	
	
}
