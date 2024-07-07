package Problema2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea textArea = new JTextArea();
	
	
	ArrayList<AlquilerLocalComercial> ALC= new ArrayList<AlquilerLocalComercial>();
	ArrayList<AlquilerAirbnb> AAB= new ArrayList<AlquilerAirbnb>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ALC.add(new AlquilerLocalComercial(1,"cesar",20,150));
				AAB.add(new AlquilerAirbnb(99, "liseth", 100,15));
				
				mostrarAlquilerLocal (ALC.get(1));
				mostrarAlquilerAirbnb (AAB.get(1));
			}
		});
		btnProcesar.setBounds(169, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 452, 542);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(textArea);
	}
	
	public void mostrarAlquilerLocal (AlquilerLocalComercial x) {
		textArea.append(x.getCodCliente()+""+"\n");
		textArea.append(x.getNombCliente()+""+"\n");
		textArea.append(x.getMesAlquiler()+""+"\n");
		textArea.append(x.getMetraje()+""+"\n");
		textArea.append(x.costoAlquiler()+""+"\n");
		textArea.append("-------------------------------------------"+"\n");
	}
	
	public void mostrarAlquilerAirbnb (AlquilerAirbnb x) {
		textArea.append(x.getCodCliente()+""+"\n");
		textArea.append(x.getNombCliente()+""+"\n");
		textArea.append(x.getDíasAlquiler()+""+"\n");
		textArea.append(x.getTarifaDiaria()+""+"\n");
		textArea.append(x.costoAlquiler()+""+"\n");
		textArea.append("-------------------------------------------"+"\n");
	}
	
	
}
