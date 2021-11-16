package DI;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class DibujarComponentes2 {
	public static void main(String[] args) {
		FijarMarco framePrincipal = new FijarMarco();
		framePrincipal.setVisible(true);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FijarCapa pnlCapa = new FijarCapa();
		framePrincipal.add(pnlCapa);
	}
}

class FijarMarco extends JFrame{
	public FijarMarco() {
		setTitle("Ventana con Gráficos 2D");
		setSize(200,250);
	}
}
class FijarCapa extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D rectangulo= new Rectangle2D.Double(100,100,500,150);
		g2.draw(rectangulo);
		Line2D linea = new Line2D.Double(100,100,600,250);
		g2.draw(linea);
		Ellipse2D elipse1 = new Ellipse2D.Double(100,100,500,150);
		g2.draw(elipse1);
		Ellipse2D elipse2 = new Ellipse2D.Double(100,100,50,150);
		elipse2.setFrame(rectangulo);
	}
}