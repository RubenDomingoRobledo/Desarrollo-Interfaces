package DI;

import javax.swing.JFrame;
import java.awt.*;

public class CrearVentanaCentrada {
	public static void main(String[]args) {
		VentanaCentrada miVentana = new VentanaCentrada();
		miVentana.crearVentanaCentrada();
	}
}

class VentanaCentrada extends JFrame{
	Toolkit miPantalla = Toolkit.getDefaultToolkit();
	Dimension sizePantalla= miPantalla.getScreenSize();
	int anchoPantalla=sizePantalla.width;
	int altoPantalla=sizePantalla.height;
	
	public void crearVentanaCentrada() {
		setSize(anchoPantalla/2, altoPantalla/2);
		setLocation(anchoPantalla/4, altoPantalla/4);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
