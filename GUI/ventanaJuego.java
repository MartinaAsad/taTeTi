package GUI;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import Logica.Jugador;

public class ventanaJuego extends JFrame {

	private JPanel contentPane;
	private boolean turno=true;//si es true va el usuario
	private JLabel posicionesTablero []=new JLabel[9];
	private ButtonGroup xo=new ButtonGroup();
	String [] opciones={"X" , "O"};

	

	/**
	 * Create the frame.
	 */
	String n=JOptionPane.showInputDialog(null, "Escribe tu nombre: ");//aca se le pide al usuario su nombre
	int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione su ficha",null,JOptionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
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
		
		JLabel subtitulo = new JLabel("Usuario");
		subtitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		subtitulo.setBounds(405, 112, 92, 35);
		contentPane.add(subtitulo);
		
		
		JLabel nombreUsuario = new JLabel("");//aca se ve el nombre que el usuario coloco
		nombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nombreUsuario.setOpaque(true);
		nombreUsuario.setBackground(new Color(255, 255, 255));
		nombreUsuario.setBounds(405, 171, 123, 20);
		nombreUsuario.setText(n);
		contentPane.add(nombreUsuario);
		JLabel posicion1 = new JLabel("");
		posicion1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//funcion para que al seleccionar x y apretar un casillero, este se cambie
				//optimizarlo en el futuro
				seleccionar(0);
			}	
		});
		posicion1.setOpaque(true);//permitir que cambie el color de fondo
		posicion1.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion1.setForeground(new Color(0, 0, 0));
		posicion1.setBackground(new Color(255, 255, 255));
		posicion1.setBounds(0, 0, 106, 61);
		tablero.add(posicion1);
		
		JLabel posicion2 = new JLabel("");
		posicion2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(1);
				
			}
		});
		posicion2.setOpaque(true);
		posicion2.setForeground(new Color(0, 0, 0));
		posicion2.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion2.setBackground(new Color(255, 255, 255));
		posicion2.setBounds(0, 76, 106, 61);
		tablero.add(posicion2);
		
		JLabel posicion3 = new JLabel("");
		posicion3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(2);
			}
		});
		posicion3.setOpaque(true);
		posicion3.setForeground(new Color(0, 0, 0));
		posicion3.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion3.setBackground(new Color(255, 255, 255));
		posicion3.setBounds(0, 150, 106, 61);
		tablero.add(posicion3);
		
		JLabel posicion4 = new JLabel("");
		posicion4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(3);
			}
		});
		posicion4.setOpaque(true);
		posicion4.setForeground(new Color(0, 0, 0));
		posicion4.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion4.setBackground(new Color(255, 255, 255));
		posicion4.setBounds(116, 0, 106, 61);
		tablero.add(posicion4);
		
		JLabel posicion5 = new JLabel("");
		posicion5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(4);
			}
		});
		posicion5.setOpaque(true);
		posicion5.setForeground(new Color(0, 0, 0));
		posicion5.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion5.setBackground(new Color(255, 255, 255));
		posicion5.setBounds(116, 76, 106, 61);
		tablero.add(posicion5);
		
		JLabel posicion6 = new JLabel("");
		posicion6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(5);
			}
		});
		posicion6.setOpaque(true);
		posicion6.setForeground(new Color(0, 0, 0));
		posicion6.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion6.setBackground(new Color(255, 255, 255));
		posicion6.setBounds(116, 150, 106, 61);
		tablero.add(posicion6);
		
		JLabel posicion7 = new JLabel("");
		posicion7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(6);
			}
		});
		posicion7.setOpaque(true);
		posicion7.setForeground(new Color(0, 0, 0));
		posicion7.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion7.setBackground(new Color(255, 255, 255));
		posicion7.setBounds(232, 0, 118, 61);
		tablero.add(posicion7);
		
		JLabel posicion8 = new JLabel("");
		posicion8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(7);
			}
		});
		posicion8.setOpaque(true);
		posicion8.setForeground(new Color(0, 0, 0));
		posicion8.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion8.setBackground(new Color(255, 255, 255));
		posicion8.setBounds(232, 76, 107, 61);
		tablero.add(posicion8);
		
		
		JLabel posicion9 = new JLabel("");
		posicion9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(8);
			}
		});
		posicion9.setOpaque(true);
		posicion9.setForeground(new Color(0, 0, 0));
		posicion9.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion9.setBackground(new Color(255, 255, 255));
		posicion9.setBounds(232, 150, 118, 61);
		tablero.add(posicion9);
		posicionesTablero = new JLabel[9];
		posicionesTablero[0]=posicion1;//son tipo matriz
		posicionesTablero[1]=posicion2;
		posicionesTablero[2]=posicion3;
		posicionesTablero[3]=posicion4;
		posicionesTablero[4]=posicion5;
		posicionesTablero[5]=posicion6;
		posicionesTablero[6]=posicion7;
		posicionesTablero[7]=posicion8;
		posicionesTablero[8]=posicion9;
		
		
		 
		
		
		
	}
	
	
	public void seleccionar(int posicion) {
		if(posicionesTablero[posicion].getText().isEmpty()&& opcionSeleccionada==0) {
			posicionesTablero[posicion].setText("X");
		}else if(posicionesTablero[posicion].getText().isEmpty()&& opcionSeleccionada==1){
			posicionesTablero[posicion].setText("O");
		}
	}
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
}