import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;


public class NichtLustigTry1 {

	private JFrame frame;
	private JPanel serverPanel;
	private JPanel loginPanel;
	private JPanel lobbyPanel;
	private JPanel statistikPanel;
	private JPanel regelnPanel;
	private JPanel spielPanel;
	private JTextField txtUserName;
	private JTextField txtPassword;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NichtLustigTry1 window = new NichtLustigTry1();
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
	public NichtLustigTry1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel serverPanel = new JPanel();
		frame.getContentPane().add(serverPanel, "name_21863017452326");
		serverPanel.setLayout(null);
		serverPanel.setVisible(true);
		
		JPanel loginPanel = new JPanel();
		frame.getContentPane().add(loginPanel, "name_21888022450444");
		loginPanel.setLayout(null);
		
		JPanel lobbyPanel = new JPanel();
		frame.getContentPane().add(lobbyPanel, "name_21891613558353");
		lobbyPanel.setLayout(new BorderLayout(0, 0));
		
		JButton btnLogout = new JButton("Logout");
		lobbyPanel.add(btnLogout);
		
		JButton btnSpielErstellen = new JButton("Spiel erstellen");
		lobbyPanel.add(btnSpielErstellen);
		
		JButton btnStatistik = new JButton("Statistik");
		btnStatistik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(true);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		lobbyPanel.add(btnStatistik);
		
		JButton btnSpielregeln = new JButton("Spielregeln");
		btnSpielregeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(true);
				spielPanel.setVisible(false);
			}
		});
		lobbyPanel.add(btnSpielregeln, BorderLayout.CENTER);
		
		JList list = new JList();
		list.setBackground(Color.GREEN);
		lobbyPanel.add(list, BorderLayout.SOUTH);
		
		JButton btnSpielbeitreten = new JButton("Spiel beitreten");
		btnSpielbeitreten.setVerticalAlignment(SwingConstants.TOP);
		btnSpielbeitreten.setHorizontalAlignment(SwingConstants.LEFT);
		btnSpielbeitreten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(true);
			}
		});
		lobbyPanel.add(btnSpielbeitreten, BorderLayout.WEST);
		
		JPanel statistikPanel = new JPanel();
		frame.getContentPane().add(statistikPanel, "name_22058065810996");
		statistikPanel.setLayout(null);
		
		JButton btnStatistikBeenden = new JButton("Statistik beenden");
		btnStatistikBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnStatistikBeenden.setBounds(417, 424, 153, 29);
		statistikPanel.add(btnStatistikBeenden);
		
		JPanel regelnPanel = new JPanel();
		frame.getContentPane().add(regelnPanel, "name_22048753252775");
		regelnPanel.setLayout(null);
		
		JButton btnRegelnBeenden = new JButton("Regeln beenden");
		btnRegelnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnRegelnBeenden.setBounds(410, 439, 188, 29);
		regelnPanel.add(btnRegelnBeenden);
		
		JPanel spielPanel = new JPanel();
		frame.getContentPane().add(spielPanel, "name_22052204583336");
		spielPanel.setLayout(null);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnExit.setBounds(416, 375, 117, 29);
		spielPanel.add(btnExit);
		
		JButton btnNewButton = new JButton("Server starten");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginPanel.setVisible(true);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnNewButton.setBounds(158, 206, 117, 29);
		serverPanel.add(btnNewButton);
		
		JButton btnServerAusschalten = new JButton("Server ausschalten");
		btnServerAusschalten.setBounds(305, 206, 239, 29);
		serverPanel.add(btnServerAusschalten);
		
		JButton btnBeenden = new JButton("beenden");
		btnBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnBeenden.setBounds(392, 415, 117, 29);
		serverPanel.add(btnBeenden);
		
		JRadioButton rdbtnServerAn = new JRadioButton("Server an");
		rdbtnServerAn.setBounds(265, 84, 141, 23);
		serverPanel.add(rdbtnServerAn);
		
		JRadioButton rdbtnServerAus = new JRadioButton("Server aus");
		rdbtnServerAus.setSelected(true);
		rdbtnServerAus.setBounds(265, 128, 141, 23);
		serverPanel.add(rdbtnServerAus);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(true);
				lobbyPanel.setVisible(false);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);	
			}
		});
		btnBack.setBounds(539, 520, 117, 29);
		loginPanel.add(btnBack);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				serverPanel.setVisible(false);
				lobbyPanel.setVisible(true);
				statistikPanel.setVisible(false);
				regelnPanel.setVisible(false);
				spielPanel.setVisible(false);
			}
		});
		btnLogin.setBounds(185, 392, 117, 29);
		loginPanel.add(btnLogin);
		
		JButton btnRegistrieren = new JButton("registrieren");
		btnRegistrieren.setBounds(370, 392, 117, 29);
		loginPanel.add(btnRegistrieren);
		
		txtUserName = new JTextField();
		txtUserName.setText("user name");
		txtUserName.setBounds(353, 285, 134, 28);
		loginPanel.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("password");
		txtPassword.setBounds(353, 322, 134, 28);
		loginPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setBounds(204, 291, 98, 16);
		loginPanel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(204, 328, 61, 16);
		loginPanel.add(lblPassword);
		
		
		
		
	}
}
