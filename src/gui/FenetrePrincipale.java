package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	
	//Nos variables
	private Puit puit;
	boolean perdu;
	boolean start;
	long score;
	int niveau;
	int nbLignes;
	int interval;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
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
	public FenetrePrincipale() 
	{

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		//contentPane.setForeground(Color.ORANGE);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Affichage du puit
		/*
		JPanel panel = new JPanel();
		panel.setBounds(10,10,280,500);
		contentPane.add(panel);
		*/
		initGame();
		
		
	}
	
	public void initGame()
	{
		puit = new Puit(10,10,280,500);
		perdu = false;
		score = 0;
		niveau = 0;
		nbLignes = 0;
		interval = 1000; // 1 secondes
		start = false;
		
		
		Graphics g = this.getContentPane().getGraphics();
		puit.getTetrominoCourant().dessiner(g);
		
	}
}
