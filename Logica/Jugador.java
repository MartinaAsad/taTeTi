package Logica;

import javax.swing.JOptionPane;

public class Jugador {
	private String nombre;
	
	public Jugador(){
		
	}
	public Jugador(String nombre){
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void solicitarNombre() {
		String n=JOptionPane.showInputDialog(null, "Escribe tu nombre: ");
		this.setNombre(n);
	}

}

