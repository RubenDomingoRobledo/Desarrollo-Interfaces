package DI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaBoton extends JFrame{
	public static void main(String[] args) {
		new VentanaBoton();
	}
	public VentanaBoton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
		JButton boton= new JButton();
		boton.setText("Presioname");
		boton.setBounds(135, 150, 130, 50);
		add(boton);
		this.setVisible(true);
		this.setLayout(null);
	}
}

