package paint.frontend.mainFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorDialog extends JDialog implements ActionListener {

	
	private static final long serialVersionUID = -637364617692236229L;
	
	private Color color;
	private Color oldColor;
	private JButton btnCancel;
	private JButton btnOK;
	
	private JLabel lblColor;
	private JComboBox<String> cmbColor;
	
	public ColorDialog(JFrame owner, boolean modale, Color oldColor) {
		super(owner, "Thickness", modale);
		this.color = Color.BLACK;
		this.oldColor = oldColor;
		initComponents();
		pack();
	}


	private void initComponents() {
		setLayout(new BorderLayout());
		this.add(initColorPan(), BorderLayout.CENTER);
		this.add(initButPan(), BorderLayout.SOUTH);
		
	}
	
	private JPanel initColorPan() {
		JPanel pan = new JPanel(new GridBagLayout());
		
		cmbColor = new JComboBox<String>();
		cmbColor.addItem("Black");
		cmbColor.addItem("Blue");
		cmbColor.addItem("Cyan");
		cmbColor.addItem("Dark gray");
		cmbColor.addItem("Gray");
		cmbColor.addItem("Green");
		cmbColor.addItem("Magenta");
		cmbColor.addItem("Orange");
		cmbColor.addItem("Red");
		cmbColor.addItem("Pink");
		cmbColor.addItem("White");
		cmbColor.addItem("Yellow");
		
		
		cmbColor.addActionListener(this);
		
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 2;
		gbc.weighty = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);
		
		lblColor = new JLabel("COLOR");
		lblColor.setSize(new Dimension(20, 20));
		lblColor.setForeground(Color.BLACK);
		pan.add(lblColor, gbc);
		
		gbc.gridx = 1;
		gbc.weightx = 25;
		
		pan.add(cmbColor, gbc);
		
		return pan;
	}
	
	private JPanel initButPan() {
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		
		pan.add(btnCancel);
		pan.add(btnOK);
		
		return pan;
	}
	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnOK)) {
			
			dispose();
		}
		else if(e.getSource().equals(btnCancel)) {
			color = oldColor;
			dispose();
		}
		else if(e.getSource().equals(cmbColor)) {
			String col = (String) cmbColor.getSelectedItem();
			switch(col) {
			case "Black":
				lblColor.setForeground(Color.BLACK);
				color = Color.BLACK;
				break;
				
			case "Blue":
				lblColor.setForeground(Color.BLUE);
				color = Color.BLUE;
				break;
				
			case "Cyan":
				lblColor.setForeground(Color.CYAN);
				color = Color.CYAN;
				break;
				
			case "Dark gray":
				lblColor.setForeground(Color.DARK_GRAY);
				color = Color.DARK_GRAY;
				break;
				
			case "Gray":
				lblColor.setForeground(Color.GRAY);
				color = Color.GRAY;
				break;
				
			case "Green":
				lblColor.setForeground(Color.GREEN);
				color = Color.GREEN;
				break;
				
			case "Magenta":
				lblColor.setForeground(Color.MAGENTA);
				color = Color.MAGENTA;
				break;
				
			case "Orange":
				lblColor.setForeground(Color.ORANGE);
				color = Color.ORANGE;
				break;
				
			case "Red":
				lblColor.setForeground(Color.RED);
				color = Color.RED;
				break;
				
			case "Pink":
				lblColor.setForeground(Color.PINK);
				color = Color.PINK;
				break;
				
			case "White":
				lblColor.setForeground(Color.WHITE);
				color = Color.WHITE;
				break;
				
			case "Yellow":
				lblColor.setForeground(Color.YELLOW);
				color = Color.YELLOW;
				break;
				
			}
		}

	}


	public Color getColor() {
		return color;
	}
	
	


}
