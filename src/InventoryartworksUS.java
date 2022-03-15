import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class InventoryartworksUS {

	private JFrame inventoryartwus;
	private JTable tbl_arts;
	private JTextField txt_artnameus;
	private JTextField txt_artidus;
	private JTextField txt_datecreatedus;
	private JTextField txt_dateacquiredus;
	private JTextField txt_subus;
	private JTextField txt_artistidus;
	private JTextField txt_orientationus;
	private JTextField txt_empidus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryartworksUS window = new InventoryartworksUS();
					window.inventoryartwus.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventoryartworksUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inventoryartwus = new JFrame();
		inventoryartwus.setBounds(100, 100, 1140, 624);
		inventoryartwus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inventoryartwus.getContentPane().setLayout(null);
		inventoryartwus.setVisible(true);
		
		JLabel lblartistsuser1_1 = new JLabel("ARTIST");
		lblartistsuser1_1.setForeground(new Color(153, 102, 51));
		lblartistsuser1_1.setFont(new Font("Verdana", Font.BOLD, 25));
		lblartistsuser1_1.setBounds(845, 128, 116, 23);
		inventoryartwus.getContentPane().add(lblartistsuser1_1);
		
		JLabel lblartworksuser1 = new JLabel("ARTWORKS");
		lblartworksuser1.setForeground(new Color(51, 0, 0));
		lblartworksuser1.setFont(new Font("Verdana", Font.BOLD, 25));
		lblartworksuser1.setBounds(475, 120, 201, 38);
		inventoryartwus.getContentPane().add(lblartworksuser1);
		
		txt_artistidus = new JTextField();
		txt_artistidus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artistidus.setColumns(10);
		txt_artistidus.setBounds(40, 393, 142, 43);
		inventoryartwus.getContentPane().add(txt_artistidus);
		
		JButton btn_updateus = new JButton("");
		Image updbtn = new ImageIcon(this.getClass().getResource("/UPDATE.png")).getImage();
		btn_updateus.setIcon(new ImageIcon(updbtn));
		btn_updateus.setBounds(63, 512, 108, 38);
		inventoryartwus.getContentPane().add(btn_updateus);
		
		JButton btn_logoutinvus = new JButton("");
		btn_logoutinvus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartwus.dispose();
				new LoginUser();
			}
		});
		Image logout = new ImageIcon(this.getClass().getResource("/ICON LOGOUT.png")).getImage();
		btn_logoutinvus.setIcon(new ImageIcon(logout));
		btn_logoutinvus.setBounds(10, 11, 104, 36);
		inventoryartwus.getContentPane().add(btn_logoutinvus);
		
		
		tbl_arts = new JTable();
		tbl_arts.setFont(new Font("Verdana", Font.PLAIN, 11));
		tbl_arts.setBounds(350, 169, 741, 381);
		inventoryartwus.getContentPane().add(tbl_arts);
		
		JButton btn_addus = new JButton("");
		Image addbtn = new ImageIcon(this.getClass().getResource("/ADD.png")).getImage();
		btn_addus.setIcon(new ImageIcon(addbtn));
		btn_addus.setBounds(63, 463, 108, 38);
		inventoryartwus.getContentPane().add(btn_addus);
		
		JButton btn_deleteus = new JButton("");
		Image delbtn = new ImageIcon(this.getClass().getResource("/DELETE.png")).getImage();
		btn_deleteus.setIcon(new ImageIcon(delbtn));
		btn_deleteus.setBounds(206, 463, 108, 38);
		inventoryartwus.getContentPane().add(btn_deleteus);
		
		JButton btn_clearus = new JButton("");
		btn_clearus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_artnameus.setText("");
				txt_artidus.setText("");
				txt_datecreatedus.setText("");
				txt_dateacquiredus.setText("");
				txt_subus.setText("");
				txt_artistidus.setText("");
				txt_orientationus.setText("");
				txt_empidus.setText("");
			}
		});
		Image clrbtn = new ImageIcon(this.getClass().getResource("/CLEAR.png")).getImage();
		btn_clearus.setIcon(new ImageIcon(clrbtn));
		btn_clearus.setBounds(206, 512, 108, 38);
		inventoryartwus.getContentPane().add(btn_clearus);
		
		txt_artnameus = new JTextField();
		txt_artnameus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artnameus.setBounds(40, 191, 142, 43);
		inventoryartwus.getContentPane().add(txt_artnameus);
		txt_artnameus.setColumns(10);
		
		txt_artidus = new JTextField();
		txt_artidus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artidus.setBounds(192, 191, 142, 43);
		inventoryartwus.getContentPane().add(txt_artidus);
		txt_artidus.setColumns(10);
		
		txt_datecreatedus = new JTextField();
		txt_datecreatedus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_datecreatedus.setBounds(40, 325, 142, 43);
		inventoryartwus.getContentPane().add(txt_datecreatedus);
		txt_datecreatedus.setColumns(10);
		
		txt_dateacquiredus = new JTextField();
		txt_dateacquiredus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_dateacquiredus.setBounds(192, 325, 142, 43);
		inventoryartwus.getContentPane().add(txt_dateacquiredus);
		txt_dateacquiredus.setColumns(10);
		
		txt_subus = new JTextField();
		txt_subus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_subus.setBounds(192, 257, 142, 43);
		inventoryartwus.getContentPane().add(txt_subus);
		txt_subus.setColumns(10);
		
		JLabel lblart = new JLabel("ART NAME:");
		lblart.setForeground(new Color(51, 0, 0));
		lblart.setFont(new Font("Verdana", Font.BOLD, 15));
		lblart.setBounds(40, 170, 131, 22);
		inventoryartwus.getContentPane().add(lblart);
		
		JLabel lblartid = new JLabel("ART ID:");
		lblartid.setForeground(new Color(51, 0, 0));
		lblartid.setBackground(Color.WHITE);
		lblartid.setFont(new Font("Verdana", Font.BOLD, 15));
		lblartid.setBounds(191, 170, 93, 23);
		inventoryartwus.getContentPane().add(lblartid);
		
		JLabel lbldateacq = new JLabel("DATE ACQUIRED:");
		lbldateacq.setFont(new Font("Verdana", Font.BOLD, 15));
		lbldateacq.setForeground(new Color(51, 0, 0));
		lbldateacq.setBounds(191, 302, 149, 23);
		inventoryartwus.getContentPane().add(lbldateacq);
		
		JLabel lblsub = new JLabel("SUBJECT:");
		lblsub.setFont(new Font("Verdana", Font.BOLD, 15));
		lblsub.setForeground(new Color(51, 0, 0));
		lblsub.setBounds(191, 236, 82, 23);
		inventoryartwus.getContentPane().add(lblsub);
		
		JLabel lbldatecreated = new JLabel("DATE CREATED:");
		lbldatecreated.setFont(new Font("Verdana", Font.BOLD, 15));
		lbldatecreated.setForeground(new Color(51, 0, 0));
		lbldatecreated.setBounds(40, 302, 142, 23);
		inventoryartwus.getContentPane().add(lbldatecreated);
		
		JLabel lblorientation = new JLabel("ORIENTATION:");
		lblorientation.setFont(new Font("Verdana", Font.BOLD, 15));
		lblorientation.setForeground(new Color(51, 0, 0));
		lblorientation.setBounds(40, 235, 131, 25);
		inventoryartwus.getContentPane().add(lblorientation);
		
		JLabel lblartistid = new JLabel("ARTIST ID:");
		lblartistid.setFont(new Font("Verdana", Font.BOLD, 15));
		lblartistid.setForeground(new Color(51, 0, 0));
		lblartistid.setBounds(40, 375, 142, 14);
		inventoryartwus.getContentPane().add(lblartistid);
		
		txt_orientationus = new JTextField();
		txt_orientationus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_orientationus.setColumns(10);
		txt_orientationus.setBounds(40, 257, 142, 43);
		inventoryartwus.getContentPane().add(txt_orientationus);
		
		JButton btnartworksuser1 = new JButton("");
		Image artworkicon = new ImageIcon(this.getClass().getResource("/ARTWORK SMALL ICON.png")).getImage();
		btnartworksuser1.setIcon(new ImageIcon(artworkicon));
		btnartworksuser1.setBounds(421, 116, 44, 42);
		inventoryartwus.getContentPane().add(btnartworksuser1);
		
		JButton btnartistuser1 = new JButton("");
		btnartistuser1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartwus.dispose();
				new InventoryartistUS();
			}
		});
		Image artisticon = new ImageIcon(this.getClass().getResource("/ARTIST SMALL ICON.png")).getImage();
		btnartistuser1.setIcon(new ImageIcon(artisticon));
		btnartistuser1.setBounds(791, 116, 44, 42);
		inventoryartwus.getContentPane().add(btnartistuser1);
		
		txt_empidus = new JTextField();
		txt_empidus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_empidus.setColumns(10);
		txt_empidus.setBounds(192, 393, 142, 43);
		inventoryartwus.getContentPane().add(txt_empidus);
		
		JLabel lblemployeeid = new JLabel("EMPLOYEE ID:");
		lblemployeeid.setForeground(new Color(51, 0, 0));
		lblemployeeid.setFont(new Font("Verdana", Font.BOLD, 15));
		lblemployeeid.setBounds(192, 375, 122, 14);
		inventoryartwus.getContentPane().add(lblemployeeid);
		
		
		JLabel lblbg = new JLabel("");
		Image lgbg = new ImageIcon(this.getClass().getResource("/INVENTORY.png")).getImage();
		lblbg.setIcon(new ImageIcon(lgbg));
		lblbg.setBounds(0, 0, 1140, 585);
		inventoryartwus.getContentPane().add(lblbg);
	}
}
