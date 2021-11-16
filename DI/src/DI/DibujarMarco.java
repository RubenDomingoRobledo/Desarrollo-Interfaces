package DI;

import java.awt.Graphics;

import javax.swing.*;

public class DibujarMarco {
	public static void main(String[] args) {
		MarcoDibujo marcodibujo = new MarcoDibujo();
		marcodibujo.setVisible(true);
		marcodibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoDibujo extends JFrame{
	public MarcoDibujo() {
		setTitle("Ventana con Marco");
		setBounds(100,100,800,400);
		CapaConFiguras pnlCapa= new CapaConFiguras();
		add(pnlCapa);
	}
}

class CapaConFiguras extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 100, 50);
		g.drawLine(50,100,100,400);
		g.drawArc(50,100,200,100,120,150);
	}
}
