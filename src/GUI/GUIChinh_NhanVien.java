package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import Others.JGradientButton;
import Others.MyButton;
import Others.TableHeader;


public class GUIChinh_NhanVien extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frmPhnMmQun;
	private String manv = "";
	private JTable tblHoaDon;
	private JTextField textField_8;
	private JTable tblDanhSachSP;
	private JTextField textField_6;
	private JTable tblDanhSachHD;
	private JScrollPane scrpnl_danhsachhoadon;
	private JTextField textField;
	private JTextField txtTenSanPham;
	private JTextField txtChatLieu;
	private JTextField txtNhaSanXuat;
	private JTextField txtXuatXu;
	private JTextField txtNhaXuatBan;
	private JTextField txtSoTrang;
	private JPanel pnlLapHoaDon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIChinh_NhanVien window = new GUIChinh_NhanVien();
					window.frmPhnMmQun.setVisible(true);
					window.frmPhnMmQun.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIChinh_NhanVien() {
		initialize();
	}

	public GUIChinh_NhanVien(String manv) {
		this.manv = manv;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhnMmQun = new JFrame();
		frmPhnMmQun.getContentPane().setBackground(new Color(230, 230, 250));
		frmPhnMmQun.setResizable(false);
		frmPhnMmQun.setTitle("Chào nhân viên: " + manv);
		frmPhnMmQun.setBounds(100, 100, 1236, 832);
		frmPhnMmQun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhnMmQun.getContentPane().setLayout(null);

		JPanel pnl_GiaoDienPhu = new JPanel();
		pnl_GiaoDienPhu.setBackground(new Color(255, 255, 255));
		pnl_GiaoDienPhu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl_GiaoDienPhu.setBounds(10, 60, 1200, 700);
		frmPhnMmQun.getContentPane().add(pnl_GiaoDienPhu);
		pnl_GiaoDienPhu.setLayout(null);

		JInternalFrame windowChucNangHoaDon = new JInternalFrame("Lập Danh sách Hóa Đơn");
		windowChucNangHoaDon.setBackground(new Color(30, 144, 255));
		windowChucNangHoaDon.getContentPane().setBackground(new Color(240, 248, 255));
		windowChucNangHoaDon.setClosable(true);
		windowChucNangHoaDon.setBounds(0, 0, 1200, 700);
		pnl_GiaoDienPhu.add(windowChucNangHoaDon);
		windowChucNangHoaDon.getContentPane().setLayout(null);
		
		pnlLapHoaDon = new JPanel();
		pnlLapHoaDon.setBounds(10, 10, 1168, 645);
		windowChucNangHoaDon.getContentPane().add(pnlLapHoaDon);
		pnlLapHoaDon.setLayout(null);

		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setBounds(0, 0, 1168, 645);
		pnlLapHoaDon.add(splitPane_1);
		splitPane_1.setBackground(new Color(100, 149, 237));
		
		JPanel pnl_NhapHoaDon = new JPanel();
		pnl_NhapHoaDon.setBackground(new Color(240, 248, 255));
		splitPane_1.setLeftComponent(pnl_NhapHoaDon);
		pnl_NhapHoaDon.setMaximumSize(new Dimension(375, 375));

		JPanel pnl_DanhSachHoaDon = new JPanel();
		pnl_DanhSachHoaDon.setBackground(new Color(240, 248, 255));
		splitPane_1.setRightComponent(pnl_DanhSachHoaDon);
		pnl_DanhSachHoaDon.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(224, 255, 255));
		pnl_DanhSachHoaDon.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new GridLayout(0, 3, 5, 5));
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue);
		
		JLabel lblNewLabel_7 = new JLabel("Tìm kiếm sản phẩm");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(25, 25, 112));
		lblNewLabel_7.setFont(new Font("Cambria Math", Font.BOLD, 20));
		panel_8.add(lblNewLabel_7);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_2);
		
		JLabel lblNewLabel = new JLabel("Tên sản phẩm:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel);
		
		txtTenSanPham = new JTextField();
		panel_8.add(txtTenSanPham);
		txtTenSanPham.setColumns(10);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_4);
		
		JLabel lblNewLabel_5 = new JLabel("Chất liệu:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_5);
		
		txtChatLieu = new JTextField();
		panel_8.add(txtChatLieu);
		txtChatLieu.setColumns(10);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_5);
		
		JLabel lblNewLabel_8 = new JLabel("Nhà sản xuất:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_8);
		
		txtNhaSanXuat = new JTextField();
		panel_8.add(txtNhaSanXuat);
		txtNhaSanXuat.setColumns(10);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_6);
		
		JLabel lblNewLabel_12 = new JLabel("Xuất xứ:");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_12);
		
		txtXuatXu = new JTextField();
		panel_8.add(txtXuatXu);
		txtXuatXu.setColumns(10);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_1);
		
		JLabel lblNewLabel_9 = new JLabel("Nhà xuất bản:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_9);
		
		txtNhaXuatBan = new JTextField();
		panel_8.add(txtNhaXuatBan);
		txtNhaXuatBan.setColumns(10);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_3);
		
		JLabel lblNewLabel_13 = new JLabel("Số trang:");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_13);
		
		txtSoTrang = new JTextField();
		panel_8.add(txtSoTrang);
		txtSoTrang.setColumns(10);
				
				JPanel panel_9 = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel_9.getLayout();
				panel_8.add(panel_9);
				
				MyButton btnTim = new MyButton("Tìm");
				panel_9.add(btnTim);
				
				Component horizontalGlue_7 = Box.createHorizontalGlue();
				panel_8.add(horizontalGlue_7);
		
				JLabel lblNewLabel_2 = new JLabel("Danh Sách Sản Phẩm");
				panel_8.add(lblNewLabel_2);
				lblNewLabel_2.setForeground(new Color(25, 25, 112));
				lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		panel_8.add(horizontalGlue_9);
		
		JPanel panel_2 = new JPanel();
		pnl_DanhSachHoaDon.add(panel_2, BorderLayout.SOUTH);
				panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
				JButton btnTimThemHD = new JButton("Thêm vào hóa đơn");
				panel_2.add(btnTimThemHD);
				btnTimThemHD.setForeground(Color.WHITE);
				btnTimThemHD.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnTimThemHD.setBorder(null);
				btnTimThemHD.setBackground(new Color(60, 179, 113));
		
		JScrollPane scrpnl_danhsachsanpham = new JScrollPane();
		pnl_DanhSachHoaDon.add(scrpnl_danhsachsanpham, BorderLayout.CENTER);
		
		tblDanhSachSP = new JTable();
		scrpnl_danhsachsanpham.setViewportView(tblDanhSachSP);
		pnl_NhapHoaDon.setMinimumSize(new Dimension(300, 300));
		pnl_NhapHoaDon.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		pnl_NhapHoaDon.add(panel, BorderLayout.SOUTH);
				panel.setLayout(new BorderLayout(0, 0));
		
		
		
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				scrollPane.setAutoscrolls(true);
				scrollPane.setBackground(new Color(100, 149, 237));
				scrollPane.setBorder(new CompoundBorder());
				
				tblHoaDon = new JTable();
				tblHoaDon.setBorder(new LineBorder(new Color(0, 0, 0)));
				tblHoaDon.setSelectionBackground(Color.YELLOW);
				tblHoaDon.setOpaque(false);
				tblHoaDon.setModel(new DefaultTableModel(
					new Object[][] {
						{"SP005", "B\u00FAt th\u1EA7n k\u00EC", new Integer(2), new Integer(150000), null},
						{"SP002", "\u0110\u00F4i m\u00F4i k\u00EC di\u1EC7u - H\u1ED3ng", new Integer(1), new Integer(150000), null},
						{"SP003", "BCS Durex si\u00EAu m\u1ECFng", new Integer(10), new Integer(250000), null},
						{"S0001", "C\u00E1ch \u0111\u1EC3 l\u00E2u h\u01A1n", new Integer(1), new Integer(300000), null},
					},
					new String[] {
						"M\u00E3 SP", "T\u00EAn SP", "SL", "Gi\u00E1", "Th\u00E0nh ti\u1EC1n"
					}
				));
				tblHoaDon.getColumnModel().getColumn(0).setMaxWidth(50);
				tblHoaDon.getColumnModel().getColumn(1).setPreferredWidth(134);
				tblHoaDon.getColumnModel().getColumn(1).setMinWidth(100);
				tblHoaDon.getColumnModel().getColumn(2).setMinWidth(10);
				tblHoaDon.getColumnModel().getColumn(2).setMaxWidth(25);
				tblHoaDon.getColumnModel().getColumn(4).setMinWidth(100);
				
				tblHoaDon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				tblHoaDon.setFont(new Font("Arial", Font.PLAIN, 12));
				tblHoaDon.getTableHeader().setDefaultRenderer(new TableHeader());
				scrollPane.setViewportView(tblHoaDon);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBackground(new Color(224, 255, 255));
				panel.add(panel_6, BorderLayout.SOUTH);
				panel_6.setLayout(new GridLayout(3, 3, 10, 20));
				
				JLabel lblTngTin = new JLabel("Tổng tiền:");
				panel_6.add(lblTngTin);
				lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
				lblTngTin.setFont(new Font("Cambria Math", Font.BOLD, 14));
				
				textField_6 = new JTextField();
				panel_6.add(textField_6);
				textField_6.setColumns(15);
				
						JLabel lblSLngCn = new JLabel("Số lượng:");
						panel_6.add(lblSLngCn);
						lblSLngCn.setHorizontalAlignment(SwingConstants.RIGHT);
						lblSLngCn.setFont(new Font("Cambria Math", Font.BOLD, 14));
						
								textField_8 = new JTextField();
								panel_6.add(textField_8);
								textField_8.setColumns(10);
								
								JButton btnInVLu = new JButton("In và lưu hóa đơn");
								panel_6.add(btnInVLu);
								btnInVLu.setForeground(Color.WHITE);
								btnInVLu.setFont(new Font("Tahoma", Font.BOLD, 18));
								btnInVLu.setBorder(null);
								btnInVLu.setBackground(new Color(60, 179, 113));
								
								JButton btnSuaThongTin_1 = new JButton("Xóa sản phẩm");
								btnSuaThongTin_1.setToolTipText("Tìm sản phẩm");
								btnSuaThongTin_1.setForeground(Color.WHITE);
								btnSuaThongTin_1.setFont(new Font("Tahoma", Font.BOLD, 18));
								btnSuaThongTin_1.setBorder(null);
								btnSuaThongTin_1.setBackground(Color.RED);
								panel_6.add(btnSuaThongTin_1);
				
				JPanel panel_5 = new JPanel();
				FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
				flowLayout_1.setAlignment(FlowLayout.LEFT);
				panel_5.setBackground(new Color(224, 255, 255));
				panel.add(panel_5, BorderLayout.NORTH);
				
				JLabel lblDanhSchSn = new JLabel("Chi Tiết Hóa đơn:");
				lblDanhSchSn.setVerticalAlignment(SwingConstants.BOTTOM);
				panel_5.add(lblDanhSchSn);
				lblDanhSchSn.setForeground(new Color(0, 0, 0));
				lblDanhSchSn.setAlignmentX(Component.CENTER_ALIGNMENT);
				lblDanhSchSn.setHorizontalAlignment(SwingConstants.CENTER);
				lblDanhSchSn.setFont(new Font("Cambria Math", Font.BOLD, 14));
				
				JPanel panel_1 = new JPanel();
				pnl_NhapHoaDon.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new BorderLayout(0, 0));
				
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(new Color(224, 255, 255));
				panel_1.add(panel_4, BorderLayout.CENTER);
				panel_4.setLayout(new BorderLayout(0, 0));
				
				JLabel lblNewLabel_1 = new JLabel("Hóa đơn");
				lblNewLabel_1.setBackground(new Color(224, 255, 255));
				panel_4.add(lblNewLabel_1, BorderLayout.NORTH);
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setForeground(new Color(25, 25, 112));
				lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
				
				JPanel panel_7 = new JPanel();
				panel_7.setBackground(new Color(224, 255, 255));
				panel_4.add(panel_7, BorderLayout.SOUTH);
				panel_7.setLayout(new GridLayout(0, 3, 20, 5));
				
				JLabel lblNewLabel_4 = new JLabel("Ngày nhập:");
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
				panel_7.add(lblNewLabel_4);
				
				textField = new JTextField();
				textField.setEditable(false);
				panel_7.add(textField);
				textField.setColumns(10);

		JButton btnTimSanPhamHD = new MyButton("");
		
		JInternalFrame windowDanhSachHoaDon = new JInternalFrame("Danh sách hóa đơn");
		windowDanhSachHoaDon.setClosable(true);
		windowDanhSachHoaDon.setBounds(0, 0, 1200, 700);
		pnl_GiaoDienPhu.add(windowDanhSachHoaDon);
		
		JLabel lblNewLabel_3 = new JLabel("Danh Sách Hóa đơn");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 25));
		windowDanhSachHoaDon.getContentPane().add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		windowDanhSachHoaDon.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		
		JButton btnLapDSHoaDon = new JButton("Lập Hóa Đơn");
		btnLapDSHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowChucNangHoaDon.setVisible(true);
			}
		});
		panel_3.add(btnLapDSHoaDon);
		
		scrpnl_danhsachhoadon = new JScrollPane();
		windowDanhSachHoaDon.getContentPane().add(scrpnl_danhsachhoadon, BorderLayout.CENTER);
		
		tblDanhSachHD = new JTable();
		scrpnl_danhsachhoadon.setViewportView(tblDanhSachHD);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 10, 1092, 643);
		pnl_GiaoDienPhu.add(panel_10);
		panel_10.setLayout(null);

		JTextArea txtaHelp = new JTextArea();
		txtaHelp.setBounds(672, 20, 420, 554);
		panel_10.add(txtaHelp);
		txtaHelp.setBackground(new Color(255, 255, 255));
		txtaHelp.setColumns(5);
		txtaHelp.setEditable(false);
		txtaHelp.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		txtaHelp.setOpaque(false);
		txtaHelp.setText(
				"Nội Qui:\r\n\r\n+ Nhân viên đăng nhập lần đầu vui lòng đổi mật khẩu thay cho mật khẩu mặc định để đảm bảo an toàn thông tin.\r\n\r\n+ Nhân viên vui lòng báo cáo cho quản lý nếu có sản phẩm lỗi.\r\n\r\n+ Nhân viên vui lòng giữ gìn vệ sinh nơi làm việc, không xả rác, bôi bẩn hay làm hỏng dụng cụ, hay hệ thống máy tính.\r\n\r\n+ Nhân viên vui lòng mặc đồng phục nơi làm việc.\r\n\r\n+ Nhân viên có thắc mắc gì về sản phẩm, công việc, vui lòng liên hệ cho cấp trên.\r\n\r\nNôi Qui mùa dịch:\r\n+ Nhân viên phải đeo găng tay, khẩu trang khi làm việc");
		txtaHelp.setLineWrap(true);
		txtaHelp.setWrapStyleWord(true);

		JLabel main_pic = new JLabel("New label");
		main_pic.setBounds(0, 0, 690, 643);
		panel_10.add(main_pic);
		main_pic.setIcon(new ImageIcon("D:\\PhatTrienUngDung\\pictures\\main-nhanvien.gif"));

		JPanel pnl_NutChucNang = new JPanel();
		pnl_NutChucNang.setBounds(796, 594, 306, 59);
		pnl_GiaoDienPhu.add(pnl_NutChucNang);
		pnl_NutChucNang.setOpaque(false);
		pnl_NutChucNang.setForeground(new Color(169, 169, 169));
		pnl_NutChucNang.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		pnl_NutChucNang.setLayout(null);

		JButton btnLamViec = new JGradientButton("Làm Việc");
		btnLamViec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				windowDanhSachHoaDon.setVisible(true);

			}
		});
		btnLamViec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// btnLamViec
			}
		});
		btnLamViec.setBorder(null);
		// btnHoaDon.setText("Hóa Đơn");
		btnLamViec.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnLamViec.setBounds(10, 10, 286, 38);
		pnl_NutChucNang.add(btnLamViec);

		Label label = new Label("Nh\u00E0 S\u00E1ch TNL");
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 0, 1200, 54);
		frmPhnMmQun.getContentPane().add(label);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(85, 255, 267, -242);
		frmPhnMmQun.getContentPane().add(desktopPane);
		


		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		frmPhnMmQun.setJMenuBar(menuBar);

		JMenu mnChucNang = new JMenu("Ch\u1EE9c n\u0103ng");
		menuBar.add(mnChucNang);
		
		
		JMenuItem mntmChucNangTimKiemSanPham = new JMenuItem("T\u00ECm ki\u1EBFm s\u1EA3n ph\u1EA9m");
		mntmChucNangTimKiemSanPham.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//JPanel p = new GUI_TimKiem();
				//add(p);
				
				
			}
		});
		mnChucNang.add(mntmChucNangTimKiemSanPham);

		JMenuItem mntmDangXuat = new JMenuItem("\u0110\u0103ng xu\u1EA5t");
		mnChucNang.add(mntmDangXuat);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
	}
}
