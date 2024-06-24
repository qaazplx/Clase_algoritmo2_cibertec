package GUI.Mantenimiento;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class mant_Productos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecioxUnidad;
	private JTextField txtStockMin;
	private JTextField txtStockMax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mant_Productos frame = new mant_Productos();
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
	public mant_Productos() {
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
		scrollPane.setBounds(10, 135, 414, 296);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(84, 15, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(10, 18, 64, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 40, 64, 14);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(84, 37, 86, 20);
		txtNombre.setColumns(10);
		contentPane.add(txtNombre);
		
		JLabel lblTelefono = new JLabel("X Unidad");
		lblTelefono.setBounds(10, 62, 64, 14);
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblTelefono);
		
		txtPrecioxUnidad = new JTextField();
		txtPrecioxUnidad.setBounds(84, 59, 86, 20);
		txtPrecioxUnidad.setColumns(10);
		contentPane.add(txtPrecioxUnidad);
		
		JLabel lblEmpresa = new JLabel("Stock Min");
		lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmpresa.setBounds(10, 84, 64, 14);
		contentPane.add(lblEmpresa);
		
		txtStockMin = new JTextField();
		txtStockMin.setColumns(10);
		txtStockMin.setBounds(84, 81, 86, 20);
		contentPane.add(txtStockMin);
		
		JLabel lblStockMax = new JLabel("Stock Max");
		lblStockMax.setHorizontalAlignment(SwingConstants.CENTER);
		lblStockMax.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStockMax.setBounds(10, 107, 64, 14);
		contentPane.add(lblStockMax);
		
		txtStockMax = new JTextField();
		txtStockMax.setColumns(10);
		txtStockMax.setBounds(84, 104, 86, 20);
		contentPane.add(txtStockMax);
	}

}
