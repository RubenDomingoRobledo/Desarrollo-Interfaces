package DI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class VentanaGbl3 extends JFrame {
	public static void main(String[] args) {
		VentanaGbl3 ventana = new VentanaGbl3();
		ventana.setVisible(true);
	}
	
	GridBagLayout gb1 = new GridBagLayout();
	
	public VentanaGbl3() {
		super("Ventana con GBagLayout");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel
			lb1 = new JLabel("Nombre: "),
			lb2 = new JLabel("Apellidos: ");
			
		JTextField
			txtfld1 = new JTextField(20),
			txtfld2 = new JTextField(20);
			
		JButton btn1 = new JButton("Aceptar");
		
		getContentPane().setLayout(gb1);
		
		ponComponente(lb1, 0, 0, 1, 1);
		ponComponente(txtfld1, 1, 0, 2, 1);
		ponComponente(lb2, 0, 1, 1, 1);
		ponComponente(txtfld2, 2, 1, 1, 1);
		ponComponente(btn1, 2, 2, 1, 1);
	}
	
	public void ponComponente(JComponent comp, int gridx, int gridy, int gridw, int gridh) {
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridw;
		gbc.gridheight = gridh;
		
		gb1.setConstraints(comp, gbc);
		add(comp);
	}
}
	

		
