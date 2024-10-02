package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;

import Dominio.Pelicula;

import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class PanelAgregarPelicula extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private ListModel<Pelicula> listModel;

	/**
	 * Create the panel.
	 */
	public PanelAgregarPelicula() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(100, 49, 46, 14);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(100, 83, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(100, 116, 46, 14);
		add(lblGenero);
		
		JLabel lblNroID = new JLabel("New label");
		lblNroID.setBounds(194, 49, 125, 14);
		add(lblNroID);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(194, 80, 125, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox cmbGenero = new JComboBox();
		cmbGenero.setBounds(194, 113, 125, 20);
		add(cmbGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(100, 159, 89, 23);
		add(btnAceptar);

	}

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2) {
		this.listModel = listModel2;		
	}

}
