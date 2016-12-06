package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import view.Vista;

public class Oyente implements ActionListener {

	private Vista vista;
	
	public Oyente(Vista vista){
		this.vista=vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { 
	 
		File archivo = new File("C:/Users/Gerardo Shimokawa/Desktop/javatxt.txt");
		try {
			String texto = vista.getArea().getText()+"\r\n";
			FileWriter txt = new FileWriter(archivo,true);
			BufferedWriter buffer = new BufferedWriter(txt);
			
			buffer.write(texto);
			vista.getArea().setText("");
			buffer.close();
		} catch (IOException e1) { 
			e1.printStackTrace();
		} 
	}

}
