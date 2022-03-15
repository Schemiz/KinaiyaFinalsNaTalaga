import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;

public class InventoryartistUS {

	private JFrame inventoryartus;
	private JTextField txt_artistus;
	private JTextField txt_artistidus;
	private JTable tableartworksus;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryartistUS window = new InventoryartistUS();
					window.inventoryartus.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventoryartistUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inventoryartus = new JFrame();
		inventoryartus.setBounds(100, 100, 1140, 624);
		inventoryartus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inventoryartus.getContentPane().setLayout(null);
		inventoryartus.setVisible(true);
		
		JButton btnartistuser2 = new JButton("");
		Image artisticon = new ImageIcon(this.getClass().getResource("/ARTIST SMALL ICON.png")).getImage();
		btnartistuser2.setIcon(new ImageIcon(artisticon));
		btnartistuser2.setBounds(791, 116, 44, 42);
		inventoryartus.getContentPane().add(btnartistuser2);
		
		JButton btnarworksuser2 = new JButton("");
		btnarworksuser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartus.dispose();
				new InventoryartworksUS();
			}
		});
		Image artworkicon = new ImageIcon(this.getClass().getResource("/ARTWORK SMALL ICON.png")).getImage();
		btnarworksuser2.setIcon(new ImageIcon(artworkicon));
		btnarworksuser2.setBounds(421, 116, 44, 42);
		inventoryartus.getContentPane().add(btnarworksuser2);
		
		txt_artistus = new JTextField();
		txt_artistus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artistus.setBounds(35, 305, 226, 38);
		inventoryartus.getContentPane().add(txt_artistus);
		txt_artistus.setColumns(10);
		
		JLabel lblartist = new JLabel("ARTIST:");
		lblartist.setFont(new Font("Verdana", Font.BOLD, 20));
		lblartist.setForeground(new Color(51, 0, 0));
		lblartist.setBounds(35, 271, 116, 23);
		inventoryartus.getContentPane().add(lblartist);
		
		JLabel lblartistid = new JLabel("ARTIST ID:");
		lblartistid.setFont(new Font("Verdana", Font.BOLD, 20));
		lblartistid.setForeground(new Color(51, 0, 0));
		lblartistid.setBounds(35, 188, 130, 23);
		inventoryartus.getContentPane().add(lblartistid);
		
		
		txt_artistidus = new JTextField();
		txt_artistidus.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artistidus.setBounds(35, 222, 226, 38);
		inventoryartus.getContentPane().add(txt_artistidus);
		txt_artistidus.setColumns(10);
		
		JButton btn_addartistus = new JButton("");
		Image addbtn = new ImageIcon(this.getClass().getResource("/ADD.png")).getImage();
		btn_addartistus.setIcon(new ImageIcon(addbtn));
		btn_addartistus.setBounds(35, 402, 108, 38);
		inventoryartus.getContentPane().add(btn_addartistus);
		
		JButton btn_deleteartistus = new JButton("");
		Image delbtn = new ImageIcon(this.getClass().getResource("/DELETE.png")).getImage();
		btn_deleteartistus.setIcon(new ImageIcon(delbtn));
		btn_deleteartistus.setBounds(153, 451, 108, 38);
		inventoryartus.getContentPane().add(btn_deleteartistus);
		
		JButton btn_clearartistus = new JButton("");
		btn_clearartistus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_artistus.setText("");
				txt_artistidus.setText("");
			}
		});
		Image clrbtn = new ImageIcon(this.getClass().getResource("/CLEAR.png")).getImage();
		btn_clearartistus.setIcon(new ImageIcon(clrbtn));
		btn_clearartistus.setBounds(35, 451, 108, 38);
		inventoryartus.getContentPane().add(btn_clearartistus);
		
		JButton btn_updateartistus = new JButton("");
		Image updbtn = new ImageIcon(this.getClass().getResource("/UPDATE.png")).getImage();
		btn_updateartistus.setIcon(new ImageIcon(updbtn));
		btn_updateartistus.setBounds(153, 402, 108, 38);
		inventoryartus.getContentPane().add(btn_updateartistus);
		
		tableartworksus = new JTable();
		tableartworksus.setBounds(277, 169, 809, 382);
		inventoryartus.getContentPane().add(tableartworksus);
		
		JLabel lblartworksuser2 = new JLabel("ARTWORKS");
		lblartworksuser2.setForeground(new Color(153, 102, 51));
		lblartworksuser2.setFont(new Font("Verdana", Font.BOLD, 25));
		lblartworksuser2.setBounds(475, 120, 201, 38);
		inventoryartus.getContentPane().add(lblartworksuser2);
		
		JLabel lblartistsuser2 = new JLabel("ARTIST");
		lblartistsuser2.setForeground(new Color(51, 0, 0));
		lblartistsuser2.setFont(new Font("Verdana", Font.BOLD, 25));
		lblartistsuser2.setBounds(845, 128, 116, 23);
		inventoryartus.getContentPane().add(lblartistsuser2);
		
		JButton btn_logoutinvus2 = new JButton("");
		btn_logoutinvus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartus.dispose();
				new LoginUser();
			}
		});
		Image logoutbtn = new ImageIcon(this.getClass().getResource("/ICON LOGOUT.png")).getImage();
		btn_logoutinvus2.setIcon(new ImageIcon(logoutbtn));
		btn_logoutinvus2.setBounds(10, 11, 104, 36);
		inventoryartus.getContentPane().add(btn_logoutinvus2);
		
		JLabel lblbg = new JLabel("");
		Image lgbg = new ImageIcon(this.getClass().getResource("/INVENTORY.png")).getImage();
		lblbg.setIcon(new ImageIcon(lgbg));
		lblbg.setBounds(0, 0, 1140, 585);
		inventoryartus.getContentPane().add(lblbg);
	}
}
