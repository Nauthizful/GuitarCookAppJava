package guitarCookApp.views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import guitarCookApp.controller.Generateurs;

public class Fenetre extends JFrame {
	private JPanel panelPrincipal;
	private JPanel contentPane;

	private JLabel guitarCookApp;
	
	private JLabel labelCarte;
	private JTextField tfCarte;
	
	private JLabel labelCouleur;
	private JTextField tfCouleur;
	
	private JLabel labelAccords;
	private JTextField tfAccords;
	
	private JLabel labelTempo;
	private JTextField tfTempo;
	
	private JButton btnGenerer;

	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanelPrincipal(), BorderLayout.NORTH);
	}

	private JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();

			panelPrincipal.add(getGuitarCookApp());
			
			panelPrincipal.add(getLabelCarte());
			panelPrincipal.add(getTfCarte());
			
			panelPrincipal.add(getLabelCouleur());
			panelPrincipal.add(getTfCouleur());
			
			panelPrincipal.add(getLabelAccords());
			panelPrincipal.add(getTfAccords());
			
			panelPrincipal.add(getLabelTempo());
			panelPrincipal.add(getTfTempo());
			
			panelPrincipal.add(getBtnGenerer());

		}
		return panelPrincipal;
	}

	private JLabel getGuitarCookApp() {
		if(guitarCookApp == null) {
			guitarCookApp = new JLabel("GuitarCookApp");
		}
		return guitarCookApp;
	}

	public JLabel getLabelCarte() {
		if(labelCarte == null) {
			labelCarte = new JLabel("Carte : ");
		}
		return labelCarte;
	}

	public JTextField getTfCarte() {
		if(tfCarte == null) {
			tfCarte = new JTextField();
			tfCarte.setColumns(10);
			tfCarte.setFocusable(false);
		}
		return tfCarte;
	}

	public JLabel getLabelCouleur() {
		if(labelCouleur == null) {
			labelCouleur = new JLabel("Couleur : ");
		}
		return labelCouleur;
	}

	public JTextField getTfCouleur() {
		if(tfCouleur == null) {
			tfCouleur = new JTextField();
			tfCouleur.setColumns(10);
			tfCouleur.setFocusable(false);
		}
		return tfCouleur;
	}

	public JLabel getLabelAccords() {
		if(labelAccords == null) {
			labelAccords = new JLabel("Accords : ");
		}
		return labelAccords;
	}

	public JTextField getTfAccords() {
		if(tfAccords == null) {
			tfAccords = new JTextField();
			tfAccords.setColumns(10);
			tfAccords.setFocusable(false);
		}
		return tfAccords;
	}

	public JLabel getLabelTempo() {
		if(labelTempo == null) {
			labelTempo = new JLabel("Tempo : ");
		}
		return labelTempo;
	}

	public JTextField getTfTempo() {
		if(tfTempo == null) {
			tfTempo = new JTextField();
			tfTempo.setColumns(10);
			tfTempo.setFocusable(false);
		}
		return tfTempo;
	}
	
	public JButton getBtnGenerer() {
		if(btnGenerer == null) {
			btnGenerer = new JButton("Generer");
			btnGenerer.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0)
				{
					generer();
				}
			});
		}
		return btnGenerer;
	}
	
	public void generer(){
		tfCarte.setText("Ecclésiastiques");
		tfCouleur.setText(Generateurs.randCouleur());
		tfAccords.setText("1 4 3 6");
		tfTempo.setText(Generateurs.randTempo());
	}
}