package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.BoxLayout;

public class GUIChinh_QuanLy extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmPhnMmQun;
	private JPanel pnl_NutChucNang;
	private JPanel pnl_GiaoDienPhu;
	private JLayeredPane layeredPane;
	private JPanel pnlCNSanPham, pnlCNNhanVien, pnlLapHoaDon;
	private JPanel pnlDSNhanVien, pnlDSSanPham, pnlDSHoaDon;
	private JPanel pnlBieuDo;
	private JPanel pnlSideMenu;
	private JPanel pnlMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIChinh_QuanLy window = new GUIChinh_QuanLy();
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
	 * 
	 * @throws Exception
	 */
	public GUIChinh_QuanLy() throws Exception {
		initialize();
	}

	int x = 0;
	int a = 0;
	boolean mo = false;

	int w;
	int h;

	/**
	 * Cài đặt menu
	 */
	void menuAnimation(JPanel panel) {

		w = frmPhnMmQun.getWidth();
		h = frmPhnMmQun.getHeight();
		if (x == 210) {

			mo = false;
			panel.setSize(210, h);
			Thread th = new Thread() {
				@Override
				public void run() {
					try {

						for (int i = 210; i >= 0; i = i - 4) {
							Thread.sleep(1);
							panel.setSize(i, h);

							pnl_GiaoDienPhu.setBounds(i, 45, w - i, h);// di chuyển panel về x + i, từ trái qua phải
							layeredPane.setSize(w + 210, h);

							pnlCNNhanVien.setSize(w + 210, h);
							pnlCNSanPham.setSize(w + 210, h);
							pnlCNNhanVien.setSize(w + 210, h);
							pnlDSHoaDon.setSize(w + 210, h);
							pnlDSSanPham.setSize(w + 210, h);
							pnlDSNhanVien.setSize(w + 210, h);
							pnlLapHoaDon.setSize(w + 210, h);
							pnlMain.setSize(w + 210, h);
							a++;
						}
						pnlSideMenu.setVisible(false);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			};
			th.start();
			x = 0;
		} else if (x == 0) {
			mo = true;
			panel.setSize(x, h);
			Thread th = new Thread() {
				@Override
				public void run() {
					pnlSideMenu.setVisible(true);
					try {
						for (int i = 0; i <= x; i = i + 4) {
							Thread.sleep(1);
							panel.setSize(i, h);
							pnl_GiaoDienPhu.setBounds(i, 45, w - i, h);// di chuyển panel về x + i, từ phải qua trái
							layeredPane.setSize(w + 210, h);
							pnlCNNhanVien.setSize(w + 210, h);
							pnlCNSanPham.setSize(w + 210, h);
							pnlCNNhanVien.setSize(w + 210, h);
							pnlDSHoaDon.setSize(w + 210, h);
							pnlDSSanPham.setSize(w + 210, h);
							pnlDSNhanVien.setSize(w + 210, h);
							pnlLapHoaDon.setSize(w + 210, h);
							pnlMain.setSize(w + 210, h);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}
				}
			};
			th.start();
			x = 210;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws Exception
	 */
	private void initialize() throws Exception {
		frmPhnMmQun = new JFrame();
		// frmPhnMmQun.setPreferredSize(new
		// Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frmPhnMmQun.setIconImage(
				Toolkit.getDefaultToolkit().getImage(GUIChinh_QuanLy.class.getResource("/images/icon.png")));
		frmPhnMmQun.getContentPane().setBackground(new Color(230, 230, 250));
		frmPhnMmQun.setTitle("Phần mềm Quản lý Nhà Sách TNL");
		w = frmPhnMmQun.getWidth();
		h = frmPhnMmQun.getHeight();
		frmPhnMmQun.setBounds(100, 100, 1611, 830);
		frmPhnMmQun.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmPhnMmQun.setVisible(true);

		frmPhnMmQun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhnMmQun.getContentPane().setLayout(new BorderLayout(0, 0));

		pnlSideMenu = new JPanel();
		pnlSideMenu.setBackground(Color.WHITE);
		pnlSideMenu.setBorder(null);

		// **
		frmPhnMmQun.getContentPane().add(pnlSideMenu, BorderLayout.WEST);
		pnlSideMenu.setVisible(false);
		pnlSideMenu.setLayout(new BorderLayout(0, 0));

		pnl_NutChucNang = new JPanel();
		pnl_NutChucNang.setBackground(new Color(255, 255, 255));
		pnlSideMenu.add(pnl_NutChucNang, BorderLayout.CENTER);
		pnl_NutChucNang.setForeground(Color.WHITE);
		pnl_NutChucNang.setBorder(null);

		pnl_NutChucNang.setLayout(new GridLayout(0, 1, 0, 0));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorder(null);
		menuBar.setLayout(new GridLayout(8, 1));
		pnl_NutChucNang.add(menuBar);

		JMenu mnNhanVien = new JMenu("Nhân Viên");
		mnNhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNhanVien.setFocusable(false);
		mnNhanVien.setBackground(Color.WHITE);
		mnNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		mnNhanVien.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/nhanvien.png")));
		mnNhanVien.setFont(new Font("Cambria Math", Font.BOLD, 20));
		menuBar.add(mnNhanVien);

		JMenuItem mntmCNNhanVien = new JMenuItem("New menu item");
		mntmCNNhanVien.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/capnhatnhanvien.png")));
		mntmCNNhanVien.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmCNNhanVien.setPreferredSize(new Dimension(209, 50));
		mntmCNNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeLayerPanel(layeredPane, pnlCNNhanVien);
			}
		});
		mntmCNNhanVien.setText("Cập nhật nhân viên");
		mnNhanVien.add(mntmCNNhanVien);

		JMenuItem mntmDSNV = new JMenuItem("Danh sách Nhân viên");
		mntmDSNV.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/danhsachnhanvien.png")));
		mntmDSNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeLayerPanel(layeredPane, pnlDSNhanVien);
			}
		});
		mntmDSNV.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmDSNV.setPreferredSize(new Dimension(209, 50));
		mntmDSNV.setForeground(new Color(0, 0, 0));
		mntmDSNV.setBackground(SystemColor.menu);
		mnNhanVien.add(mntmDSNV);

		JMenu mnSanPham = new JMenu("Sản Phẩm");
		mnSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnSanPham.setFocusable(false);
		mnSanPham.setOpaque(true);
		mnSanPham.setBackground(Color.WHITE);
		mnSanPham.setHorizontalAlignment(SwingConstants.CENTER);
		mnSanPham.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/sanpham.png")));
		mnSanPham.setFont(new Font("Cambria Math", Font.BOLD, 20));
		menuBar.add(mnSanPham);

		JMenuItem mntmCNSanPham = new JMenuItem("Cập Nhật Sản Phẩm");
		mntmCNSanPham.setIcon(new ImageIcon("D:\\PhanTanJava\\NhaSachTNL\\images\\capnhatsanpham.png"));
		mntmCNSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeLayerPanel(layeredPane, pnlCNSanPham);
			}
		});
		mntmCNSanPham.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmCNSanPham.setPreferredSize(new Dimension(209, 50));
		mnSanPham.add(mntmCNSanPham);

		JMenuItem mntmLapPhieuDatTruoc = new JMenuItem("Lập Phiếu đặt trước");
		mntmLapPhieuDatTruoc.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/laphoadon.png")));
		mntmLapPhieuDatTruoc.setPreferredSize(new Dimension(209, 50));
		mntmLapPhieuDatTruoc.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mnSanPham.add(mntmLapPhieuDatTruoc);

		JMenuItem mntmXemDSSP = new JMenuItem("Xem Danh Sách Sản Phẩm");
		mntmXemDSSP.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/danhsachsanpham.png")));
		mntmXemDSSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeLayerPanel(layeredPane, pnlDSSanPham);
			}
		});
		mntmXemDSSP.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmXemDSSP.setPreferredSize(new Dimension(209, 50));
		mnSanPham.add(mntmXemDSSP);

		JMenuItem mntmTimKiemSP = new JMenuItem("Tìm kiếm sản phẩm");
		mntmTimKiemSP.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/timsanpham.png")));
		mntmTimKiemSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_TimKiem().setVisible(true);
			}
		});
		mntmTimKiemSP.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmTimKiemSP.setPreferredSize(new Dimension(209, 50));
		mnSanPham.add(mntmTimKiemSP);

		JMenu mnHoaDon = new JMenu("Hóa Đơn");
		mnHoaDon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnHoaDon.setFocusable(false);
		mnHoaDon.setPreferredSize(new Dimension(209, 21));
		mnHoaDon.setOpaque(true);
		mnHoaDon.setBackground(Color.WHITE);
		mnHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		mnHoaDon.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/hoadon.png")));
		mnHoaDon.setFont(new Font("Cambria Math", Font.BOLD, 20));
		menuBar.add(mnHoaDon);

		JMenuItem mntmLapHoaDon = new JMenuItem("Lập hóa đơn");
		mntmLapHoaDon.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/laphoadon.png")));
		mntmLapHoaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeLayerPanel(layeredPane, pnlLapHoaDon);
			}
		});
		mntmLapHoaDon.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmLapHoaDon.setPreferredSize(new Dimension(209, 50));
		mnHoaDon.add(mntmLapHoaDon);

		JMenuItem mntmXemDSHD = new JMenuItem("Xem Danh sách Hóa đơn");
		mntmXemDSHD.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/danhsachhoadon.png")));
		mntmXemDSHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeLayerPanel(layeredPane, pnlDSHoaDon);
			}
		});
		mntmXemDSHD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmXemDSHD.setPreferredSize(new Dimension(209, 50));
		mnHoaDon.add(mntmXemDSHD);

		JMenuItem mntmTimKiemHD = new JMenuItem("Tìm kiếm Hóa đơn");
		mntmTimKiemHD.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/timkiemhoadon.png")));
		mntmTimKiemHD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmTimKiemHD.setPreferredSize(new Dimension(209, 50));
		mnHoaDon.add(mntmTimKiemHD);

		JMenu mnThongKe = new JMenu("Báo Cáo");
		mnThongKe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnThongKe.setFocusable(false);
		mnThongKe.setOpaque(true);
		mnThongKe.setBackground(Color.WHITE);
		mnThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		mnThongKe.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/baocao.png")));
		mnThongKe.setFont(new Font("Cambria Math", Font.BOLD, 20));
		menuBar.add(mnThongKe);

		JMenuItem mntmThongKeSanPham = new JMenuItem("Thống kê Sản phẩm");
		mntmThongKeSanPham.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/thongkesanpham.png")));
		mntmThongKeSanPham.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmThongKeSanPham.setPreferredSize(new Dimension(209, 50));
		mnThongKe.add(mntmThongKeSanPham);

		JMenuItem mntmThongKeDoanhThu = new JMenuItem("Thống kê doanh thu");
		mntmThongKeDoanhThu.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/thongkedoanhthu.png")));
		mntmThongKeDoanhThu.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		mntmThongKeDoanhThu.setPreferredSize(new Dimension(209, 50));
		mnThongKe.add(mntmThongKeDoanhThu);

		JMenu mnNewMenu_4 = new JMenu("Khách hàng");
		mnNewMenu_4.setFont(new Font("Cambria Math", Font.BOLD, 20));
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Cập nhật khách hàng");
		mnNewMenu_4.add(mntmNewMenuItem_13);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Xem danh sách khách hàng");
		mnNewMenu_4.add(mntmNewMenuItem_12);

		JButton btnDangXuat = new JButton("Đăng xuất");
		btnDangXuat.setFocusable(false);
		btnDangXuat.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDangXuat.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDangXuat.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDangXuat.setBorder(null);
		btnDangXuat.setBackground(new Color(255, 255, 255));
		btnDangXuat.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnDangXuat.setForeground(new Color(0, 0, 0));
		btnDangXuat.setIcon(new ImageIcon("D:\\PhanTanJava\\NhaSachTNL\\images\\dangxuat.png"));
		pnlSideMenu.add(btnDangXuat, BorderLayout.SOUTH);
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(new Color(230, 230, 250));
		pnlTop.setBorder(null);
		frmPhnMmQun.getContentPane().add(pnlTop, BorderLayout.NORTH);
		pnlTop.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel pnlMuc = new JPanel();
		pnlMuc.setOpaque(false);
		pnlTop.add(pnlMuc);
		pnlMuc.setLayout(new GridLayout(0, 4, 0, 0));

		JLabel lblMenu = new JLabel("Mục");
		pnlMuc.add(lblMenu);
		lblMenu.setOpaque(true);
		lblMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu.setToolTipText("Mục các chức năng");
		lblMenu.setForeground(new Color(105, 105, 105));
		lblMenu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMenu.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/menu.png")));
		lblMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuAnimation(pnlSideMenu);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblMenu.setForeground(Color.black);
				lblMenu.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/listSelected.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblMenu.setForeground(new Color(105, 105, 105));
				lblMenu.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/menu.png")));
			}
		});
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setBackground(new Color(230, 230, 250));

		Label label = new Label("Nhà Sách TNL");
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		label.setAlignment(Label.CENTER);
		pnlTop.add(label);

		pnl_GiaoDienPhu = new JPanel();
		pnl_GiaoDienPhu.setBackground(new Color(239, 245, 255));
		pnl_GiaoDienPhu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmPhnMmQun.getContentPane().add(pnl_GiaoDienPhu);
		pnl_GiaoDienPhu.setLayout(new BorderLayout(0, 0));

		layeredPane = new JLayeredPane();
		pnl_GiaoDienPhu.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		pnlCNNhanVien = new GUI_CNNhanVien();
		layeredPane.add(pnlCNNhanVien, "name_428387612793600");

		pnlCNSanPham = new GUI_CNSanPham();
		layeredPane.add(pnlCNSanPham, "name_428456852339400");

		pnlBieuDo = new JPanel();
		layeredPane.add(pnlBieuDo, "name_428905752252500");
		pnlBieuDo.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_4 = new JLabel("Biểu đồ");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		pnlBieuDo.add(lblNewLabel_4, BorderLayout.NORTH);

		pnlDSNhanVien = new GUI_DSNhanVien();
		layeredPane.add(pnlDSNhanVien, "name_439643000283900");

		pnlDSSanPham = new GUI_DSSanPham();
		layeredPane.add(pnlDSSanPham, "name_439645861831100");

		pnlDSHoaDon = new GUI_DSHoaDon();
		layeredPane.add(pnlDSHoaDon, "name_439647990475100");

		pnlLapHoaDon = new GUI_LapHoaDon();
		layeredPane.add(pnlLapHoaDon, "name_511681171475200");

		pnlMain = new JPanel();
		pnlMain.setOpaque(false);

		layeredPane.removeAll();
		layeredPane.add(pnlMain, "name_29930844268500");
		pnlMain.setLayout(new GridLayout(0, 2, 0, 0));
		JTextArea txtaHelp = new JTextArea();
		txtaHelp.setWrapStyleWord(true);
		txtaHelp.setText(
				"Chọn \"Mục\" phía bên trái để sử dụng\r\n \r\nNút \"Nhân Viên\":\r\n+ Để thực hiện thêm, xóa sửa thông tin nhân viên.\r\n \r\nNút \"Hóa Đơn\":\r\n+ Để thực hiện thêm, sửa thông tin hóa đơn.\r\n\r\nNút \"Sản Phẩm\":\r\n+ Để thực hiện thêm, xóa, sửa sản phẩm.\r\n \r\nNút \"Thống kê\":\r\n+ Để thực hiện thống kê sản phẩm, doanh thu.");
		txtaHelp.setOpaque(false);
		txtaHelp.setLineWrap(true);
		txtaHelp.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		txtaHelp.setEditable(false);
		txtaHelp.setColumns(5);
		txtaHelp.setBackground(new Color(211, 211, 211));
		pnlMain.add(txtaHelp);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUIChinh_QuanLy.class.getResource("/images/pic_quanly.gif")));
		pnlMain.add(lblNewLabel);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(frmPhnMmQun, popupMenu);

		JMenuItem mntmTrangThaiMenu = new JMenuItem("Mở Mục");
		mntmTrangThaiMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuAnimation(pnlSideMenu);
				if (mo) {
					mntmTrangThaiMenu.setText("Đóng Mục");
				} else
					mntmTrangThaiMenu.setText("Mở Mục");
			}
		});
		popupMenu.add(mntmTrangThaiMenu);

		JMenu mnNewMenu = new JMenu("Nhân viên");
		popupMenu.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Cập nhật thông tin nhân viên");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Xem danh sách nhân viên");
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_1 = new JMenu("Sản phẩm");
		popupMenu.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Xem danh sách sản phẩm");
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Cập nhật thông tin sản phẩm");
		mnNewMenu_1.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_2 = new JMenu("Hóa đơn");
		popupMenu.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Lập hóa đơn");
		mnNewMenu_2.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Xem danh sách hóa đơn");
		mnNewMenu_2.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_7);

		JMenu mnNewMenu_3 = new JMenu("Báo cáo");
		popupMenu.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Thống kê doanh thu");
		mnNewMenu_3.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Thống kê sản phẩm");
		mnNewMenu_3.add(mntmNewMenuItem_9);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Đăng xuất");
		popupMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Thoát");
		popupMenu.add(mntmNewMenuItem_2);
	}

	void changeLayerPanel(JLayeredPane layeredPane, JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
