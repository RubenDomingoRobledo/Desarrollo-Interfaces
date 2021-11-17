package DI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EjercicioEvento {
	public static void main(String[] args) {
		Pulsacion ventana= new Pulsacion();
		ventana.setVisible(true);
	}
}

class Pulsacion extends JFrame {
	public Pulsacion() {
		JPanel pnl1= new JPanel();
		JButton btn1= new JButton();
		JTextField txtfield1= new JTextField (String.valueOf(0),5);
		 
		setTitle("Contar Clicks en boton");
		setSize(500,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl1.setLayout(new FlowLayout());
		pnl1.add(new JLabel("Nº Clicks"));
		
		btn1.addActionListener(new ClickEnBoton(txtfield1));
		btn1.setText("Click");
		
		pnl1.add(txtfield1);
		pnl1.add(btn1);
		
		Container cp = getContentPane();
		cp.add(pnl1);
	}
}

class ClickEnBoton implements ActionListener {
	JTextField txtfield1;
	Integer iclicks = 0;
	public ClickEnBoton(JTextField txtfield1) {
		this.txtfield1= txtfield1;
	}


	public void actionPerformed(ActionEvent e) {
		iclicks = Integer.parseInt(txtfield1.getText())+1;
		txtfield1.setText(iclicks.toString());
	}
}