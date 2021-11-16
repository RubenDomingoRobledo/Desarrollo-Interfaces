package DI;

import java.awt.*;
import javax.swing.*;

public class VariosComponentes  {

	public static void main(String[] args) {
		new Botones();
	}
}


class Botones extends JFrame {
	
	public Botones() {
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		GridLayout gl = new GridLayout(4,3);
		gl.setHgap(5);
		gl.setVgap(5);
		cp.setLayout(gl);
		for (int i=1; i<=9; i++) {
			cp.add(new JButton(String.valueOf(i)));
		}
		cp.add(new JButton(String.valueOf("*")));
		cp.add(new JButton(String.valueOf("0")));
		cp.add(new JButton(String.valueOf("#")));
		
	}
	
	
	 /* BOTONES 1*/
	/*private JButton b1 = new JButton("Boton 1"); 
	private JButton	b2 = new JButton("Boton 2");
	private JButton	b3 = new JButton("Boton 3");
	
	public Botones() {
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,250);
		// setLayout(new FlowLayout());
		FlowLayout FL1 = new FlowLayout();
		FL1.setHgap(50);
		setLayout(FL1);
	}*/
	
	
}
