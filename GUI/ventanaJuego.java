package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JRadioButton;

public class ventanaJuego extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaJuego frame = new ventanaJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaJuego() {
		setTitle("TateTi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 423);
		this.setLocationRelativeTo(null);//aparece en el medio
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tablero = new JPanel();
		tablero.setBounds(23, 75, 339, 211);
		contentPane.add(tablero);
		tablero.setBackground(new Color(128, 128, 255));
		tablero.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ubi 1");
		lblNewLabel.setOpaque(true);//permitir que cambie el color de fondo
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 106, 61);
		tablero.add(lblNewLabel);
		
		JLabel lblUbi = new JLabel("ubi 2");
		lblUbi.setOpaque(true);
		lblUbi.setForeground(new Color(0, 0, 0));
		lblUbi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi.setBackground(new Color(255, 255, 255));
		lblUbi.setBounds(0, 76, 106, 61);
		tablero.add(lblUbi);
		
		JLabel lblUbi_2 = new JLabel("ubi 3");
		lblUbi_2.setOpaque(true);
		lblUbi_2.setForeground(new Color(0, 0, 0));
		lblUbi_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_2.setBackground(new Color(255, 255, 255));
		lblUbi_2.setBounds(0, 150, 106, 61);
		tablero.add(lblUbi_2);
		
		JLabel lblUbi_1 = new JLabel("ubi 4");
		lblUbi_1.setOpaque(true);
		lblUbi_1.setForeground(new Color(0, 0, 0));
		lblUbi_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_1.setBackground(new Color(255, 255, 255));
		lblUbi_1.setBounds(116, 0, 106, 61);
		tablero.add(lblUbi_1);
		
		JLabel lblUbi_3 = new JLabel("ubi 5");
		lblUbi_3.setOpaque(true);
		lblUbi_3.setForeground(new Color(0, 0, 0));
		lblUbi_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_3.setBackground(new Color(255, 255, 255));
		lblUbi_3.setBounds(116, 76, 106, 61);
		tablero.add(lblUbi_3);
		
		JLabel lblUbi_3_1 = new JLabel("ubi 6");
		lblUbi_3_1.setOpaque(true);
		lblUbi_3_1.setForeground(new Color(0, 0, 0));
		lblUbi_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_3_1.setBackground(new Color(255, 255, 255));
		lblUbi_3_1.setBounds(116, 150, 106, 61);
		tablero.add(lblUbi_3_1);
		
		JLabel lblUbi_1_1 = new JLabel("ubi 7");
		lblUbi_1_1.setOpaque(true);
		lblUbi_1_1.setForeground(new Color(0, 0, 0));
		lblUbi_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_1_1.setBackground(new Color(255, 255, 255));
		lblUbi_1_1.setBounds(232, 0, 118, 61);
		tablero.add(lblUbi_1_1);
		
		JLabel lblUbi_1_2 = new JLabel("ubi 8");
		lblUbi_1_2.setOpaque(true);
		lblUbi_1_2.setForeground(new Color(0, 0, 0));
		lblUbi_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_1_2.setBackground(new Color(255, 255, 255));
		lblUbi_1_2.setBounds(232, 76, 107, 61);
		tablero.add(lblUbi_1_2);
		
		JLabel lblUbi_1_3 = new JLabel("ubi 9");
		lblUbi_1_3.setOpaque(true);
		lblUbi_1_3.setForeground(new Color(0, 0, 0));
		lblUbi_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUbi_1_3.setBackground(new Color(255, 255, 255));
		lblUbi_1_3.setBounds(232, 150, 118, 61);
		tablero.add(lblUbi_1_3);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(405, 75, 66, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel nombreUsuario = new JLabel("");//aca se ve el nombre que el usuario coloco
		nombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombreUsuario.setOpaque(true);
		nombreUsuario.setBackground(new Color(255, 255, 255));
		nombreUsuario.setBounds(405, 126, 123, 20);
		contentPane.add(nombreUsuario);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccionar una ficha");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(405, 169, 153, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("X");
		rdbtnNewRadioButton.setBounds(415, 207, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnO = new JRadioButton("O");
		rdbtnO.setBounds(415, 236, 109, 23);
		contentPane.add(rdbtnO);
	}
}