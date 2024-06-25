package GUI.Ventas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;

public class Ventas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodCl;
	private JTextField txtCodProd;
	private JTextField txtPrecioxUni;
	private JTextField txtCantidadxAdquirir;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
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
	public Ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo Cliente");
		lblNewLabel.setBounds(10, 27, 86, 14);
		contentPane.add(lblNewLabel);
		
		txtCodCl = new JTextField();
		txtCodCl.setColumns(10);
		txtCodCl.setBounds(95, 24, 86, 20);
		contentPane.add(txtCodCl);
		
		JLabel lblNomYAp = new JLabel("Nom y Ap Cli");
		lblNomYAp.setBounds(10, 58, 86, 14);
		contentPane.add(lblNomYAp);
		
		JComboBox cboNomApeCli = new JComboBox();
		cboNomApeCli.setBounds(95, 55, 86, 20);
		contentPane.add(cboNomApeCli);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 86, 196, 2);
		contentPane.add(separator_1_1);
		
		JComboBox cboNomProd = new JComboBox();
		cboNomProd.setBounds(95, 130, 86, 20);
		contentPane.add(cboNomProd);
		
		JLabel lblNomProducto = new JLabel("Nom Producto");
		lblNomProducto.setBounds(10, 133, 86, 14);
		contentPane.add(lblNomProducto);
		
		JLabel lblCodigoProducto = new JLabel("Codigo Producto");
		lblCodigoProducto.setBounds(10, 102, 86, 14);
		contentPane.add(lblCodigoProducto);
		
		txtCodProd = new JTextField();
		txtCodProd.setColumns(10);
		txtCodProd.setBounds(95, 99, 86, 20);
		contentPane.add(txtCodProd);
		
		JLabel lblCantidadXAdq = new JLabel("Precio Unitario");
		lblCantidadXAdq.setBounds(10, 164, 86, 14);
		contentPane.add(lblCantidadXAdq);
		
		txtPrecioxUni = new JTextField();
		txtPrecioxUni.setColumns(10);
		txtPrecioxUni.setBounds(95, 161, 86, 20);
		contentPane.add(txtPrecioxUni);
		
		JLabel lblCantidad = new JLabel("Cantidad x Adq");
		lblCantidad.setBounds(10, 192, 86, 14);
		contentPane.add(lblCantidad);
		
		txtCantidadxAdquirir = new JTextField();
		txtCantidadxAdquirir.setColumns(10);
		txtCantidadxAdquirir.setBounds(95, 189, 86, 20);
		contentPane.add(txtCantidadxAdquirir);
		
		JButton btnVenta = new JButton("Venta");
		btnVenta.setBounds(10, 250, 89, 23);
		contentPane.add(btnVenta);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(117, 250, 89, 23);
		contentPane.add(btnCancelar);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 11, 196, 2);
		contentPane.add(separator_1_1_1);
		
		JTextArea txtBoleta = new JTextArea();
		txtBoleta.setBounds(230, 27, 258, 246);
		contentPane.add(txtBoleta);
		
		JLabel lblNewLabel_1 = new JLabel("Boleta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(231, 6, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setBounds(275, 12, 210, 3);
		contentPane.add(separator_1_1_2);
		
		JLabel lblFechaDeComp = new JLabel("Fecha de Vent");
		lblFechaDeComp.setBounds(10, 220, 86, 14);
		contentPane.add(lblFechaDeComp);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(95, 217, 86, 20);
		contentPane.add(textField);
	}
}
