package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Others.MyButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;


public class GUI_ThemSP extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtSoLuongSach;
	private JTextField txtSoLuong;
	private JTextField txtTenSanPham;
	private JTextField txtNhaCungCap;
	private JTextField txtGiaDonVi;
	private JTextField txtXuatXu;
	private JTextField txtChatLieu;
	private JTextField txtGiaNhap;
	private JTextField txtTenSach;
	private JTextField txtNhaXuatBan;
	private JTextField txtTenTacGia;
	private JTextField txtSoTrang;
	private JTextField txtGiaDonViSach;
	private JTextField txtGiaNhapSach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ThemSP window = new GUI_ThemSP();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_ThemSP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//setSize(900,600);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 899, 555);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabThemSP = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabThemSP);

		JPanel pnlVPP = new JPanel();
		pnlVPP.setBackground(Color.WHITE);
		pnlVPP.setToolTipText("");
		tabThemSP.addTab("V\u0103n ph\u00F2ng ph\u1EA9m", null, pnlVPP, null);
		pnlVPP.setLayout(null);

		MyButton btnThemSP = new MyButton("Th\u00EAm");
		btnThemSP.setBorder(null);
		btnThemSP.setColor(new Color(144, 238, 144));
		btnThemSP.setColorClick(new Color(0, 100, 0));
		btnThemSP.setBorderColor(new Color(0, 128, 0));
		btnThemSP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnThemSP.setIcon(new ImageIcon(GUI_ThemSP.class.getResource("/images/Overthem.png")));
				btnThemSP.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnThemSP.setIcon(new ImageIcon(GUI_ThemSP.class.getResource("/images/them.png")));
				btnThemSP.setForeground(Color.black);
			}
		});
		btnThemSP.setIcon(new ImageIcon(GUI_ThemSP.class.getResource("/images/them.png")));
		btnThemSP.setColorOver(new Color(76,175,80));
		btnThemSP.setFont(new Font("Dialog", Font.BOLD, 17));
		btnThemSP.setBounds(545, 370, 140, 40);
		pnlVPP.add(btnThemSP);

		MyButton btnThoat = new MyButton("Thoát");
		btnThoat.setBorder(null);
		btnThoat.setFont(new Font("Dialog", Font.BOLD, 17));
		btnThoat.setBounds(695, 370, 140, 40);
		pnlVPP.add(btnThoat);

		JLabel lblAnhSanPham = new JLabel("");
		lblAnhSanPham.setBounds(25, 25, 250, 250);
		pnlVPP.add(lblAnhSanPham);
		lblAnhSanPham.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		MyButton btnChnnhSp = new MyButton("Chọn ảnh sp:");
		btnChnnhSp.setBorder(null);
		btnChnnhSp.setText("Chọn ảnh sp");
		btnChnnhSp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnChnnhSp) {
					JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads")); // Downloads
																														// Directory
																														// as
																														// default
					chooser.setDialogTitle("Chọn ảnh");
					chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					//FileDialog f = new FileDialog();
					chooser.setAcceptAllFileFilterUsed(true);
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Ảnh sản phẩm (*.jpg,*.png,*.jpeg,*.gif)", "jpg","png","jpeg","gif");
					chooser.setFileFilter(filter);
					if (chooser.showOpenDialog(btnChnnhSp) == JFileChooser.APPROVE_OPTION) {
						String fileID = chooser.getSelectedFile().getPath();//đường dẫn file ở đây
						lblAnhSanPham.setIcon(new ImageIcon(fileID));
					}
				}
			}
		});

		btnChnnhSp.setFont(new Font("Dialog", Font.BOLD, 17));
		btnChnnhSp.setBounds(135, 290, 140, 40);
		pnlVPP.add(btnChnnhSp);
		
		JLabel lblSoLuong_1 = new JLabel("Số lượng:");
		lblSoLuong_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblSoLuong_1.setBounds(25, 335, 110, 24);
		pnlVPP.add(lblSoLuong_1);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(135, 336, 140, 24);
		pnlVPP.add(txtSoLuong);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(320, 25, 515, 340);
		pnlVPP.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 15, 30));
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenSP.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblTenSP);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtTenSanPham.setColumns(10);
		panel_1.add(txtTenSanPham);
		
		JLabel lblNCC = new JLabel("Nhà cung cấp:");
		lblNCC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNCC.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblNCC);
		
		txtNhaCungCap = new JTextField();
		txtNhaCungCap.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtNhaCungCap.setColumns(10);
		panel_1.add(txtNhaCungCap);
		
		JLabel lblXutX = new JLabel("Xuất xứ:");
		lblXutX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblXutX.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblXutX);
		
		txtXuatXu = new JTextField();
		txtXuatXu.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtXuatXu.setColumns(10);
		panel_1.add(txtXuatXu);
		
		JLabel lblChatlieu = new JLabel("Chất liệu:");
		lblChatlieu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChatlieu.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblChatlieu);
		
		txtChatLieu = new JTextField();
		txtChatLieu.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtChatLieu.setColumns(10);
		panel_1.add(txtChatLieu);
		
		JLabel lblGiaDonVi = new JLabel("Giá đơn vị:");
		lblGiaDonVi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiaDonVi.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblGiaDonVi);
		
		txtGiaDonVi = new JTextField();
		txtGiaDonVi.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtGiaDonVi.setColumns(10);
		panel_1.add(txtGiaDonVi);
		
		JLabel lblGianhap = new JLabel("Giá nhập:");
		lblGianhap.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGianhap.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblGianhap);
		
		txtGiaNhap = new JTextField();
		txtGiaNhap.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtGiaNhap.setColumns(10);
		panel_1.add(txtGiaNhap);
		
				
		JPanel pnlSach = new JPanel();
		pnlSach.setBackground(Color.WHITE);
		pnlSach.setForeground(new Color(224, 255, 255));
		tabThemSP.addTab("S\u00E1ch", null, pnlSach, null);
		pnlSach.setLayout(null);

		MyButton btnThemSach = new MyButton("Th\u00EAm");
		btnThemSach.setColor(new Color(152, 251, 152));
		btnThemSach.setColorClick(new Color(0, 128, 0));
		btnThemSach.setBorderColor(new Color(0, 128, 0));
		btnThemSach.setBorder(null);
		btnThemSach.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnThemSach.setIcon(new ImageIcon(GUI_ThemSP.class.getResource("/images/Overthem.png")));
				btnThemSach.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnThemSach.setIcon(new ImageIcon(GUI_ThemSP.class.getResource("/images/them.png")));
				btnThemSach.setForeground(Color.black);
			}
		});
		btnThemSach.setIcon(new ImageIcon(GUI_ThemSP.class.getResource("/images/them.png")));
		btnThemSach.setFont(new Font("Dialog", Font.BOLD, 17));
		btnThemSach.setColorOver(new Color(76,175,80));
		btnThemSach.setBounds(545, 370, 140, 40);
		pnlSach.add(btnThemSach);
		
		JLabel lblSoLuong = new JLabel("Số lượng:");
		lblSoLuong.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoLuong.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblSoLuong.setBounds(25, 335, 110, 24);
		pnlSach.add(lblSoLuong);
		
		txtSoLuongSach = new JTextField();
		txtSoLuongSach.setText("1");
		txtSoLuongSach.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtSoLuongSach.setColumns(10);
		txtSoLuongSach.setBounds(126, 335, 149, 24);
		pnlSach.add(txtSoLuongSach);
		
		JLabel lblAnhSach = new JLabel("");
		lblAnhSach.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAnhSach.setBounds(25, 25, 250, 250);
		pnlSach.add(lblAnhSach);
		
		MyButton btnChnnhSp_1 = new MyButton("Chọn ảnh sp:");
		btnChnnhSp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChnnhSp_1.setBorder(null);
		btnChnnhSp_1.setText("Chọn ảnh sp");
		btnChnnhSp_1.setFont(new Font("Dialog", Font.BOLD, 17));
		btnChnnhSp_1.setBounds(126, 290, 149, 40);
		pnlSach.add(btnChnnhSp_1);
		
		MyButton btnThoatSach = new MyButton("Thoát");
		btnThoatSach.setBorder(null);
		btnThoatSach.setFont(new Font("Dialog", Font.BOLD, 17));
		btnThoatSach.setBounds(695, 370, 140, 40);
		pnlSach.add(btnThoatSach);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(320, 25, 515, 340);
		pnlSach.add(panel_2);
		panel_2.setLayout(new GridLayout(6, 2, 15, 30));
		
		JLabel lblTenSach = new JLabel("Tên sách:");
		lblTenSach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenSach.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_2.add(lblTenSach);
		
		txtTenSach = new JTextField();
		txtTenSach.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtTenSach.setColumns(10);
		panel_2.add(txtTenSach);
		
		JLabel lblNXB = new JLabel("Nhà xuất bản:");
		lblNXB.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNXB.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_2.add(lblNXB);
		
		txtNhaXuatBan = new JTextField();
		txtNhaXuatBan.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtNhaXuatBan.setColumns(10);
		panel_2.add(txtNhaXuatBan);
		
		JLabel lblTentacgia = new JLabel("Tên tác giả:");
		lblTentacgia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTentacgia.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_2.add(lblTentacgia);
		
		txtTenTacGia = new JTextField();
		txtTenTacGia.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtTenTacGia.setColumns(10);
		panel_2.add(txtTenTacGia);
		
		JLabel lblSotrang = new JLabel("Số trang:");
		lblSotrang.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSotrang.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_2.add(lblSotrang);
		
		txtSoTrang = new JTextField();
		txtSoTrang.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtSoTrang.setColumns(10);
		panel_2.add(txtSoTrang);
		
		JLabel lblGiaDonVi_1 = new JLabel("Giá đơn vị:");
		lblGiaDonVi_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiaDonVi_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_2.add(lblGiaDonVi_1);
		
		txtGiaDonViSach = new JTextField();
		txtGiaDonViSach.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtGiaDonViSach.setColumns(10);
		panel_2.add(txtGiaDonViSach);
		
		JLabel lblGianhap_1 = new JLabel("Giá nhập:");
		lblGianhap_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGianhap_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_2.add(lblGianhap_1);
		
		txtGiaNhapSach = new JTextField();
		txtGiaNhapSach.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtGiaNhapSach.setColumns(10);
		panel_2.add(txtGiaNhapSach);

		JLabel lblThemSP = new JLabel("TH\u00CAM S\u1EA2N PH\u1EA8M");
		lblThemSP.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblThemSP.setVerticalAlignment(SwingConstants.BOTTOM);
		lblThemSP.setForeground(new Color(0, 0, 128));
		lblThemSP.setHorizontalAlignment(SwingConstants.CENTER);
		lblThemSP.setFont(new Font("Cambria Math", Font.BOLD, 35));
		getContentPane().add(lblThemSP, BorderLayout.NORTH);

	}
}
