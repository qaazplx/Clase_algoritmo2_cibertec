package Problema1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_1 frame = new Problema_1();
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
	public Problema_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 45, 414, 205);
		contentPane.add(scrollPane);
		
		JTextArea txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cilindro Cilindro =new Cilindro(10,30);
				ListadoCilindro(String.valueOf(Cilindro.getAltura()));
				ListadoCilindro(String.valueOf(Cilindro.getRadio()));
				ListadoCilindro(String.valueOf(Cilindro.VolumenTotal()));
				ListadoCilindro("--------------------------");
				
				Cilindro.setAltura(Cilindro.getAltura()*1.45);
				Cilindro.setRadio(Cilindro.getRadio()*1.17);
				
				ListadoCilindro(String.valueOf(Cilindro.getAltura()));
				ListadoCilindro(String.valueOf(Cilindro.getRadio()));
				ListadoCilindro(String.valueOf(Cilindro.VolumenTotal()));
				ListadoCilindro("--------------------------");
				
				;
				
			}
			
			public void ListadoCilindro(String x) {
				txtArea.append(x+"\n");
			}
			
		});
		btnProcesar.setBounds(165, 11, 89, 23);
		contentPane.add(btnProcesar);
	}
	
	
}
