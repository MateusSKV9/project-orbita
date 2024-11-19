package visual;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class Espaco extends JFrame {
	private JLabel lblSol;
	private JLabel lblTerra;
	
	public Espaco() {
		getContentPane().setBackground(new Color(42, 42, 42));
		getContentPane().setLayout(null);
		getContentPane().add(getLblSol());
		getContentPane().add(getLblTerra());
		this.setSize(new Dimension(638, 568));
		
		this.setVisible(true);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);;
	}
	
	public JLabel getLblSol() {
		if (lblSol == null) {
			lblSol = new JLabel("");
			lblSol.setIcon(new ImageIcon(Espaco.class.getResource("/Controlador/imagens/sol.png")));
			lblSol.setBounds(280, 233, 64, 64);
		}
		return lblSol;
	}
	
	public JLabel getLblTerra() {
		if (lblTerra == null) {
			lblTerra = new JLabel("");
			lblTerra.setIcon(new ImageIcon(Espaco.class.getResource("/Controlador/imagens/planeta-terra.png")));
			lblTerra.setBounds(158, 375, 32, 32);
		}
		return lblTerra;
	}
}
