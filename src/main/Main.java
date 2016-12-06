package main;

import javax.swing.JFrame;

import view.Vista;

public class Main {

	public static void main(String[] args) { 

		Vista ventana = new Vista();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}
