package gr.aueb.cf.cfapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CodingFactoryFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodingFactoryFrame frame = new CodingFactoryFrame();
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
	public CodingFactoryFrame() {
		setTitle("Coding Factory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
		setSize(800,400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCodingFactory = new JLabel("AUEB Coding Factory");
		lblCodingFactory.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCodingFactory.setForeground(Color.BLUE);
		lblCodingFactory.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCodingFactory, BorderLayout.NORTH);
		
		JTextArea txtCodingFactory = new JTextArea();
		txtCodingFactory.setToolTipText("CF Description");
		txtCodingFactory.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtCodingFactory.setText("Coding Factory is the best...");
		contentPane.add(txtCodingFactory, BorderLayout.CENTER);
		
		JButton btnHideShow = new JButton("Hide");
		btnHideShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnHideShow.getText().equals("Hide")) {
					txtCodingFactory.setVisible(false);
					btnHideShow.setText("Show");
					btnHideShow.setForeground(Color.GREEN);
				}else {
					txtCodingFactory.setVisible(true);
					btnHideShow.setText("Hide");
					btnHideShow.setForeground(Color.RED);
				}
			}
		});
		btnHideShow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHideShow.setForeground(Color.RED);
		contentPane.add(btnHideShow, BorderLayout.WEST);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			
			}
		});
		btnClose.setIcon(new ImageIcon(CodingFactoryFrame.class.getResource("/resources/MicrosoftTeams-image (6).png")));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.setForeground(Color.BLUE);
		contentPane.add(btnClose, BorderLayout.SOUTH);
	}

}
