package Controlador;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import visual.Espaco;

public class ControladorOrbita implements ActionListener, Runnable {
	private Frame espaco;
    private int raioOrbita;    // Raio da órbita
    private int centroX;       // Coordenada X do centro da órbita (Sol)
    private int centroY;       // Coordenada Y do centro da órbita
    private double angulo = 0; // Ângulo inicial para a órbita
	
	public ControladorOrbita() {
		espaco = new JFrame("Órbita");
		addEventos();
	}
	
	private void addEventos() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread thread = new Thread(this);
        thread.start();
	}

	@Override
	public void run() {
		while (true) { 
            int x = (int) (centroX + raioOrbita * Math.cos(angulo));
            int y = (int) (centroY + raioOrbita * Math.sin(angulo));

            //Posição da terra
//            espaco..setBounds(x - 20, y - 20, 32, 32); 
            
            
            angulo += 0.01;
            
            try {
                Thread.sleep(30); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
            espaco.repaint();
        }		
	}
	
//	public static void main(String[] args) {
//        new ControladorOrbita();
//    }
}
