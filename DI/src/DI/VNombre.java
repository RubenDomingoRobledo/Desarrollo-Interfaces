package DI;

import java.awt.*;
import javax.swing.*;

public class VNombre {
	public static void main(String[]args) {
		VgC vi = new VgC();
		vi.setVisible(true);
		vi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VgC extends JFrame{
	public VgC() {
		setTitle("Datos usuario");
		setSize(400,300);
		setLocationRelativeTo(null);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel lb1= new JLabel("Nombre");
		JTextField txt1 = new JTextField(10);
		JButton btn1 = new JButton("OK");
	}
}