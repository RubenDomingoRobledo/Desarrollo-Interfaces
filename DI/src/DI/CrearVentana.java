package DI;

import javax.swing.JFrame;

public class CrearVentana {
	public static void main(String[]args) {
		Ventana miVentana = new Ventana();
		miVentana.crearVentana();
	}
}
	
class Ventana extends JFrame{
	public void crearVentana() {
		setSize(1000,600);
		setTitle("Hola Mundo");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100,100,500,100);
	}
}

