package Controlador;

import javax.swing.*;
import java.awt.*;

public class Orbita extends JPanel implements Runnable {
    private int raioOrbita;    
    private int centroX;       
    private int centroY;       
    private double angulo = 0;   
    private JLabel labelTerra;
    private JLabel labelSol;   

    public Orbita() {
        setLayout(null); 
    
        labelSol = new JLabel(new ImageIcon(getClass().getResource("/Controlador/imagens/sol.png")));
        labelTerra = new JLabel(new ImageIcon(getClass().getResource("/Controlador/imagens/planeta-terra.png")));

        add(labelSol);  
        add(labelTerra); 
       
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
             
        centroX = getWidth() / 2;
        centroY = getHeight() / 2;
        raioOrbita = Math.min(getWidth(), getHeight()) / 3; 
   
        labelSol.setBounds(centroX - 20, centroY - 20, 64, 64); 
    }

    @Override
    public void run() {
        while (true) { 
            int x = (int) (centroX + raioOrbita * Math.cos(angulo));
            int y = (int) (centroY + raioOrbita * Math.sin(angulo));
 
            labelTerra.setBounds(x - 10, y - 10, 32, 32); 
            
            angulo += 0.01;
          
            try {
                Thread.sleep(25); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simulação da Órbita da Terra (Feito por um aluno)");
        Orbita painel = new Orbita();
        frame.setSize(850, 820); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
