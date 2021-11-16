package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class GUI_DSSanPham extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	
	public GUI_DSSanPham() {
		setBackground(new Color(255, 255, 255));
		JFrame frm = new JFrame();
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setTitle("Danh sách sản phẩm");
		frm.getContentPane().setBackground(new Color(255, 255, 255));
		frm.setBackground(new Color(255, 255, 255));
		frm.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frm.getContentPane().add(this);
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBackground(new Color(255, 255, 255));
		add(splitPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setBackground(new Color(255, 255, 255));
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel.add(splitPane_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Danh Sách Sản Phẩm");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 30));
		splitPane_1.setLeftComponent(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		splitPane_1.setRightComponent(scrollPane);
		
		String[] title = { "Mã SP","Giá bán", "Tên Sản Phẩm","Số lượng còn"};
		String[][] data = {};
		table = new JTable(data,title);
		table.setBackground(new Color(255, 255, 255));
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		scrollPane.setViewportView(table);
		
		JPanel pnlTTSanPham = new JPanel();
		pnlTTSanPham.setBackground(new Color(255, 255, 255));
		splitPane.setRightComponent(pnlTTSanPham);
		pnlTTSanPham.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Thông tin sản phẩm");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 20));
		pnlTTSanPham.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		pnlTTSanPham.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlAnhSP = new JPanel();
		pnlAnhSP.setBackground(new Color(255, 255, 255));
		panel_2.add(pnlAnhSP);
		pnlAnhSP.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAnhSP = new JLabel("ảnh sản phảm đây");
		lblAnhSP.setOpaque(true);
		lblAnhSP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblAnhSP.setBackground(new Color(169, 169, 169));
		pnlAnhSP.add(lblAnhSP);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		pnlAnhSP.add(verticalStrut_1, BorderLayout.SOUTH);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		pnlAnhSP.add(horizontalStrut_2, BorderLayout.WEST);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		pnlAnhSP.add(horizontalStrut_3, BorderLayout.EAST);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		pnlAnhSP.add(verticalStrut_2, BorderLayout.NORTH);
		
		JPanel pnlThongTinSP = new JPanel();
		pnlThongTinSP.setBackground(new Color(255, 255, 255));
		panel_2.add(pnlThongTinSP);
		pnlThongTinSP.setLayout(new GridLayout(0, 4, 15, 25));
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm");
		lblMaSP.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblMaSP);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tên sản phẩm");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Đơn giá");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Giá nhập");
		lblNewLabel_10.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Chất liệu");
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nhà cung cấp");
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Số trang");
		lblNewLabel_9.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Tác giả");
		lblNewLabel_11.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_11);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nhà xuất bản");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		pnlThongTinSP.add(textField_3);
		textField_3.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBackground(new Color(255, 255, 255));
		pnlTTSanPham.add(verticalStrut, BorderLayout.SOUTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(17);
		horizontalStrut.setBackground(new Color(255, 255, 255));
		pnlTTSanPham.add(horizontalStrut, BorderLayout.EAST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(17);
		horizontalStrut_1.setBackground(new Color(255, 255, 255));
		pnlTTSanPham.add(horizontalStrut_1, BorderLayout.WEST);
	}
}
