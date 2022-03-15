import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageAD {

	private JFrame managead;
	private JTextField txt_emppass;
	private JTextField txt_empname;
	private JTextField txt_empus;
	private JTable table;
	private JTextField txt_empid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageAD window = new ManageAD();
					window.managead.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageAD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		managead = new JFrame();
		managead.setBounds(100, 100, 1140, 624);
		managead.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managead.getContentPane().setLayout(null);
		managead.setVisible(true);
		
		
		JButton btn_backmanage = new JButton("");
		btn_backmanage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managead.dispose();
				new DashboardAD();
			}
		});
		Image backbtn = new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		btn_backmanage.setIcon(new ImageIcon(backbtn));
		btn_backmanage.setBounds(10, 11, 50, 43);
		managead.getContentPane().add(btn_backmanage);
		
		managead.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		managead.getContentPane().add(btn_backmanage);
		
		txt_emppass = new JTextField();
		txt_emppass.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_emppass.setBounds(45, 388, 264, 43);
		managead.getContentPane().add(txt_emppass);
		txt_emppass.setColumns(10);
		
		txt_empname = new JTextField();
		txt_empname.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_empname.setBounds(45, 228, 264, 43);
		managead.getContentPane().add(txt_empname);
		txt_empname.setColumns(10);
		
		txt_empus = new JTextField();
		txt_empus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_empus.setBounds(45, 307, 264, 43);
		managead.getContentPane().add(txt_empus);
		txt_empus.setColumns(10);
		
		JLabel lblemployeename = new JLabel("EMPLOYEE NAME:");
		lblemployeename.setForeground(new Color(51, 0, 0));
		lblemployeename.setFont(new Font("Verdana", Font.BOLD, 16));
		lblemployeename.setBounds(45, 114, 167, 20);
		managead.getContentPane().add(lblemployeename);
		
		JLabel lblusername = new JLabel("USERNAME:");
		lblusername.setFont(new Font("Verdana", Font.BOLD, 16));
		lblusername.setBounds(45, 282, 114, 14);
		managead.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("PASSWORD:");
		lblpassword.setFont(new Font("Verdana", Font.BOLD, 16));
		lblpassword.setBounds(45, 361, 148, 16);
		managead.getContentPane().add(lblpassword);
		
		JLabel lbladduser = new JLabel("ADD USERS");
		lbladduser.setForeground(new Color(51, 0, 0));
		lbladduser.setFont(new Font("Verdana", Font.BOLD, 30));
		lbladduser.setBounds(78, 58, 198, 61);
		managead.getContentPane().add(lbladduser);
		
		JLabel lblexistinguser = new JLabel("LIST OF REGISTERED USERS");
		lblexistinguser.setFont(new Font("Verdana", Font.BOLD, 30));
		lblexistinguser.setForeground(new Color(51, 0, 0));
		lblexistinguser.setBounds(487, 25, 501, 69);
		managead.getContentPane().add(lblexistinguser);
		
		table = new JTable();
		table.setBounds(361, 89, 723, 454);
		managead.getContentPane().add(table);
		
		JButton btn_adduser = new JButton("");
		btn_adduser.setBounds(51, 442, 108, 38);
		Image adduser = new ImageIcon(this.getClass().getResource("/ADD.png")).getImage();
		btn_adduser.setIcon(new ImageIcon(adduser));
		managead.getContentPane().add(btn_adduser);
		
		JButton btn_deleteuser = new JButton("");
		btn_deleteuser.setBounds(185, 505, 108, 38);
		Image deluser = new ImageIcon(this.getClass().getResource("/DELETE.png")).getImage();
		btn_deleteuser.setIcon(new ImageIcon(deluser));
		managead.getContentPane().add(btn_deleteuser);
		
		JButton btn_clearuser = new JButton("");
		btn_clearuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_emppass.setText("");
				txt_empus.setText("");
				txt_empname.setText("");
				txt_empid.setText("");
			}
		});
		btn_clearuser.setBounds(51, 505, 108, 38);
		Image clruser = new ImageIcon(this.getClass().getResource("/CLEAR.png")).getImage();
		btn_clearuser.setIcon(new ImageIcon(clruser));
		managead.getContentPane().add(btn_clearuser);
		
		JButton btn_updateuser = new JButton("");
		btn_updateuser.setBounds(185, 442, 108, 38);
		Image upduser = new ImageIcon(this.getClass().getResource("/UPDATE.png")).getImage();
		btn_updateuser.setIcon(new ImageIcon(upduser));
		managead.getContentPane().add(btn_updateuser);
		
		txt_empid = new JTextField();
		txt_empid.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_empid.setColumns(10);
		txt_empid.setBounds(45, 145, 264, 43);
		managead.getContentPane().add(txt_empid);
		
		JLabel lblemployeeid = new JLabel("EMPLOYEE ID:");
		lblemployeeid.setForeground(new Color(51, 0, 0));
		lblemployeeid.setFont(new Font("Verdana", Font.BOLD, 16));
		lblemployeeid.setBounds(45, 197, 167, 20);
		managead.getContentPane().add(lblemployeeid);
		
		JLabel lblbg = new JLabel("");
		Image lgbg = new ImageIcon(this.getClass().getResource("/BG.png")).getImage();
		lblbg.setIcon(new ImageIcon(lgbg));
		lblbg.setBounds(0, 0, 1140, 585);
		managead.getContentPane().add(lblbg);
		
	}
}
