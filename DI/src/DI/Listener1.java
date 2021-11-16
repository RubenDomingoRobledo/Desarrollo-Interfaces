package DI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Listener1 {
	public static void main(String[] args) {
		new EventoBoton().setVisible(true);
	}
}

class EventoBoton extends JFrame {
	public EventoBoton() {
		super("Evento en Boton");
		setSize(300,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Haz click");
		
		btn1.addActionListener(new EvBotonPulsado());
		
		cp.add(btn1);
	}
}
class EvBotonPulsado implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton btn1= (JButton) e.getSource();
		JOptionPane ptpn1= new JOptionPane();
		ptpn1.showMessageDialog(btn1, "Hola", "Hola!", JOptionPane.INFORMATION_MESSAGE);
	}
}