package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font; 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import listener.Oyente;

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
		boton.addActionListener(new Oyente(this));
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(JTextArea area) {
		this.area = area;
	}
	
}
