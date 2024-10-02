package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import Dominio.Categoria;
import Dominio.Pelicula;

import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPelicula extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private DefaultListModel<Pelicula> listModel;
	private JComboBox<Categoria> cmbGenero;

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
		
		JLabel lblNroID = new JLabel(String.valueOf(Pelicula.getContador()));
		lblNroID.setBounds(194, 49, 125, 14);
		add(lblNroID);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(194, 80, 125, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cmbGenero = new JComboBox();
		cmbGenero.setBounds(194, 113, 125, 20);
		add(cmbGenero);
		cmbGenero.addItem(new Categoria(0, "Seleccione un Genero"));
		cmbGenero.addItem(new Categoria(1, "Terror"));
		cmbGenero.addItem(new Categoria(2, "Accion"));
		cmbGenero.addItem(new Categoria(3, "Suspenso"));
		cmbGenero.addItem(new Categoria(4, "Romantica"));
		
		JButton btnAceptar = new JButton("Aceptar");
		//Evento Aceptar
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Validacion
				
				if (txtNombre.getText() == null || txtNombre.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
					return;
				}
				if (cmbGenero.getSelectedIndex() == 0)
				{
					JOptionPane.showMessageDialog(null, "El genero no puede estar vacio");
					return;
				}
				
				//accion
				Pelicula pelicula = new Pelicula();
				pelicula.setNombre(txtNombre.getText());
				pelicula.setCategoria((Categoria) cmbGenero.getSelectedItem());
				
				listModel.addElement(pelicula);
				
				txtNombre.setText("");
				cmbGenero.setSelectedIndex(0);
				lblNroID.setText(String.valueOf(Pelicula.getContador()));
					
			}
		});
		btnAceptar.setBounds(100, 159, 89, 23);
		add(btnAceptar);

	}

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;		
	}

}
