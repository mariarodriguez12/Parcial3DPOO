package logica;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JFrame;

public class Lienzo extends JPanel{
	private String cuadrado = "";
	private int r = 255;
	private int colorG = 255;
	private int b;
	

	public void setR(int r) {
		this.r = r;
	}

	public void setColorG(int colorG) {
		this.colorG = colorG;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void setCuadrado(String cuadrado) {
		this.cuadrado = cuadrado;
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		if(this.cuadrado.equals("Cuadrado")) {
			g2d.setColor(new Color(r, colorG, b));
			g2d.fillRect(150, 130, 300, 300);
		}
		
		else if(this.cuadrado.equals("Circulo")){
			g2d.setColor(new Color(r,colorG,b));
			g2d.fillOval(150, 130, 300, 300);
		}
		

		
	}
	

}
