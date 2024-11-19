package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Home extends JPanel {
	public Home() {
		setBackground(new Color(247, 247, 247));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Orbitar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(329, 372, 141, 55);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("A ÓRBITA");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 40));
		lblNewLabel.setBounds(301, 94, 197, 55);
		add(lblNewLabel);
	}
}
