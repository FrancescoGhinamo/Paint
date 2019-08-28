package paint.frontend.mainFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import paint.frontend.components.ThicknessLabel;

public class ThicknessDialog extends JDialog implements ActionListener {

	
	private static final long serialVersionUID = -3715275908199003578L;
	
	private JSlider slider;
	private ThicknessLabel thckLbl;
	private int thickness;
	
	private JButton btnCancel;
	private JButton btnOK;
	
	public ThicknessDialog(JFrame owner, boolean modale) {
		super(owner, "Thickness", modale);
		this.thickness = 10;
		initComponents();
		this.setSize(new Dimension(952, 147));
	}


	private void initComponents() {
		setLayout(new BorderLayout());
		this.add(initThickPan(), BorderLayout.CENTER);
		this.add(initButPan(), BorderLayout.SOUTH);
		
	}
	
	private JPanel initThickPan() {
		
		thckLbl = new ThicknessLabel();
		
		slider = new JSlider(1, 50, thickness);
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if(thckLbl != null) {
					thckLbl.setCurrentThickness(slider.getValue());
				}
				
			}
			
		});
		
		
		
		JPanel pan = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 2;
		gbc.weighty = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);
		
		pan.add(thckLbl, gbc);
		
		gbc.gridx = 1;
		gbc.weightx = 25;
		
		pan.add(slider, gbc);
		
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
			thickness = slider.getValue();
			dispose();
		}
		else if(e.getSource().equals(btnCancel)) {
			thickness = -1;
			dispose();
		}

	}


	public int getThickness() {
		return thickness;
	}

	
}
