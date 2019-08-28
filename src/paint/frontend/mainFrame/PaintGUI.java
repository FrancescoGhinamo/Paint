package paint.frontend.mainFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import paint.frontend.components.PaintPanel;

public class PaintGUI extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 5138582323739354636L;
	
	private PaintPanel paintPanel;
	
	public PaintGUI() {
		super("Paint");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		
		paintPanel = new PaintPanel();
		this.add(paintPanel, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new PaintGUI().setVisible(true);

	}

}
