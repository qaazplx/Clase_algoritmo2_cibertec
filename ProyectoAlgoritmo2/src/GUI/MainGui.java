package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnAlmacen;
	private JMenu rReportes;
	private JMenuItem miClientes;
	private JMenuItem miProductos;
	private JMenuItem alNR;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
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
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 989, 22);
			contentPane.add(menuBar);
			{
				mnMantenimiento = new JMenu("Mantenimiento");
				menuBar.add(mnMantenimiento);
				{
					miClientes = new JMenuItem("Clientes");
					mnMantenimiento.add(miClientes);
				}
				{
					miProductos = new JMenuItem("Productos");
					mnMantenimiento.add(miProductos);
				}
			}
			{
				mnVentas = new JMenu("Ventas");
				menuBar.add(mnVentas);
				
				JMenuItem vRegistro = new JMenuItem("Registro");
				mnVentas.add(vRegistro);
			}
			{
				mnAlmacen = new JMenu("Almacen");
				menuBar.add(mnAlmacen);
				{
					alNR = new JMenuItem("Nuevo Registro");
					mnAlmacen.add(alNR);
				}
			}
			{
				rReportes = new JMenu("Reportes");
				menuBar.add(rReportes);
				{
					mntmNewMenuItem = new JMenuItem("Generador de Reportes");
					rReportes.add(mntmNewMenuItem);
				}
			}
		}
	}
}
