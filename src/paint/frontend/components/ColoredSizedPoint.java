package paint.frontend.components;

import java.awt.Color;
import java.awt.Point;

public class ColoredSizedPoint extends Point {

	
	private static final long serialVersionUID = 7631931266621306277L;
	
	private Color color;
	private int size;

	
	
	
	public ColoredSizedPoint(Point p, Color color, int size) {
		super(p);
		this.color = color;
		this.size = size;
	}

	public ColoredSizedPoint(Point p, Color color) {
		super(p);
		this.color = color;
	}

	public ColoredSizedPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}
	
	
	
	

}
