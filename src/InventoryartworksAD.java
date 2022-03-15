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

public class InventoryartworksAD {

	private JFrame inventoryartwad;
	private JTable tbl_artsad;
	private JTextField txt_artnamead;
	private JTextField txt_artidad;
	private JTextField txt_datecreatedad;
	private JTextField txt_dateacquiredad;
	private JTextField txt_subad;
	private JTextField txt_artistidad;
	private JTextField txt_orientationad;
	private JTextField txt_empidad;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryartworksAD window = new InventoryartworksAD();
					window.inventoryartwad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventoryartworksAD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		inventoryartwad = new JFrame();
		inventoryartwad.setBounds(100, 100, 1140, 624);
		inventoryartwad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inventoryartwad.getContentPane().setLayout(null);
		inventoryartwad.setVisible(true);
		
		JButton btnartworksadmin1 = new JButton("");
		Image artworkicon = new ImageIcon(this.getClass().getResource("/ARTWORK SMALL ICON.png")).getImage();
		btnartworksadmin1.setIcon(new ImageIcon(artworkicon));
		btnartworksadmin1.setBounds(421, 116, 44, 42);
		inventoryartwad.getContentPane().add(btnartworksadmin1);
		
		JButton btnartistadmin1 = new JButton("");
		btnartistadmin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartwad.dispose();
				new InventoryartistAD();
			}
		});
		Image artisticon = new ImageIcon(this.getClass().getResource("/ARTIST SMALL ICON.png")).getImage();
		btnartistadmin1.setIcon(new ImageIcon(artisticon));
		btnartistadmin1.setBounds(791, 116, 44, 42);
		inventoryartwad.getContentPane().add(btnartistadmin1);
		
		txt_orientationad = new JTextField();
		txt_orientationad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_orientationad.setColumns(10);
		txt_orientationad.setBounds(40, 257, 142, 43);
		inventoryartwad.getContentPane().add(txt_orientationad);
		
		JButton btn_updatead = new JButton("");
		Image updbtn = new ImageIcon(this.getClass().getResource("/UPDATE.png")).getImage();
		btn_updatead.setIcon(new ImageIcon(updbtn));
		btn_updatead.setBounds(63, 512, 108, 38);
		inventoryartwad.getContentPane().add(btn_updatead);
		
		JButton btn_backinvad = new JButton("");
		btn_backinvad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryartwad.dispose();
				new DashboardAD();
			}
		});
		Image backbtn = new ImageIcon(this.getClass().getResource("/Back.png")).getImage();
		btn_backinvad.setIcon(new ImageIcon(backbtn));
		btn_backinvad.setBounds(10, 11, 50, 43);
		inventoryartwad.getContentPane().add(btn_backinvad);
		
		tbl_artsad = new JTable();
		tbl_artsad.setFont(new Font("Verdana", Font.PLAIN, 11));
		tbl_artsad.setBounds(344, 169, 741, 381);
		inventoryartwad.getContentPane().add(tbl_artsad);
		
		JButton btn_addad = new JButton("");
		Image addbtn = new ImageIcon(this.getClass().getResource("/ADD.png")).getImage();
		btn_addad.setIcon(new ImageIcon(addbtn));
		btn_addad.setBounds(63, 463, 108, 38);
		inventoryartwad.getContentPane().add(btn_addad);
		
		JButton btn_deletead = new JButton("");
		Image delbtn = new ImageIcon(this.getClass().getResource("/DELETE.png")).getImage();
		btn_deletead.setIcon(new ImageIcon(delbtn));
		btn_deletead.setBounds(206, 463, 108, 38);
		inventoryartwad.getContentPane().add(btn_deletead);
		
		JButton btn_clearad = new JButton("");
		btn_clearad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_artnamead.setText("");
				txt_artidad.setText("");
				txt_datecreatedad.setText("");
				txt_dateacquiredad.setText("");
				txt_subad.setText("");
				txt_artistidad.setText("");
				txt_orientationad.setText("");
				txt_empidad.setText("");
			}
		});
		Image clrbtn = new ImageIcon(this.getClass().getResource("/Clear.png")).getImage();
		btn_clearad.setIcon(new ImageIcon(clrbtn));
		btn_clearad.setBounds(206, 512, 108, 38);
		inventoryartwad.getContentPane().add(btn_clearad);
		
		txt_artnamead = new JTextField();
		txt_artnamead.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artnamead.setBounds(40, 191, 142, 43);
		inventoryartwad.getContentPane().add(txt_artnamead);
		txt_artnamead.setColumns(10);
		
		txt_artidad = new JTextField();
		txt_artidad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artidad.setBounds(192, 191, 142, 43);
		inventoryartwad.getContentPane().add(txt_artidad);
		txt_artidad.setColumns(10);
		
		txt_datecreatedad = new JTextField();
		txt_datecreatedad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_datecreatedad.setBounds(40, 325, 142, 43);
		inventoryartwad.getContentPane().add(txt_datecreatedad);
		txt_datecreatedad.setColumns(10);
		
		txt_dateacquiredad = new JTextField();
		txt_dateacquiredad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_dateacquiredad.setBounds(192, 325, 142, 43);
		inventoryartwad.getContentPane().add(txt_dateacquiredad);
		txt_dateacquiredad.setColumns(10);
		
		txt_subad = new JTextField();
		txt_subad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_subad.setBounds(192, 257, 142, 43);
		inventoryartwad.getContentPane().add(txt_subad);
		txt_subad.setColumns(10);
		
		txt_artistidad = new JTextField();
		txt_artistidad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_artistidad.setColumns(10);
		txt_artistidad.setBounds(40, 393, 142, 43);
		inventoryartwad.getContentPane().add(txt_artistidad);
		
		JLabel lblartad = new JLabel("ART NAME:");
		lblartad.setForeground(new Color(51, 0, 0));
		lblartad.setFont(new Font("Verdana", Font.BOLD, 15));
		lblartad.setBounds(40, 168, 131, 22);
		inventoryartwad.getContentPane().add(lblartad);
		
		JLabel lblartidad = new JLabel("ART ID:");
		lblartidad.setForeground(new Color(51, 0, 0));
		lblartidad.setBackground(Color.WHITE);
		lblartidad.setFont(new Font("Verdana", Font.BOLD, 15));
		lblartidad.setBounds(191, 168, 93, 23);
		inventoryartwad.getContentPane().add(lblartidad);
		
		JLabel lbldateacqad = new JLabel("DATE ACQUIRED:");
		lbldateacqad.setFont(new Font("Verdana", Font.BOLD, 15));
		lbldateacqad.setForeground(new Color(51, 0, 0));
		lbldateacqad.setBounds(191, 302, 160, 23);
		inventoryartwad.getContentPane().add(lbldateacqad);
		
		JLabel lblsubad = new JLabel("SUBJECT");
		lblsubad.setFont(new Font("Verdana", Font.BOLD, 15));
		lblsubad.setForeground(new Color(51, 0, 0));
		lblsubad.setBounds(191, 236, 82, 23);
		inventoryartwad.getContentPane().add(lblsubad);
		
		JLabel lbldatecreatedad = new JLabel("DATE CREATED:");
		lbldatecreatedad.setFont(new Font("Verdana", Font.BOLD, 15));
		lbldatecreatedad.setForeground(new Color(51, 0, 0));
		lbldatecreatedad.setBounds(40, 302, 160, 23);
		inventoryartwad.getContentPane().add(lbldatecreatedad);
		
		JLabel lblorientationad = new JLabel("ORIENTATION:");
		lblorientationad.setFont(new Font("Verdana", Font.BOLD, 15));
		lblorientationad.setForeground(new Color(51, 0, 0));
		lblorientationad.setBounds(40, 235, 160, 25);
		inventoryartwad.getContentPane().add(lblorientationad);
		
		JLabel lblartistidad = new JLabel("ARTIST ID:");
		lblartistidad.setFont(new Font("Verdana", Font.BOLD, 15));
		lblartistidad.setForeground(new Color(51, 0, 0));
		lblartistidad.setBounds(40, 375, 142, 14);
		inventoryartwad.getContentPane().add(lblartistidad);
		
		JLabel lblartworkadmin1 = new JLabel("ARTWORKS");
		lblartworkadmin1.setForeground(new Color(51, 0, 0));
		lblartworkadmin1.setFont(new Font("Verdana", Font.BOLD, 25));
		lblartworkadmin1.setBounds(475, 120, 201, 38);
		inventoryartwad.getContentPane().add(lblartworkadmin1);
		
		JLabel lblartistsadmin1 = new JLabel("ARTIST");
		lblartistsadmin1.setForeground(new Color(153, 102, 51));
		lblartistsadmin1.setFont(new Font("Verdana", Font.BOLD, 25));
		lblartistsadmin1.setBounds(845, 128, 116, 23);
		inventoryartwad.getContentPane().add(lblartistsadmin1);
		
		txt_empidad = new JTextField();
		txt_empidad.setFont(new Font("Verdana", Font.PLAIN, 11));
		txt_empidad.setColumns(10);
		txt_empidad.setBounds(192, 393, 142, 43);
		inventoryartwad.getContentPane().add(txt_empidad);
		
		JLabel lblempidad = new JLabel("ARTIST ID:");
		lblempidad.setForeground(new Color(51, 0, 0));
		lblempidad.setFont(new Font("Verdana", Font.BOLD, 15));
		lblempidad.setBounds(192, 379, 142, 14);
		inventoryartwad.getContentPane().add(lblempidad);
		
		JLabel lblbg = new JLabel("");
		Image lgbg = new ImageIcon(this.getClass().getResource("/INVENTORY.png")).getImage();
		lblbg.setIcon(new ImageIcon(lgbg));
		lblbg.setBounds(0, 0, 1140, 585);
		inventoryartwad.getContentPane().add(lblbg);
	}

}
