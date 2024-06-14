package Problema2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea txtArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2 frame = new Problema_2();
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
	public Problema_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Medico Medico = new Medico(20240613, 10, 50);
				
				listadoMedico("Codigo :" + String.valueOf(Medico.getCodigo()));
				listadoMedico("Tarifa por consulta :"+String.valueOf(Medico.getTarifaConsulta()));
				listadoMedico("Numero de Consultas :"+String.valueOf(Medico.getNumConsultas()));
				listadoGeneral();
				
				
			}
		});
		btnProcesar.setBounds(161, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 205);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(txtArea);
		
		
	}
	
	
	public void listadoMedico(String x ) {
		txtArea.append(x+"\n");
	}
	
	public void listadoGeneral() {
		txtArea.append("Ingreso Neto general :"+Medico.getIngresosNetosMedicos());
	}

}
