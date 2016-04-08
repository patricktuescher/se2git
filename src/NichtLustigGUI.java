import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;

import java.awt.Component;

import javax.swing.JInternalFrame;

import java.awt.FlowLayout;

import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;


public class NichtLustigTry2 {

	private JFrame frame;
	private JPanel serverPanel;
	private JPanel loginPanel;
	private JPanel lobbyPanel;
	private JPanel statistikPanel;
	private JPanel regelPanel;
	private JPanel spielPanel;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NichtLustigTry2 window = new NichtLustigTry2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NichtLustigTry2() {
		initialize();
	}

	// frame settings
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setSize(1000,750);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		
		// creates serverPanel
		JPanel serverPanel = new JPanel();
		serverPanel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(serverPanel, "name_217034720425");
		serverPanel.setLayout(null);
		
		// creates loginPanel
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(loginPanel, "name_217034720455");
		loginPanel.setLayout(null);
		
		// creates statistikPanel
		JPanel statistikPanel = new JPanel();
		statistikPanel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(statistikPanel, "name_226424036944");
		statistikPanel.setLayout(null);
		
		// creates regelPanel
		JPanel regelPanel = new JPanel();
		regelPanel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(regelPanel, "name_214942748004");
		regelPanel.setLayout(null);
		
		// creates lobbyPanel
		JPanel lobbyPanel = new JPanel();
		lobbyPanel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(lobbyPanel, "name_223073854232");
		lobbyPanel.setLayout(null);
		
		// creates spielPanel
		JPanel spielPanel = new JPanel();
		spielPanel.setBackground(new Color(220, 20, 60));
		frame.getContentPane().add(spielPanel, "name_228347837860");
		spielPanel.setLayout(null);
		
		
		
		
		
		// serverPanel Components
		JRadioButton rdbtnServerEin = new JRadioButton("Server an");
		rdbtnServerEin.setBounds(458, 141, 200, 50);
		serverPanel.add(rdbtnServerEin);
		
		JRadioButton rdbtnServerAus = new JRadioButton("Server aus");
		rdbtnServerAus.setSelected(true);
		rdbtnServerAus.setBounds(458, 203, 200, 50);
		serverPanel.add(rdbtnServerAus);
		
		JButton btnServerEinschalten = new JButton("Server einschalten");
		btnServerEinschalten.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnServerEinschalten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnServerAus.setSelected(false);
				rdbtnServerEin.setSelected(true);
				serverPanel.setVisible(false);
				loginPanel.setVisible(true);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnServerEinschalten.setBounds(325, 437, 300, 100);
		serverPanel.add(btnServerEinschalten);
		
