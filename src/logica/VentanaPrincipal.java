package logica;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;
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
public class VentanaPrincipal extends JFrame implements ActionListener{
	
	private JPanel rgb; 
	private JButton botonCuadrado;
	private JButton botonCirculo;
	private Lienzo lienzo;
	JTextField textR = new JTextField();
	JTextField textG = new JTextField();
	JTextField textB = new JTextField();
	
	public VentanaPrincipal() {
		this.setTitle("Parcial de Maria Alejandra Rodriguez");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setLayout(new BorderLayout());
		
		this.rgb = new JPanel();
		this.rgb.setLayout(new GridLayout(4,2,2,2));
		JLabel r = new JLabel("R");
		JLabel g = new JLabel("G");
		JLabel b = new JLabel("B");
		textR = new JTextField();
		textG = new JTextField();
		textB = new JTextField();
		this.botonCuadrado = new JButton("Cuadrado");
		this.botonCirculo = new JButton("Circulo");
		this.botonCuadrado.addActionListener(this);
		this.botonCirculo.addActionListener(this);
		
		this.rgb.add(r);
		this.rgb.add(textR);
		this.rgb.add(g);
		this.rgb.add(textG);
		this.rgb.add(b);
		this.rgb.add(textB);
		this.rgb.add(botonCuadrado);
		this.rgb.add(botonCirculo);
		
		this.lienzo = new Lienzo();
		
		
		this.add(this.rgb, BorderLayout.WEST);
		this.add(this.lienzo, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new VentanaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonOprimido = (JButton)e.getSource();
		if(botonOprimido.getText().equals("Cuadrado")) {
			this.lienzo.setCuadrado("Cuadrado");
			this.lienzo.setR(Integer.parseInt(this.textR.getText()));
			this.lienzo.setColorG(Integer.parseInt(this.textG.getText()));
			this.lienzo.setB(Integer.parseInt(this.textB.getText()));
		}
		else {
			this.lienzo.setCuadrado("Circulo");
			this.lienzo.setR(Integer.parseInt(this.textR.getText()));
			this.lienzo.setColorG(Integer.parseInt(this.textG.getText()));
			this.lienzo.setB(Integer.parseInt(this.textB.getText()));
		}
		
		this.lienzo.repaint();
		
	}

}
