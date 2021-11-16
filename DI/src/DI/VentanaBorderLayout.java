package DI;

import javax.swing.*;
import java.awt.*;

public class VentanaBorderLayout extends JFrame{
	public VentanaBorderLayout() {
		setTitle("Botones on BorderLayout");
		BorderLayout bl= new BorderLayout(5,5);
		setLayout(bl);
		JButton btn1 = new JButton("Nombre");
		getContentPane().add(btn1, BorderLayout.NORTH);
	}

}
