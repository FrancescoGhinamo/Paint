package paint.frontend.mainFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import paint.frontend.components.PaintPanel;

public class PaintGUI extends JFrame implements ActionListener {


	private static final long serialVersionUID = 5138582323739354636L;

	private PaintPanel paintPanel;

	private JMenuItem itemThickness;
	private JMenuItem itemColor;

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
		
		this.setJMenuBar(initJMenuBar());

	}
	
	private JMenuBar initJMenuBar() {
		JMenuBar bar = new JMenuBar();
		
		itemThickness = new JMenuItem("Thickness");
		itemThickness.addActionListener(this);
		
		itemColor = new JMenuItem("Color");
		itemColor.addActionListener(this);
		
		JMenu mnuPaint = new JMenu("Paint");
		mnuPaint.add(itemThickness);
		mnuPaint.add(itemColor);
		
		bar.add(mnuPaint);
		
		return bar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(itemThickness)) {
			ThicknessDialog d = new ThicknessDialog(this, true);
			d.setVisible(true);
			if(d.getThickness() != -1) {
				paintPanel.setCurrentThickness(d.getThickness());
			}
		}

	}

	public static void main(String[] args) {
		PaintGUI g = new PaintGUI();
		g.setVisible(true);

	}

}