		JButton btnServerAusschalten = new JButton("Server ausschalten");
		btnServerAusschalten.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnServerAusschalten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnServerAus.setSelected(true);
				rdbtnServerEin.setSelected(false);
			}
		});
		btnServerAusschalten.setBounds(325, 568, 300, 100);
		serverPanel.add(btnServerAusschalten);
		
		JButton btnServerExit = new JButton("Server exit");
		btnServerExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnServerExit.setBounds(863, 681, 117, 29);
		serverPanel.add(btnServerExit);
		
		// serverPanel Images
		JLabel lblServerImgSensemann = new JLabel("");
		Image serverImgSensemann = new ImageIcon(this.getClass().getResource("/Sensemann.png")).getImage();
		lblServerImgSensemann.setIcon(new ImageIcon(serverImgSensemann));
		lblServerImgSensemann.setBounds(614, -47, 622, 598);
		serverPanel.add(lblServerImgSensemann);
		
		JLabel lblServerImgBackground = new JLabel("");
		Image serverImgBackground = new ImageIcon(this.getClass().getResource("/NichtLustigCollage2.png")).getImage();
		lblServerImgBackground.setIcon(new ImageIcon(serverImgBackground));
		lblServerImgBackground.setBounds(0, 374, 1000, 354);
		serverPanel.add(lblServerImgBackground);
		
		
		
		// loginPanel Components
		
		JButton btnRegistieren = new JButton("Registieren");
		btnRegistieren.setBounds(172, 278, 117, 29);
		loginPanel.add(btnRegistieren);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnServerAus.setSelected(false);
				rdbtnServerEin.setSelected(true);
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnLogin.setBounds(338, 278, 117, 29);
		loginPanel.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(328, 156, 134, 28);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(328, 196, 134, 28);
		loginPanel.add(passwordField);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setForeground(new Color(255, 255, 255));
		lblUserName.setBounds(172, 156, 79, 28);
		loginPanel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(172, 196, 79, 28);
		loginPanel.add(lblPassword);
		
		JButton btnLoginbeenden = new JButton("loginBeenden");
		btnLoginbeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(true);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
				
			}
		});
		btnLoginbeenden.setBounds(847, 673, 117, 29);
		loginPanel.add(btnLoginbeenden);
		
		// loginPanel Images
		
		JLabel lblLoginImgSensemann = new JLabel("");
		Image loginImgSensemann = new ImageIcon(this.getClass().getResource("/Sensemann.png")).getImage();
		lblLoginImgSensemann.setIcon(new ImageIcon(loginImgSensemann));
		lblLoginImgSensemann.setBounds(614, -47, 622, 598);
		loginPanel.add(lblLoginImgSensemann);
		
		
		JLabel lblLoginImgBackground = new JLabel("");
		Image loginImgBackground = new ImageIcon(this.getClass().getResource("/NichtLustigCollage2.png")).getImage();
		lblLoginImgBackground.setIcon(new ImageIcon(loginImgBackground));
		lblLoginImgBackground.setBounds(0, 374, 1000, 354);
		loginPanel.add(lblLoginImgBackground);
		
		
		
		
		

		
		
		// lobbyPanel Components
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		list.setForeground(new Color(255, 255, 255));
		list.setSelectedIndex(0);
		list.setValueIsAdjusting(true);
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(332, 578, 311, -197);
		lobbyPanel.add(list);
		
		JButton btnSpielErstellen = new JButton("Spiel erstellen");
		btnSpielErstellen.setBounds(235, 252, 117, 29);
		lobbyPanel.add(btnSpielErstellen);
		
		JButton btnStatistik = new JButton("Statistik");
		btnStatistik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(true);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnStatistik.setBounds(422, 252, 117, 29);
		lobbyPanel.add(btnStatistik);
		
		JButton btnRegeln = new JButton("Regeln");
		btnRegeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {;
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(true);
				spielPanel.setVisible(false);
			}
		});
		btnRegeln.setBounds(613, 252, 117, 29);
		lobbyPanel.add(btnRegeln);
		
		JButton btnLobbyBeenden = new JButton("Lobby beenden");
		btnLobbyBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(false);
				loginPanel.setVisible(true);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnLobbyBeenden.setBounds(799, 663, 139, 29);
		lobbyPanel.add(btnLobbyBeenden);
		
		JButton btnSpielBeitreten = new JButton("Spiel beitreten");
		btnSpielBeitreten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(true);
			}
		});
		btnSpielBeitreten.setBounds(422, 553, 117, 29);
		lobbyPanel.add(btnSpielBeitreten);
		
		
		
		
		// statistikPanel Components
		JButton btnStatistikBeenden = new JButton("Statistik beenden");
		btnStatistikBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnStatistikBeenden.setBounds(818, 677, 153, 29);
		statistikPanel.add(btnStatistikBeenden);
		
		
		
		
		//regelPanel Components
		JButton btnRegelnBeenden = new JButton("Regeln beenden");
		btnRegelnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnRegelnBeenden.setBounds(826, 674, 143, 29);
		regelPanel.add(btnRegelnBeenden);
		
		
	
		// spielPanel Components
		JButton btnSpielBeenden = new JButton("Spiel beenden");
		btnSpielBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serverPanel.setVisible(false);
				loginPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnSpielBeenden.setBounds(866, 678, 117, 29);
		spielPanel.add(btnSpielBeenden);
	}
}
