package principal;

import javax.swing.JFrame;
import javax.swing.*;

public class ventanas {

	public static void main(String[] args) {
		

	}
	public void ventanaPrincipal (JFrame ventana) {
		
		ventana.setTitle("principal");
		ventana.setBounds(20,20,500,500);
		ventana.setLayout(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiqueta2 = new JLabel(new ImageIcon("imagen.png.png"));

		etiqueta2.setBounds(10, 80, 300, 300);

		ventana.add(etiqueta2);
		ventana.setVisible(true);
	}
}
