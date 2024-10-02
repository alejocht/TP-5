package Ventanas;

import javax.swing.JPanel;

import Dominio.Pelicula;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

public class PanelListarPeliculas extends JPanel {

	private DefaultListModel<Pelicula> listModel;
	/**
	 * Create the panel.
	 */
	public PanelListarPeliculas() {
		setLayout(null);
		
		JList list = new JList();
		list.setBounds(116, 33, 284, 219);
		add(list);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(41, 135, 65, 14);
		add(lblPeliculas);

	}

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
		
	}
}
