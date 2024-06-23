package Problema1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class MainP1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public JTextArea txtArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainP1 frame = new MainP1();
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
	public MainP1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Asesor Asesor1=new Asesor();
				Asesor Asesor2=new Asesor("Cesar", 48074645);
				Asesor Asesor3=new Asesor("Liseth", 12345678, 1111,4000.0);
				
				listado(Asesor1);
				listado(Asesor2);
				listado(Asesor3);
				
				Imprimir("--------------------------------------------------------------------------");
				Imprimir("Cantidad de ASesores	:" + Asesor.getCantObjAsesor());
				Imprimir("Nombre del Instituto	:"+Asesor.getNomInst());
				Imprimir("Suma de Remuneraciones	:"+Asesor.getSumRem());
				
				
			}
		});
		
		btnProcesar.setBounds(160, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 440);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(txtArea);
	}
	
	public void listado(Asesor x) {
		Imprimir("--------------------------------------------------------------------------");
		Imprimir("Nombre de asesor	:"+x.getNombreAsesor());
		Imprimir("Numero de DNI		:"+x.getDni());
		Imprimir("Codigo		:"+x.getCodigo());
		Imprimir("Remuneracion		:"+x.getRemDol());
	}
	
	public void Imprimir(String x) {
		txtArea.append(x+"\n");
	}
	
}
