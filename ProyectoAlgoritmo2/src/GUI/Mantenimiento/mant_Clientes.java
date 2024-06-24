package GUI.Mantenimiento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mant_Clientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTlf;
	private JTextField txtDNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mant_Clientes frame = new mant_Clientes();
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
	public mant_Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIngreso = new JButton("Ingreso");
		btnIngreso.setBounds(228, 11, 92, 23);
		contentPane.add(btnIngreso);
		
		JButton btnMod = new JButton("Modificación");
		btnMod.setBounds(330, 11, 94, 23);
		contentPane.add(btnMod);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(228, 47, 92, 23);
		contentPane.add(btnConsulta);
		
		JButton btnEliminar = new JButton("Eliminacion");
		btnEliminar.setBounds(330, 47, 94, 23);
		contentPane.add(btnEliminar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(284, 81, 89, 23);
		contentPane.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 157, 414, 274);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(84, 15, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lvlCodigo = new JLabel("Codigo");
		lvlCodigo.setBounds(10, 18, 64, 14);
		lvlCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lvlCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lvlCodigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 40, 64, 14);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(84, 37, 86, 20);
		txtNombre.setColumns(10);
		contentPane.add(txtNombre);
		
		JLabel lvlApellido = new JLabel("Apellido");
		lvlApellido.setBounds(10, 62, 64, 14);
		lvlApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lvlApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lvlApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(84, 59, 86, 20);
		txtApellido.setColumns(10);
		contentPane.add(txtApellido);
		
		JLabel lvlDireccion = new JLabel("Direccion");
		lvlDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lvlDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lvlDireccion.setBounds(10, 84, 64, 14);
		contentPane.add(lvlDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(84, 81, 86, 20);
		contentPane.add(txtDireccion);
		
		JLabel lvlTelefono = new JLabel("Telefono");
		lvlTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lvlTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lvlTelefono.setBounds(10, 107, 64, 14);
		contentPane.add(lvlTelefono);
		
		txtTlf = new JTextField();
		txtTlf.setColumns(10);
		txtTlf.setBounds(84, 104, 86, 20);
		contentPane.add(txtTlf);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(10, 130, 64, 14);
		contentPane.add(lblDni);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(84, 127, 86, 20);
		contentPane.add(txtDNI);
	}
}
