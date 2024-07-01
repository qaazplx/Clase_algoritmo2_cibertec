package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Empleados;
import arreglos.ArregloPersonas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Problema2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDNI;
	private JTextField txtCantVent;
	private JTextField txtComixVent;
	private JTextField txtEstado;
	public JTextArea txtArea = new JTextArea();

	public ArregloPersonas aP= new ArregloPersonas();
	public Empleados emp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema2 frame = new Problema2();
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
	public Problema2() {
		
		inicio();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 61, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblCantvent = new JLabel("CantVent");
		lblCantvent.setBounds(162, 10, 46, 14);
		contentPane.add(lblCantvent);
		
		JLabel lblComixvent = new JLabel("ComixVent");
		lblComixvent.setBounds(162, 35, 51, 14);
		contentPane.add(lblComixvent);
		
		JLabel lblNewLabel_5 = new JLabel("Estado");
		lblNewLabel_5.setBounds(162, 60, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(66, 5, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(66, 31, 86, 20);
		contentPane.add(txtNombre);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(66, 56, 86, 20);
		contentPane.add(txtDNI);
		
		txtCantVent = new JTextField();
		txtCantVent.setColumns(10);
		txtCantVent.setBounds(218, 5, 86, 20);
		contentPane.add(txtCantVent);
		
		txtComixVent = new JTextField();
		txtComixVent.setColumns(10);
		txtComixVent.setBounds(218, 30, 86, 20);
		contentPane.add(txtComixVent);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(218, 55, 86, 20);
		contentPane.add(txtEstado);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tempCod= Integer.parseInt(txtCodigo.getText());
				
				if(validadorRegistro(tempCod)== false) {
					String tempNom=String.valueOf(txtNombre.getText());
					String tempDNI=String.valueOf(txtDNI.getText());
					int tempCantVent=Integer.parseInt(txtCantVent.getText());
					double tempComXVent=Double.parseDouble(txtCantVent.getText());
					int tempEstado=Integer.parseInt(txtEstado.getText());
					emp = new Empleados(tempCod,tempNom,tempDNI,tempCantVent,tempComXVent,tempEstado);
					aP.adicionar(emp);
				}else validadorRegistro(tempCod);
			}
		});
		btnAdicionar.setBounds(327, 5, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(validadorDeValorDNI()==true) {
					imprimirEmpleado(aP.buscarDni(String.valueOf(txtDNI)));	
				}else validadorDeValorDNI();
				
				}
		});
		btnConsultar.setBounds(327, 30, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validadorDeValorDNI()==true) {
				aP.buscarDni(String.valueOf(txtDNI.getText())).setCodigo(Integer.parseInt(txtCodigo.getText()));
				aP.buscarDni(String.valueOf(txtDNI.getText())).setNombre(txtCodigo.getText());
				aP.buscarDni(String.valueOf(txtDNI.getText())).setDni(txtDNI.getText());
				aP.buscarDni(String.valueOf(txtDNI.getText())).setCantidadVentas(Integer.parseInt(txtCantVent.getText()));
				aP.buscarDni(String.valueOf(txtDNI.getText())).setComisionxVenta(Double.parseDouble(txtComixVent.getText()));
				aP.buscarDni(String.valueOf(txtDNI.getText())).setEstado(Integer.parseInt(txtEstado.getText()));
				}else validadorDeValorDNI();
			}
		});
		btnModificar.setBounds(327, 55, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validadorDeValorDNI()==true) {
					aP.eliminar(Integer.parseInt(txtDNI.getText()));
				}
				
			}
		});
		btnEliminar.setBounds(327, 80, 89, 23);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 115, 407, 352);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(txtArea);
	}
	
	public boolean validadorRegistro(int x) {
		if(aP.buscarCodigo(x) !=null) {
			message(x);
			return true;
		}return false;
	}
	
	public boolean validadorDeValorDNI() {
		String tempDNIString=txtDNI.getText();
		if(aP.buscarDni(txtDNI.getText())!=null) {
			
			return true;
		} message(tempDNIString); return false;
	}
	
	public void message(String x) {
		JOptionPane.showMessageDialog(null, "Elemento no existente", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void message(int x) {
		JOptionPane.showMessageDialog(null, "Elemento ya Existente", "Error", JOptionPane.ERROR_MESSAGE);
	}
	/*
	public void setTxtLabel(JTextField x,String y) {
		x.setText(y);
	}
	
	public void setTxtLabel(JTextField x,int y) {
		x.setText(y+"");
	}
	
	public void setTxtLabel(JTextField x,double y) {
		x.setText(y+"");
	}*/
	
	public void imprimirEmpleado(Empleados x) {
		imprimir("Codigo	:"+x.getCodigo());
		imprimir("Nombre	:"+x.getNombre());
		imprimir("DNI	:"+x.getDni());
		imprimir("Cantidad de Ventas	:"+x.getCantidadVentas());
		imprimir("Comision por venta	:"+x.getComisionxVenta());
		imprimir("Estado	:"+x.getEstado());
	}
	
	public void imprimir(String x) {
		txtArea.append(x+"\n");
	}
	
	public void inicio() {
		Empleados emp1 = new Empleados(1,"cesar","12345678",20,10.6,0);
		Empleados emp2 = new Empleados(2,"Frank","23456789",12,9,1);
		Empleados emp3 = new Empleados(3,"Bastian","34567890",11,8.7,0);
		Empleados emp4 = new Empleados(4,"Luis","45678901",16,11.1,1);
		Empleados emp5 = new Empleados(5,"Samantha","56789012",18,12,0);
		aP.adicionar(emp1);
		aP.adicionar(emp2);
		aP.adicionar(emp3);
		aP.adicionar(emp4);
		aP.adicionar(emp5);
		}
}
