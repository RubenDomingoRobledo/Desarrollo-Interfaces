package DI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class VentanaGbl2 extends JFrame{
	public static void main(String[] args) {
		VentanaGbl2 ventana = new VentanaGbl2();
		ventana.setVisible(true);
	}
	public VentanaGbl2() {
		super("Ventana con GBagLayout");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		setLayout(gridbag);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		
		JButton
			boton0= new JButton("Botón 0"),
			boton1= new JButton("Botón 1"),
			boton2= new JButton("Botón 2"),
			boton3= new JButton("Botón 3"),
			boton4= new JButton("Botón 4"),
			boton5= new JButton("Botón 5"),
			boton6= new JButton("Botón 6");
		
		gridbag.setConstraints(boton0, gbc);
		add(boton0);
		
		gridbag.setConstraints(boton1, gbc);
		add(boton1);

		gridbag.setConstraints(boton2, gbc);
		add(boton2);
		
		gbc.gridwidth= GridBagConstraints.REMAINDER;
		
		gridbag.setConstraints(boton3, gbc);
		add(boton3);
		
		gbc.weightx = 0.0;
		
		gridbag.setConstraints(boton4, gbc);
		add(boton4);
		
		gbc.gridwidth= GridBagConstraints.RELATIVE;
		
		gridbag.setConstraints(boton5, gbc);
		add(boton5);
		
		gbc.gridwidth= GridBagConstraints.REMAINDER;
		
		gridbag.setConstraints(boton6, gbc);
		add(boton6);
	}
}
