package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Others.DateLabelFormatter;
import Others.MyButton;

public class GUI_LapPhieuDat extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_8;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_1;
	private MyButton btnTimThemHD;
	private JTable tblDSSanPham;
	private JTable tblDSCTHoaDon;
	private JLabel textField_9;
	private JLabel textField_10;
	private UtilDateModel dateModel;
	private Properties dateProperties;
	private JDatePanelImpl datePanel;

	/**
	 * Create the panel.
	 */
	public GUI_LapPhieuDat() {
		setLayout(new BorderLayout(0, 0));
		setSize(1399,718);
		JPanel pnlLapHoaDon = new JPanel();
		add(pnlLapHoaDon, BorderLayout.CENTER);
		pnlLapHoaDon.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setBackground(new Color(100, 149, 237));
		pnlLapHoaDon.add(splitPane_1);
		
		JPanel pnl_NhapHoaDon = new JPanel();
		pnl_NhapHoaDon.setMinimumSize(new Dimension(300, 300));
		pnl_NhapHoaDon.setMaximumSize(new Dimension(375, 375));
		pnl_NhapHoaDon.setBackground(Color.WHITE);
		splitPane_1.setLeftComponent(pnl_NhapHoaDon);
		pnl_NhapHoaDon.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBackground(new Color(224, 255, 255));
		pnl_NhapHoaDon.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new GridLayout(4, 3, 10, 0));
		
		JPanel panel_3 = new JPanel();
		panel_6.add(panel_3);
		
		JLabel lblTngTin = new JLabel("Tổng tiền:");
		panel_3.add(lblTngTin);
		lblTngTin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTngTin.setFont(new Font("Cambria Math", Font.BOLD, 14));
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(15);
		
		MyButton btnInVLu = new MyButton("In và lưu hóa đơn");
		btnInVLu.setText("Lưu phiếu");
		btnInVLu.setRadius(0);
		btnInVLu.setForeground(Color.WHITE);
		btnInVLu.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnInVLu.setColorOver(new Color(34, 139, 34));
		btnInVLu.setColorClick(new Color(0, 100, 0));
		btnInVLu.setColor(new Color(60, 179, 113));
		btnInVLu.setBorder(null);
		btnInVLu.setBackground(new Color(60, 179, 113));
		panel_6.add(btnInVLu);
		
		JPanel panel_1 = new JPanel();
		pnl_NhapHoaDon.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Phiếu đặt trước");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblNewLabel_1.setBackground(new Color(224, 255, 255));
		panel_4.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_4.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new GridLayout(0, 3, 20, 10));
		
		JLabel lblNewLabel_14 = new JLabel("Mã khách hàng:");
		lblNewLabel_14.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_7.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("makhachang");
		panel_7.add(lblNewLabel_15);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_7.add(panel);
		
		JButton btnNewButton = new JButton("Chọn khách hàng");
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Tên khách hàng:");
		lblNewLabel_6.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_7.add(lblNewLabel_6);
		
		textField_9 = new JLabel();
		textField_9.setText("tenkhachang");
		panel_7.add(textField_9);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_1);
		
		JLabel lblNewLabel_10 = new JLabel("Số điện thoại:");
		lblNewLabel_10.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_7.add(lblNewLabel_10);
		
		textField_10 = new JLabel();
		textField_10.setText("sodienthoai");
		panel_7.add(textField_10);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_5);
		
		JLabel lblNewLabel_4 = new JLabel("Ngày tạo:");
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		panel_7.add(lblNewLabel_4);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		panel_7.add(textField_8);
		// thanh ngày giờ
		dateModel = new UtilDateModel();
		dateProperties = new Properties();
		dateProperties.put("text.today", "Today");
		dateProperties.put("text.month", "Month");
		dateProperties.put("text.year", "Year");
		datePanel = new JDatePanelImpl(dateModel, dateProperties);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_7);
		
		JLabel lblNewLabel_11 = new JLabel("Ngày lấy:");
		lblNewLabel_11.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_7.add(lblNewLabel_11);
		
		JDatePickerImpl dateNgaySinh = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		panel_7.add(dateNgaySinh);

		dateNgaySinh.getJFormattedTextField().setEditable(true);
		dateNgaySinh.getJFormattedTextField().setBackground(SystemColor.textHighlightText);
		
		JSplitPane spltpnlCTHoaDon = new JSplitPane();
		spltpnlCTHoaDon.setBorder(null);
		spltpnlCTHoaDon.setOpaque(false);
		spltpnlCTHoaDon.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel_1.add(spltpnlCTHoaDon, BorderLayout.CENTER);
		
		JScrollPane scrpnl_danhsachchitiethoadon = new JScrollPane();
		scrpnl_danhsachchitiethoadon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnTimThemHD.setText("Xóa");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnTimThemHD.setText("Thêm");
			}
		});
		
		scrpnl_danhsachchitiethoadon.setOpaque(false);
		scrpnl_danhsachchitiethoadon.setBorder(null);
		scrpnl_danhsachchitiethoadon.setBackground(new Color(100, 149, 237));
		scrpnl_danhsachchitiethoadon.setAutoscrolls(true);
		spltpnlCTHoaDon.setRightComponent(scrpnl_danhsachchitiethoadon);
		
		String[] ttSanPham ={"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Tổng tiền"};
		String[][] data = {{"1","1","1","1"},{"1","1","1","1"}};
		tblDSCTHoaDon = new JTable(data,ttSanPham);
		scrpnl_danhsachchitiethoadon.setViewportView(tblDSCTHoaDon);
		
		JLabel lblNewLabel_3 = new JLabel("Chi tiết phiếu đặt:");
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		spltpnlCTHoaDon.setLeftComponent(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 15));
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(17);
		pnl_NhapHoaDon.add(horizontalStrut_4, BorderLayout.WEST);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(16);
		pnl_NhapHoaDon.add(horizontalStrut_6, BorderLayout.EAST);
		
		JPanel pnl_DanhSachHoaDon = new JPanel();
		pnl_DanhSachHoaDon.setBackground(Color.WHITE);
		splitPane_1.setRightComponent(pnl_DanhSachHoaDon);
		pnl_DanhSachHoaDon.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		pnl_DanhSachHoaDon.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Tìm kiếm sản phẩm");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(25, 25, 112));
		lblNewLabel_7.setFont(new Font("Cambria Math", Font.BOLD, 25));
		panel_8.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_8.add(panel_9, BorderLayout.EAST);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_2);
		
		MyButton btnTim = new MyButton("Tìm");
		panel_9.add(btnTim);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_8.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 4, 15, 25));
		
		JLabel lblNewLabel = new JLabel("Tên sản phẩm:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_5.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Chất liệu:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_5.add(textField_3);
		
		JLabel lblNewLabel_8 = new JLabel("Nhà sản xuất:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_5.add(textField_4);
		
		JLabel lblNewLabel_12 = new JLabel("Xuất xứ:");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_12);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_5.add(textField_5);
		
		JLabel lblNewLabel_9 = new JLabel("Nhà xuất bản:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_5.add(textField_6);
		
		JLabel lblNewLabel_13 = new JLabel("Số trang:");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_13);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_5.add(textField_7);
		
		JSplitPane spltpnlSanPham = new JSplitPane();
		spltpnlSanPham.setBorder(null);
		spltpnlSanPham.setOpaque(false);
		spltpnlSanPham.setOrientation(JSplitPane.VERTICAL_SPLIT);
		pnl_DanhSachHoaDon.add(spltpnlSanPham, BorderLayout.CENTER);
		
		JScrollPane scrpnl_danhsachsanpham = new JScrollPane();
		scrpnl_danhsachsanpham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		spltpnlSanPham.setRightComponent(scrpnl_danhsachsanpham);
		
		tblDSSanPham = new JTable();
		scrpnl_danhsachsanpham.setViewportView(tblDSSanPham);
		
		JLabel lblNewLabel_2 = new JLabel("Danh Sách Sản Phẩm");
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		spltpnlSanPham.setLeftComponent(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 25));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_10.setBackground(Color.WHITE);
		pnl_DanhSachHoaDon.add(panel_10, BorderLayout.WEST);
		panel_10.setLayout(new GridLayout(8, 1, 15, 15));
		
		JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		panel_11.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSLngCn = new JLabel("Số lượng sản phấm nhập:");
		lblSLngCn.setHorizontalAlignment(SwingConstants.LEFT);
		lblSLngCn.setFont(new Font("Cambria Math", Font.BOLD, 14));
		panel_11.add(lblSLngCn);
		
		textField_1 = new JTextField();
		textField_1.setText("1");
		textField_1.setColumns(10);
		panel_11.add(textField_1);
		
		btnTimThemHD = new MyButton("Chuyển");
		btnTimThemHD.setIcon(new ImageIcon(GUI_LapPhieuDat.class.getResource("/images/suathongtin.png")));
		btnTimThemHD.setColorClick(new Color(255, 102, 0));
		btnTimThemHD.setBorderColor(new Color(255, 153, 0));

		panel_10.add(btnTimThemHD);
		btnTimThemHD.setRadius(0);
		btnTimThemHD.setColorOver(new Color(255, 153, 0));
		btnTimThemHD.setColor(new Color(255, 255, 102));
		btnTimThemHD.setForeground(new Color(255, 102, 102));
		btnTimThemHD.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTimThemHD.setBorder(null);
		btnTimThemHD.setBackground(new Color(255, 204, 0));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		pnl_DanhSachHoaDon.add(horizontalStrut, BorderLayout.EAST);
		
		Component verticalStrut = Box.createVerticalStrut(17);
		pnl_DanhSachHoaDon.add(verticalStrut, BorderLayout.SOUTH);
	}
}
