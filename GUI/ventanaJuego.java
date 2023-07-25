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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaJuego extends JFrame {

	//MEJORAR: METODO COMPROBAR GANADOR PARA QUE NO APAREZCAN 2 GANADORES AL MISMO TIEMPO Y QUE AL SER ASI | CON X NO
	//HAGO EXACTAMENTE LO MISMO CON LA O Y QUE LA DECLARAR A UNO GANADOR SE DESHABILITE PARA APRETAR CASILLEROS Y CHEQUEAR
	//LO QUE PASO CUANDO GANA O
	private JPanel contentPane;
	private JLabel posicionesTablero []=new JLabel[9];
	private ButtonGroup xo=new ButtonGroup();
	String [] opciones={"X" , "O"};
	 int posicionesGanadoras[][]= {
			 {0,1,2},	 				//horizontales
			 {3,4,5},
			 {6,7,8},
			 {0,3,6},					//verticales
			 {1,4,7},
			 {2,5,8},
			 {0,4,8},
			 {2, 4, 6}
	 };

	

	/**
	 * Create the frame.
	 */
	/*String n=JOptionPane.showInputDialog(null, "Escribe tu nombre: ");//aca se le pide al usuario su nombre*/
	int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione su ficha",null,JOptionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
	private JTextField txtGanador;
	public VentanaJuego() {
		setTitle("TateTi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 384);
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
		JLabel posicion1 = new JLabel("");
		posicion1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(0);
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
				
			}
		});
		posicion2.setOpaque(true);
		posicion2.setForeground(new Color(0, 0, 0));
		posicion2.setFont(new Font("Tahoma", Font.BOLD, 35));
		posicion2.setBackground(new Color(255, 255, 255));
		posicion2.setBounds(0, 76, 106, 61);
		tablero.add(posicion2);
		
		JLabel posicion3 = new JLabel();
		posicion3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				seleccionar(2);
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
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
				juegoMaquina();
				comprobarGanador();
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
		
		JButton btnNewButton = new JButton("Reiniciar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<posicionesTablero.length;i++) {
					posicionesTablero[i].setText("");
					posicionesTablero[i].setBackground(Color.WHITE);
				}
				opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione su ficha",null,JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(260, 25, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	public void seleccionar(int posicion) {
		if(posicionesTablero[posicion].getText().isEmpty()&& opcionSeleccionada==0) {
			posicionesTablero[posicion].setText("X");
			
		}else if(posicionesTablero[posicion].getText().isEmpty()&& opcionSeleccionada==1){
			posicionesTablero[posicion].setText("O");
		}
	}
	
	public void juegoMaquina() {
		int posicionVacia=0;//aca se captura una posicion dentro del tablero que este vacia
		for(int i=0;i<posicionesTablero.length;i++) {
			if(posicionesTablero[i].getText().isEmpty()) {//aca se pregunta cual posicion esta vacia
				posicionVacia=i;
			}
		}
		//System.out.println(posicionVacia);
		if(posicionesTablero[posicionVacia].getText().isEmpty()&& opcionSeleccionada==0) {
			posicionesTablero[posicionVacia].setText("O");//aca se setea o en la posicion vacia cuando el usuario selecciona X
		}else if(posicionesTablero[posicionVacia].getText().isEmpty()&& opcionSeleccionada==1) {
			posicionesTablero[posicionVacia].setText("X");//aca se setea x en la posicion vacia cuando el usuario selecciona o
		}
	}
	
	public void comprobarGanador() {
		//texto que muestra quien gano
		txtGanador = new JTextField();
		txtGanador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtGanador.setBounds(209, 314, 210, 31);
		txtGanador.setBackground(new Color(240, 240, 240));
		contentPane.add(txtGanador);
		txtGanador.setColumns(10);
		
		String opcionUsuario=Integer.toString(opcionSeleccionada);
		String opcionGanadora="";
		
		for(int i=0;i<posicionesGanadoras.length;i++) {
			if(posicionesTablero[posicionesGanadoras[i][0]].getText().equals(opciones[0])
					&& posicionesTablero[posicionesGanadoras[i][1]].getText().equals(opciones[0]) &&
					posicionesTablero[posicionesGanadoras[i][2]].getText().equals(opciones[0])) {//si la opcion ganadora es X
			System.out.println(opcionGanadora=posicionesTablero[posicionesGanadoras[i][2]].getText());
				posicionesTablero[posicionesGanadoras[i][0]].setBackground(Color.GREEN);//se colorea la linea ganadora de verde
				posicionesTablero[posicionesGanadoras[i][1]].setBackground(Color.GREEN);
				posicionesTablero[posicionesGanadoras[i][2]].setBackground(Color.GREEN);
				
				txtGanador.setText("Gano la opcion X");
				
				
			}else if(posicionesTablero[posicionesGanadoras[i][0]].getText().equals(opciones[1])
					&& posicionesTablero[posicionesGanadoras[i][1]].getText().equals(opciones[1]) &&
					posicionesTablero[posicionesGanadoras[i][2]].getText().equals(opciones[1])) {//si lsa opcion ganadora es O
				
				posicionesTablero[posicionesGanadoras[i][0]].setBackground(Color.RED);//se colorea la linea ganadora de rojo 
				posicionesTablero[posicionesGanadoras[i][1]].setBackground(Color.RED);
				posicionesTablero[posicionesGanadoras[i][2]].setBackground(Color.RED);
				
				txtGanador.setText("Gano la opcion O");
			}
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJuego frame = new VentanaJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}