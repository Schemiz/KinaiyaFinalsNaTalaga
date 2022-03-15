import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryartistAD {

	private JFrame inventoryartad;
	private JTextField txt_artistad;
	private JTextField txt_artistidad;
	private JTable tableartistad;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryartistAD window = new InventoryartistAD();
					window.inventoryartad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventoryartistAD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inventoryartad = new JFrame();
		inventoryartad.setBounds(100, 100, 1140, 624);
		inventoryartad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inventoryartad.getContentPane().setLayout(null);
		inventoryartad.setVisible(true);
		
		JButton btnarworksadmin2 = new JButton("");
		btnarworksadmin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartad.dispose();
				new InventoryartworksAD();
			}
		});
		Image artworkicon = new ImageIcon(this.getClass().getResource("/ARTWORK SMALL ICON.png")).getImage();
		btnarworksadmin2.setIcon(new ImageIcon(artworkicon));
		btnarworksadmin2.setBounds(421, 116, 44, 42);
		inventoryartad.getContentPane().add(btnarworksadmin2);
		
		JButton btnartistadmin2 = new JButton("");
		Image artisticon = new ImageIcon(this.getClass().getResource("/ARTIST SMALL ICON.png")).getImage();
		btnartistadmin2.setIcon(new ImageIcon(artisticon));
		btnartistadmin2.setBounds(791, 116, 44, 42);
		inventoryartad.getContentPane().add(btnartistadmin2);
		
		txt_artistad = new JTextField();
		txt_artistad.setBounds(35, 305, 226, 38);
		txt_artistad.setFont(new Font("Verdana", Font.PLAIN, 11));
		inventoryartad.getContentPane().add(txt_artistad);
		txt_artistad.setColumns(10);
		
		JLabel lblartist = new JLabel("ARTIST:");
		lblartist.setBounds(35, 271, 116, 23);
		lblartist.setFont(new Font("Verdana", Font.BOLD, 20));
		lblartist.setForeground(new Color(51, 0, 0));
		inventoryartad.getContentPane().add(lblartist);
		
		JLabel lblartistid = new JLabel("ARTIST ID:");
		lblartistid.setBounds(35, 188, 130, 23);
		lblartistid.setFont(new Font("Verdana", Font.BOLD, 20));
		lblartistid.setForeground(new Color(51, 0, 0));
		inventoryartad.getContentPane().add(lblartistid);
		
		
		txt_artistidad = new JTextField();
		txt_artistidad.setBounds(35, 222, 226, 38);
		txt_artistidad.setFont(new Font("Verdana", Font.PLAIN, 11));
		inventoryartad.getContentPane().add(txt_artistidad);
		txt_artistidad.setColumns(10);
		
		JButton btn_addartistus = new JButton("");
		btn_addartistus.setBounds(35, 402, 108, 38);
		Image addbtn = new ImageIcon(this.getClass().getResource("/ADD.png")).getImage();
		btn_addartistus.setIcon(new ImageIcon(addbtn));
		inventoryartad.getContentPane().add(btn_addartistus);
		
		JButton btn_deleteartistus = new JButton("");
		btn_deleteartistus.setBounds(153, 451, 108, 38);
		Image delbtn = new ImageIcon(this.getClass().getResource("/DELETE.png")).getImage();
		btn_deleteartistus.setIcon(new ImageIcon(delbtn));
		inventoryartad.getContentPane().add(btn_deleteartistus);
		
		JButton btn_clearartistus = new JButton("");
		btn_clearartistus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_artistad.setText("");
				txt_artistidad.setText("");
			}
		});
		btn_clearartistus.setBounds(35, 451, 108, 38);
		Image clrbtn = new ImageIcon(this.getClass().getResource("/CLEAR.png")).getImage();
		btn_clearartistus.setIcon(new ImageIcon(clrbtn));
		inventoryartad.getContentPane().add(btn_clearartistus);
		
		JButton btn_updateartistus = new JButton("");
		btn_updateartistus.setBounds(153, 402, 108, 38);
		Image updbtn = new ImageIcon(this.getClass().getResource("/UPDATE.png")).getImage();
		btn_updateartistus.setIcon(new ImageIcon(updbtn));
		inventoryartad.getContentPane().add(btn_updateartistus);
		
		tableartistad = new JTable();
		tableartistad.setBounds(277, 169, 809, 382);
		inventoryartad.getContentPane().add(tableartistad);
		
		JLabel lblartworksuser2 = new JLabel("ARTWORKS");
		lblartworksuser2.setBounds(475, 120, 201, 38);
		lblartworksuser2.setForeground(new Color(153, 102, 51));
		lblartworksuser2.setFont(new Font("Verdana", Font.BOLD, 25));
		inventoryartad.getContentPane().add(lblartworksuser2);
		
		JLabel lblartistsuser2 = new JLabel("ARTIST");
		lblartistsuser2.setBounds(845, 128, 116, 23);
		lblartistsuser2.setForeground(new Color(51, 0, 0));
		lblartistsuser2.setFont(new Font("Verdana", Font.BOLD, 25));
		inventoryartad.getContentPane().add(lblartistsuser2);
		
		JButton btn_backartistus = new JButton("");
		btn_backartistus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartad.dispose();
				new DashboardAD();
			}
		});
		btn_backartistus.setBounds(10, 11, 50, 43);
		Image backbtn = new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		btn_backartistus.setIcon(new ImageIcon(backbtn));
		inventoryartad.getContentPane().add(btn_backartistus);
		
		JLabel lblbg = new JLabel("");
		lblbg.setBounds(0, 0, 1140, 585);
		Image lgbg = new ImageIcon(this.getClass().getResource("/INVENTORY.png")).getImage();
		lblbg.setIcon(new ImageIcon(lgbg));
		inventoryartad.getContentPane().add(lblbg);
	}

}
