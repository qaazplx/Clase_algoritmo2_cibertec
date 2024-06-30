package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Problema1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema1 frame = new Problema1();
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
	public Problema1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDatos = new JTextField();
		txtDatos.setBounds(66, 11, 86, 20);
		contentPane.add(txtDatos);
		txtDatos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Datos");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(164, 10, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(263, 10, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnRPSM1000 = new JButton("Reemplazar primer sueldo menor que 1000");
		btnRPSM1000.setBounds(164, 44, 243, 20);
		contentPane.add(btnRPSM1000);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(10, 77, 400, 287);
		contentPane.add(txtArea);
	}
}
