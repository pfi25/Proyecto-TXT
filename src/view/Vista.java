package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Vista extends JFrame{
 
	private static final long serialVersionUID = 1L;

	private JTextArea area;
	private JButton boton;
	
	public Vista(){
		setTitle("ESCRIBIENDO UN TXT");
		setBounds(400,300,300,300);
		setLayout(new BorderLayout());
		area = new JTextArea(30,100);
		area.setFont(new Font("Courier",Font.BOLD,24));
		boton = new JButton("Enviar");
		boton.setBackground(Color.BLACK);
		boton.setForeground(Color.YELLOW);
		add(area,BorderLayout.CENTER);
		add(boton,BorderLayout.SOUTH);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File archivo = new File("C:/Users/Gerardo Shimokawa/Desktop/javatxt.txt");
				try {
					String texto = area.getText()+"\r\n";
					FileWriter txt = new FileWriter(archivo,true);
					
					for (int i = 0; i < texto.length(); i++) {
						txt.write(texto.charAt(i));
					}
					area.setText("");
					txt.close();
				} catch (IOException e1) { 
					e1.printStackTrace();
				} 
			}
		});
	}
}
